create table student(
    stu_no char(9),
    stu_name VARCHAR2(12),
    stu_dept varchar2(20),
    stu_grade number(1),
    stu_class char(1),
    stu_gender char(1),
    stu_height number(5, 2),
    stu_weight number(5, 2),
    constraint p_stu_no primary key(stu_no)
);

create table subject(
    sub_no char(3),
    sub_name varchar2(30),
    sub_prof varchar2(12),
    sub_grade number(1),
    sub_dept varchar2(20),
    constraint p_sub_no primary key(sub_no)
);

create table enrol (
    sub_no char(3),
    stu_no char(5),
    enr_grade number(3),
    constraint p_course primary key(sub_no, stu_no)
);

-- acknowledge table
desc student;
select * from student;

-- add data
insert into student values(20153075, '옥한빛', '기계', 1, 'C', 'M', 177, 80);
insert into student values(20153088, '이태연', '기계', 1, 'C', 'F', 162, 50);
insert into student values(20143054, '유가인', '기계', 2, 'C', 'F', 154, 47);
insert into student values(20152088, '조민우', '전기전자', 1, 'C', 'M', 188, 90);
insert into student values(20142021, '심수정', '전기전자', 2, 'A', 'F', 167, 45);
insert into student values(20132003, '박희철', '전기전자', 3, 'B', 'M', null, 80);
insert into student values(20151062, '김인중', '컴퓨터정보', 1, 'B', 'M', 166, 67);
insert into student values(20141007, '진현무', '컴퓨터정보', 2, 'A', 'M', 174, 64);
insert into student values(20131001, '김종헌', '컴퓨터정보', 3, 'C', 'M', null, 72);
insert into student values(20131025, '옥성우', '컴퓨터정보', 3, 'A', 'M', 172, 63);

