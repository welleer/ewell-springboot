

--患者表
create table patient(
clinic_no varchar2(20) not null,
english_name varchar2(20) not null,
chinese_name varchar2(20) not null,
gender varchar2(20) not null,
age varchar2(20) not null,
card_number varchar2(20) not null,
appointment varchar2(20) not null,
status varchar2(20) not null
);

--病历表
create table medicalRecords(
clinic_no varchar2(20) not null,
chief_complaint varchar2(20) not null,
history_of_present varchar2(20) not null,
history_marriage varchar2(20) not null,
history_personal varchar2(20) not null,
physical_exam varchar2(20) not null
);

--诊断表
create table diags(
clinic_no varchar2(20) not null,
diag varchar2(20) not null,
instruction varchar2(20) not null,
diagdate varchar2(20) not null,
diagtype varchar2(20) not null
);


--处方表
create table prescription(
clinic_no varchar2(20) not null,
tablet_id varchar2(20) not null,
create_date varchar2(20) not null,
alias varchar2(20) not null,
drug_name varchar2(20) not null,
dose varchar2(20) not null,
route varchar2(20) not null,
freq varchar2(20) not null

);

--药物表
create table medicine(
drug_id varchar2(20) not null,
drug_name varchar2(20) not null,
alias varchar2(20) not null,
therapeutic_class varchar2(20) not null,
tablet_ids varchar2(20) not null

);


--tablets表
create table tablets(
tablet_id varchar2(20) not null,
intro varchar2(20) not null,
dose varchar2(20) not null,
route varchar2(20) not null,
freq varchar2(20) not null

);

