-- 10번과 20번부서 사원들 중 최고 급여를 받는 사원의 사원번호, 사원이름
SELECT EMPNO, ENAME
    FROM EMP1
  WHERE SAL IN (SELECT MAX(SAL) 
                    FROM EMP1
                  GROUP BY DEPTNO
                HAVING DEPTNO IN(10, 20));

-- 30번 부서 사원 중 최저 급여를 받는 사원의 사원번호, 사원이름, 급여를 출력
SELECT EMPNO, ENAME, SAL
    FROM EMP1
  WHERE SAL IN (SELECT MIN(SAL)
                    FROM EMP1                  
                  GROUP BY DEPTNO
                HAVING DEPTNO = 30);

-- 전체 사원들 중 최고 커미션을 받는 사원의 사원번호, 사원이름, 커미션을 검색
SELECT EMPNO, ENAME, COMM
    FROM EMP1
  WHERE COMM = (SELECT MAX(COMM) FROM EMP1);

-- 전체 사원들 중 최저 커미션을 받는 사원의 사번과 이름, 커미션 검색
SELECT EMPNO, ENAME, COMM
    FROM EMP1
  WHERE COMM IN (SELECT MIN(COMM) FROM EMP1);
  
-- 11. FORD 사원과 같은 급여를 받는 사원의 사원번호를검색하라. (부질의)
SELECT EMPNO FROM EMP1
  WHERE SAL = (SELECT SAL FROM EMP1 
                WHERE ENAME='FORD')
                  AND ENAME <> 'FORD';

-- 12. 부서이름이 ‘SALES’이면서 사원직무가 ‘MANAGER’인 사원의 사원번호, 사원이름을 
-- 사원이름 순으로 검색하라. (natural join)
SELECT EMPNO, ENAME, DNAME AS 부서명, JOB AS 직무
    FROM EMP1 NATURAL JOIN DEPT1
  WHERE DNAME = 'SALES' 
    AND JOB = 'MANAGER'
ORDER BY ENAME;

-- 13. SCOTT 사원보다 많은 급여를 받는 사원 정보를검색하라. (부질의)
SELECT * FROM EMP1
  WHERE SAL > (SELECT SAL FROM EMP1 WHERE ENAME = 'SCOTT');

-- 14. ALLEN 사원보다 적은 급여를 받는 사원 정보를검색하라. (부질의)
SELECT * FROM EMP1
  WHERE SAL < (SELECT SAL FROM EMP1 WHERE ENAME = 'ALLEN');

-- 15. 전체 사원의 평균 급여보다 급여가 많은 사원 정보를 검색하라. (부질의)
SELECT * FROM EMP1
  WHERE SAL > (SELECT AVG(SAL) FROM EMP1);

-- 16. CHICAGO 지역에 위치하는 부서에 근무하는사원 정보를 검색하라. (부질의)
SELECT * FROM EMP1
  WHERE DEPTNO = (SELECT DEPTNO FROM DEPT1 WHERE LOC = 'CHICAGO');
SELECT * 
    FROM EMP1 NATURAL JOIN DEPT1
  WHERE LOC = 'CHICAGO';
SELECT * 
    FROM EMP1 NATURAL JOIN DEPT1
  WHERE LOC IN (SELECT LOC FROM DEPT1 WHERE LOC = 'CHICAGO');
  
-- 각 학과의 평균 키 검색
SELECT TRUNC(AVG(STU_HEIGHT))
    FROM STUDENT
  GROUP BY STU_DEPT;
  
SELECT * FROM B_STUDENT;
-- 기존의 student 테이블을 복사함
create table a_student 
    as select * from student 
  where stu_dept in ('기계', '전기전자');
--
create table b_student 
    as select * from student 
  where stu_dept in ('전기전자', '컴퓨터정보');
  
-- 테이블 합치기
-- 중복제거되면서 합쳐짐 (합집합)
SELECT * FROM A_STUDENT UNION SELECT * FROM B_STUDENT;
-- 중복 포함되어 합쳐짐 (합집합)
SELECT * FROM A_STUDENT UNION ALL SELECT * FROM B_STUDENT;
-- 공통되는 값만 (교집합)
SELECT * FROM A_STUDENT INTERSECT SELECT * FROM B_STUDENT;
-- A에는 속하고 B에는 속하지 않는 값 (차집합)
SELECT * FROM A_STUDENT MINUS SELECT * FROM B_STUDENT;


-- review
-- 컴퓨터개론 과목 수강생
SELECT STU_NO, STU_NAME, SUB_NAME
    FROM STUDENT JOIN ENROL USING (STU_NO) 
      JOIN SUBJECT USING (SUB_NO)
  WHERE SUB_NAME='컴퓨터개론';
--
SELECT S.STU_NO, S.STU_NAME, SUBJECT.SUB_NAME
    FROM STUDENT S, ENROL E, SUBJECT
  WHERE S.STU_NO = E.STU_NO
    AND E.SUB_NO = SUBJECT.SUB_NO
    AND SUB_NAME='컴퓨터개론';

-- 컴퓨터정보 학과와 같은 반인, 다른 학과의 학생 정보 출력
SELECT STU_CLASS AS 반, STU_DEPT AS 학과, STU_NAME AS 이름
    FROM STUDENT 
  WHERE STU_CLASS IN (SELECT STU_CLASS FROM STUDENT WHERE STU_DEPT='컴퓨터정보');

-- 모든 학과의 평균 키보다 큰 학생  
SELECT * FROM STUDENT
  WHERE STU_HEIGHT > ALL (SELECT AVG(STU_HEIGHT) FROM STUDENT GROUP BY STU_DEPT);

-- 컴퓨터학과의 최소 키와 비교해 최소 키가 더 큰 학과의 학과명과 최소 키 출력
SELECT STU_DEPT, MIN(STU_HEIGHT)
    FROM STUDENT
  GROUP BY STU_DEPT
HAVING MIN(STU_HEIGHT) > (SELECT MIN(STU_HEIGHT) FROM STUDENT WHERE STU_DEPT='컴퓨터정보');

-- 101번 과목 수강한 학생 정보 검색
SELECT * 
    FROM STUDENT NATURAL JOIN SUBJECT
  WHERE SUB_NO=101;
SELECT *
    FROM STUDENT 
  WHERE STU_NO IN (SELECT STU_NO FROM ENROL WHERE SUB_NO=101);

-- P.266
-- 2015학번보다 작은 값들만 테이블 복사생성
CREATE TABLE A_ENROL 
  AS SELECT * FROM ENROL WHERE STU_NO < 20150000;

-- DROP TABLE A_ENROL;
-- DELETE FROM A_ENROL WHERE SUB_NO = 108;
SELECT * FROM A_ENROL;

-- 데이터 추가
INSERT INTO A_ENROL VALUES (108, 20151062, 92);
INSERT INTO A_ENROL VALUES (109, 20152088, 85);
-- 일부데이터 추가
INSERT INTO A_ENROL (SUB_NO, STU_NO) VALUES (110, 20152088);
INSERT INTO A_ENROL VALUES (111, 20153075, NULL);

-- 복수행 삽입
SELECT *
    FROM ENROL
  WHERE STU_NO LIKE '2015%';
-- 위 데이터를 A_ENROL 테이블에 추가한다
INSERT INTO A_ENROL
    SELECT * FROM ENROL WHERE STU_NO LIKE '2015%';
    
    
-- 학생테이블로부터 학년이 1 또는 2학년인 조건들만 복사하여 student1 테이블을 생성한다.
CREATE TABLE STUDENT1 AS SELECT * FROM STUDENT WHERE STU_GRADE IN(1, 2);

-- 과목테이블을 복사하여 subject1 테이블을 생성한다.
CREATE TABLE SUBJECT1 AS SELECT * FROM SUBJECT;

-- 수강테이블을 복사하여 enrol1 테이블을 생성한다.
CREATE TABLE ENROL1 AS SELECT * FROM ENROL;

SELECT * FROM STUDENT; 
-- 다 한 후 복사된 테이블의 내용을 확인한다.
SELECT * FROM STUDENT1;     SELECT * FROM SUBJECT1;     SELECT * FROM ENROL1;


-- 데이터 추가
-- 학번 20101059, 이름 조병준, 학과 컴퓨터정보, 학년 1, 반B, 키 164, 몸무게 70인남학생이 추가되었다.
INSERT INTO STUDENT1
    VALUES (20101059, '조병준', '컴퓨터정보', 1, 'B', 'M', 164, 70);

-- 학번 20102038, 이름 남지선, 학과 전기전자, 학년 1, 반C, 여학생이 추가되었다.
INSERT INTO STUDENT1 (STU_NO, STU_NAME, STU_DEPT, STU_GRADE, STU_CLASS, STU_GENDER)
    VALUES (20102038, '남지선', '전기전자', 1, 'C', 'F');
INSERT INTO STUDENT1 VALUES (20102038, '남지선', '전기전자', 1, 'C', 'F', NULL, NULL);

-- Student1 테이블에 학생 테이블의 3학년 학생들 데이터를 입력하라.
INSERT INTO STUDENT1
    SELECT * FROM STUDENT WHERE STU_GRADE = 3;
    
    
-- 데이터 수정하기
UPDATE A_ENROL
  SET ENR_GRADE = ENR_GRADE + 5;
  
-- 과목번호 101인 과목만 5점씩 증가
UPDATE A_ENROL
  SET ENR_GRADE = ENR_GRADE + 5
WHERE SUB_NO = 101;

-- 시스템분석설계 과목만 5점증가
UPDATE A_ENROL
  SET ENR_GRADE = ENR_GRADE + 5
WHERE SUB_NO = (SELECT SUB_NO FROM SUBJECT 
                  WHERE SUB_NAME='시스템분석설계');

               
-- 학번 20131001 반을 b로 바꿔라
UPDATE STUDENT1 
    SET STU_CLASS = 'B'
  WHERE STU_NO = 20131001;

-- 20152088 학생의 키가 2cm 자랐다
UPDATE STUDENT1
    SET STU_HEIGHT = STU_HEIGHT + 2
  WHERE STU_NO = 20152088;


-- DML 명령어 취소
ROLLBACK;
-- 영구반영
COMMIT;
SELECT * FROM A_ENROL;


-- 삭제
DELETE FROM A_ENROL WHERE STU_NO = 20131001;

-- 기계요소설계 과목의 과목번호 삭제
DELETE FROM A_ENROL
  WHERE SUB_NO = (SELECT SUB_NO FROM SUBJECT WHERE SUB_NAME ='기계요소설계');
  
DELETE FROM A_ENROL;
DROP TABLE A_ENROL;

SELECT * FROM STUDENT1;
SELECT * FROM SUBJECT1;
SELECT * FROM ENROL1;

-- 1.	20153088 학생(이태연)이 자퇴하였다.
DELETE FROM STUDENT1
  WHERE STU_NO = 20153088;

-- 2.	과목번호 112, 과목이름 자동화시스템,교수명 고종민,학년 3, 학과 기계가 추가되었다.
INSERT INTO SUBJECT1
  VALUES (112, '자동화시스템', '고종민', 3, '기계');

-- 3.	과목번호가 110에서 501로 변경되었다.
UPDATE SUBJECT1
    SET SUB_NO = 501
  WHERE SUB_NO = 110;

-- 4.	과목번호 101이 폐강되었다.
DELETE FROM SUBJECT1
  WHERE SUB_NO = 101;

-- 5.	enrol1테이블에서 subject1에 없는 과목번호를 999로 변경해라.
UPDATE ENROL1
    SET SUB_NO = 999
  WHERE SUB_NO NOT IN (SELECT SUB_NO FROM SUBJECT1);
  
-- 6.	enrol1테이블에서 student1 에 없는 학번을 99999999 로 변경해라.
UPDATE ENROL1
    SET STU_NO = 99999999
  WHERE STU_NO NOT IN (SELECT STU_NO FROM STUDENT1);

-- 7.	enrol1테이블에서 과목번호 999를 삭제하라.
DELETE FROM ENROL1
  WHERE SUB_NO = 999;

-- 8.	Enrol1테이블에서 학번 99999999 를 삭제하라.
DELETE FROM ENROL1
  WHERE STU_NO = 99999999;

ROLLBACK;
-- 트랜잭션
-- DDL 사용하면 자동으로 COMMIT 된다

SELECT * FROM B_STUDENT;
DELETE FROM B_STUDENT;

CREATE TABLE C_STUDENT (
    STU_NO NUMBER, 
    STU_NAME CHAR(10));
    