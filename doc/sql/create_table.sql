

--患者表
create table patient(

id int not null,

name varchar(8) not null,

gender varchar2(2) not null,

age int not null,

no varchar2(20) not null,

status varchar2(2) not null

);


--病历表
create table medicalRecords(

string1 varchar2(20) not null,
string2 varchar2(20) not null,
string3 varchar2(20) not null,
string4 varchar2(20) not null,
string5 varchar2(20) not null

);

--处方表
create table prescription(

string1 varchar2(20) not null,
string2 varchar2(20) not null,
string3 varchar2(20) not null,
string4 varchar2(20) not null,
string5 varchar2(20) not null

);

--药物表
create table medicine(

string1 varchar2(20) not null,
string2 varchar2(20) not null,
string3 varchar2(20) not null,
string4 varchar2(20) not null,
string5 varchar2(20) not null

);
