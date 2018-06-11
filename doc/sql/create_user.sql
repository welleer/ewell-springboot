
declare
  v_rowcount integer;
begin
  select count(*) into v_rowcount from dual where exists(select * from all_users a where a.username = upper('liwei'));
  if v_rowcount > 0 then
 	 execute immediate 'DROP USER liwei CASCADE';
  end if;
end;
/
CREATE USER liwei IDENTIFIED BY  liwei DEFAULT TABLESPACE liwei_DATA TEMPORARY TABLESPACE TEMP;
GRANT CONNECT TO liwei;
GRANT RESOURCE TO liwei;
GRANT DBA TO liwei;
GRANT UNLIMITED TABLESPACE TO liwei;
GRANT create any table TO liwei;
GRANT select any table TO liwei;
GRANT drop any table TO liwei;
GRANT create any index TO liwei;
GRANT delete any table TO liwei;
GRANT insert any table TO liwei;
GRANT update any table TO liwei;
GRANT create any directory TO liwei;
------------------------------
COMMIT;
/
