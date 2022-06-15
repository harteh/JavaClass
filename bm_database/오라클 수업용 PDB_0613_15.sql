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
    stu_no char(9),
    enr_grade number(3),
    constraint p_course primary key(sub_no, stu_no)
);

-- delete table
drop table enrol;

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

insert into subject values('111','데이터베이스','이재영',2,'컴퓨터정보');
insert into subject values('110','자동제어','정순정',2,'전기전자');
insert into subject values('109','자동화설계','박민영',3,'기계');
insert into subject values('101','컴퓨터개론','강종영',3,'컴퓨터정보');
insert into subject values('102','기계공작법','김태영',1,'기계');
insert into subject values('103','기초전자실험','김유석',1,'전기전자');
insert into subject values('104','시스템분석설계','강석현',3,'컴퓨터정보');
insert into subject values('105','기계요소설계','김명성',1,'기계');
insert into subject values('106','전자회로시험','최영민',3,'전기전자');
insert into subject values('107','CAD응용실습','구봉규',2,'기계');
insert into subject values('108','소프트웨어공학','권민성',1,'컴퓨터정보');

insert into enrol values('101','20131001',80);
insert into enrol values('104','20131001',56);
insert into enrol values('106','20132003',72);
insert into enrol values('103','20152088',45);
insert into enrol values('101','20131025',65);
insert into enrol values('104','20131025',65);
insert into enrol values('108','20151062',81);
insert into enrol values('107','20143054',41);
insert into enrol values('102','20153075',66);
insert into enrol values('105','20153075',56);
insert into enrol values('102','20153088',61);
insert into enrol values('105','20153088',78);

-- To check the table --
desc student;
desc subject;
desc enrol;

select * from student;
select * from subject;
select * from enrol;

-- 중복제거
select distinct stu_dept from student;

-- 6. 과목들의 과목번호와 과목이름을 검색하라.
select sub_no, sub_name from subject;
-- 7. 학생들의 학번과 이름, 성별을 검색하라.
select stu_no, stu_name, stu_gender from student;
-- 8. 학생들의 모든 정보를 검색하라.
select * from student;
-- 9. 학생들의 학번과 이름, 학년, 반을 검색하라.
select stu_no, stu_name, stu_grade, stu_class from student;
-- 10. 과목들의 과목이름과 교수이름을 검색하라.
select sub_name, sub_prof from subject;

-- 11. 과목번호, 학번, 점수를 검색하라.
select sub_no, stu_no, enr_grade from enrol;
-- 12. 학생들의 체중과 신장을 학번, 이름과 함께 검색하라.
select stu_weight, stu_height, stu_no, stu_name from student;
-- 13. 학생들의 학과 중복을 제거하고 검색하라.
select distinct stu_dept from student;
-- 14. 학생들의 성별 중복을 제거하고 검색하라.
select distinct stu_gender from student;
-- 15. 학생들의 학년 중복을 제거하고 검색하라.
select distinct stu_grade from student;

-- 결과 열에 별명 부여하기 > 대문자로 출력됨
select stu_no as ID, stu_name as name
from student;

-- || (concat 연결 연산자)
-- student 테이블로부터 학과, 이름을 뽑아내는데 하나의 결과값으로 출력
select stu_dept || stu_name as 학과성명 from student;
select stu_dept ||','|| stu_name ||'입니다' as "학과,성명" from student;

select stu_name as 이름, stu_dept as 학과, stu_class as 반, stu_grade as 학년
from student
where stu_dept = '컴퓨터정보' and stu_grade = 2;

-- 범위 조건 (between~and)
select *
from student
where stu_weight between 60 and 70;

select *
from student
where stu_no between 20140001 and 20149999;

-- % : 0개 이상의 문자
-- _ : 1개의 문자

select stu_no, stu_name, stu_dept
from student
where stu_name like '김%';

select stu_no, stu_name, stu_dept
from student
where stu_name like '_수%';
-- 성은 상관없고 두번째글자가 수 인 학생 추출

select * 
from student
where stu_no like '2014%';

-- 0614
select * from student;     select * from subject;     select * from enrol;

select stu_name, stu_dept from student where stu_dept = '컴퓨터정보';
select * from student where stu_weight BETWEEN 60 and 70;
select stu_name from student where stu_name like '김%';

-- 연산가능
select enr_grade, enr_grade+10 from enrol;
select enr_grade as 학점, enr_grade+10 as 상향조정 from enrol;

-- null
select stu_height from student where stu_height is null;
select stu_height from student where stu_height is not null;

-- 키를 100으로 나눠서 추출
select stu_height/100 from student;

select stu_no as 학번, stu_name as 이름, stu_dept as 학과
from student
where stu_dept in ('기계', '컴퓨터정보');

-- 16. 학생들의 학과, 학년 중복을 제거하고 검색하라.
select distinct stu_dept, stu_grade from student;
--17. 학생들의 학과, 반 중복을 제거하고 검색하라.
select distinct stu_dept,stu_class from student;
--18. 학생들의 체중을 5만큼 증가시킨 값을 검색하라. 
select stu_weight+5 from student;
--19. 학생들의 체중을 5만큼 감소시킨 값을 검색하라. 
select stu_weight-5 from student;
--20. 학생들의 학번과 이름을 별칭 "학번", "이름"으로 부여하여 검색하라.
select stu_no as 학번, stu_name as 이름 from student;
​
--21. 수강(enrol)테이블의 모든 정보를 검색하라.
select * from enrol;
--22. 학생 테이블에서 학과명과 이름을 합쳐서 검색하라.(||)
select stu_dept || stu_name from student;
--23. 학생의 이름과 학과를 '컴퓨터정보과 옥한빛입니다'식으로 검색하라.
select stu_dept ||' '|| stu_name||'입니다' from student;
--24. 컴퓨터정보 학생들을 검색하라.
select * from student where stu_dept = '컴퓨터정보';
--25. 기계과 학생들을 검색하라.
select * from student where stu_dept = '기계';
select * from student where stu_dept<>'기계';

-- 26. 전기전자과 학생들을 검색하라.
select * from student where stu_dept = '전기전자';
-- 27. 신장이 170이상인 학생들을 검색하라.
select * from student where stu_height >= '170';
-- 28. 체중이 65이상인 학생들을 검색하라.
select * from student where stu_weight >= '65';
-- 29. 기계 학생들의 학번, 이름을 검색하라.
select stu_no, stu_name from student where stu_dept = '기계';
-- 30. 컴퓨터정보 학생들의 학번, 이름을 검색하라.
select stu_no, stu_name from student where stu_dept = '컴퓨터정보';
​
-- 31. 남학생의 이름을 검색하라.
select stu_name from student where stu_gender<>'F';
-- 32. 전기전자과 이외 학생들의 모든 정보를 검색하라.
select * from student where stu_dept<>'전기전자';
-- 33. 점수가 80점 이상인 학생들의 학번을 검색하라.
select * from enrol where enr_grade >= '80';
-- 34. '김인중'학생의 모든 정보를 검색하라.
select * from student where stu_name like '김인중';
select * from student where stu_name = '김인중';
-- 35. '기계'과 이고 2학년인 학생들의 모든 정보를 검색하라. 
select * from student where stu_dept='기계' and stu_grade=2;

-- 36. 성별이 여학생이며, 체중이 60이하인 학생을 모두 검색하라.
select * from student where stu_gender='F' and stu_weight <= 60;
-- 37.'컴퓨터정보'외에 1학년 학생들의 이름을 검색하라.
select * from student where stu_dept<>'컴퓨터정보' and stu_grade =1;
-- 38. 학과 중 '기계'이외의 학과를 검색하라.
select stu_dept from student where stu_dept<>'기계';
select stu_dept from student where stu_dept not in '기계';
-- 39. 컴퓨터정보과 2학년 A반 학생의 이름을 검색하라.
select * from student where stu_dept='컴퓨터정보' and stu_grade =2 and stu_class='A';
-- 40. 신장이 160이상이며 170이하인 학생의 학번과 이름을 검색하라
select stu_no, stu_name from student where stu_height>= 160 and stu_height<=170;
select stu_no, stu_name from student where stu_height between 160 and 170;


-- 정렬
SELECT STU_NO, STU_NAME FROM STUDENT ORDER BY STU_HEIGHT;

SELECT STU_NO, STU_NAME, STU_DEPT, STU_WEIGHT-5 AS WEI FROM STUDENT
ORDER BY WEI;

SELECT STU_NO, STU_NAME, STU_DEPT, STU_WEIGHT-5 AS WEI FROM STUDENT
ORDER BY 2;

-- 학과별 체중 순 정렬
SELECT STU_NO, STU_NAME, STU_DEPT, STU_WEIGHT-5 AS WEI FROM STUDENT
ORDER BY STU_DEPT, WEI;

SELECT STU_NO, STU_NAME, STU_DEPT, STU_WEIGHT-5 AS WEI FROM STUDENT
ORDER BY STU_DEPT, WEI DESC;


-- 숫자형 함수
SELECT ROUND (345.678) FROM DUAL;
SELECT ROUND (345.678, 2) FROM DUAL;
SELECT ROUND (345.678, -1) FROM DUAL;

SELECT TRUNC (123.456, 2) FROM DUAL;    -- 123.45
SELECT TRUNC (123.456, -1) FROM DUAL;   -- 120

SELECT MOD (10, 5) FROM DUAL;

-- 문자
SELECT UPPER ('korea') FROM DUAL;   -- 대문자 변환
SELECT INITCAP ('korea') FROM DUAL;   -- 첫글자만 대문자 변환
SELECT CONCAT('korea', 'japan') FROM DUAL;  -- koreajapan
SELECT SUBSTR ('korea', 2, 3) FROM DUAL;    -- 2번째 글자부터 3개 글자 추출

SELECT * FROM STUDENT;

-- 2013학번인 학생의 학번과 이름, 학과를 검색
SELECT STU_NO, STU_NAME FROM STUDENT WHERE STU_NO LIKE '2013%';
-- 1,3 학년학생들의 모든 정보
SELECT * FROM STUDENT WHERE STU_GRADE='1' OR STU_GRADE='3';
SELECT * FROM STUDENT WHERE STU_GRADE IN (1,3);
SELECT STU_NO, STU_NAME FROM STUDENT WHERE STU_NAME LIKE '김%';


-- 0615
-- 대, 소문자 : 학생 성별을 소문자로 검색
SELECT LOWER(STU_GENDER) FROM STUDENT;
-- 연결
SELECT STU_DEPT||STU_NAME FROM STUDENT;
SELECT CONCAT(STU_DEPT, STU_NAME) FROM STUDENT;
-- ~과 ~학년 ~입니다.
SELECT STU_DEPT||'과 '||STU_GRADE||'학년 '||STU_NAME||'입니다' FROM STUDENT;
-- SUBSTR
SELECT SUBSTR(STU_NAME, 1,2) FROM STUDENT;
SELECT STU_NAME, STU_DEPT, SUBSTR(STU_DEPT, 2,1) FROM STUDENT;


SELECT TO_CHAR( TO_NUMBER(1234.5678), '9999.999') FROM DUAL;
SELECT NVL(STU_HEIGHT, 0) FROM STUDENT;

SELECT NULLIF('A', 'A') FROM DUAL;  -- NULL
SELECT NULLIF('A', 'B') FROM DUAL;  -- A

-- NULLIF: 인수1과 인수2를 비교하여 값이 같으면 NULL, 아니면 인수2
-- NVL: 인수1이 NULL이면 인수2, NULL이 아니면 인수 1을 반환
SELECT NVL (NULLIF('A', 'A'), '널') FROM DUAL;
SELECT SUBSTR('정인성홍광택', 2,3) FROM DUAL;
-- 키를 첫번째 자리에서 반올림
SELECT STU_NO, STU_NAME, STU_HEIGHT, ROUND(STU_HEIGHT, -1) AS 반올림 FROM STUDENT;
-- 키는 두번째 자리에서 절삭함
SELECT STU_NO, STU_NAME, STU_HEIGHT, TRUNC(STU_HEIGHT, -2) AS 절삭 FROM STUDENT;
