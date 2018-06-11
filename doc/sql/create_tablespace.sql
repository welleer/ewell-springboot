
declare
  v_rowcount integer;
begin
  select count(*) into v_rowcount from dual where exists(select * from v$tablespace a where a.name = upper('liwei_DATA'));
  if v_rowcount > 0 then
    execute immediate 'DROP TABLESPACE liwei_DATA INCLUDING CONTENTS AND DATAFILES';
  end if;
end;
/
CREATE TABLESPACE liwei_DATA DATAFILE '/u01/app/oracle/oradata/xe/liwei/liweidat.dbf' SIZE 100M
AUTOEXTEND ON NEXT 500M
EXTENT MANAGEMENT LOCAL
SEGMENT SPACE MANAGEMENT AUTO;
------------------------------

declare
  v_rowcount integer;
begin
  select count(*) into v_rowcount from dual where exists(select * from v$tablespace a where a.name = upper('liwei_IDX'));
  if v_rowcount > 0 then
    execute immediate 'DROP TABLESPACE liwei_IDX INCLUDING CONTENTS AND DATAFILES';
  end if;
end;
/
CREATE TABLESPACE liwei_IDX DATAFILE '/u01/app/oracle/oradata/xe/liwei/liweiidx.dbf' SIZE 20M
AUTOEXTEND ON NEXT 100M
EXTENT MANAGEMENT LOCAL
SEGMENT SPACE MANAGEMENT AUTO;
------------------------------

COMMIT;
/
