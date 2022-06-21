-- p.418 PL/SQL
SET SERVEROUTPUT ON;

BEGIN
	DBMS_OUTPUT.PUT_LINE('HELLO');
END;
/

-- P.432
DECLARE
  V_NUMBER NUMBER := 13;
BEGIN
  IF MOD(V_NUMBER, 2) = 1 THEN
    DBMS_OUTPUT.PUT_LINE('홀수입니다!');
    
  ELSE
    DBMS_OUTPUT.PUT_LINE('짝수입니다!');
  END IF;
END;
/

-- V_CON 변수에 1을 대입
-- V_CON 1이상이면 '1이상', 1미만이면 1보다 작다, 1과 같으면 같다
DECLARE
  V_CON NUMBER := 1;
BEGIN
  IF V_CON >1 THEN
    DBMS_OUTPUT.PUT_LINE('1이상');
  ELSIF V_CON < 1 THEN
    DBMS_OUTPUT.PUT_LINE('1미만');
  ELSIF V_CON = 1 THEN
    DBMS_OUTPUT.PUT_LINE('1과 같다');
  END IF;
END;
/

--P.447
DECLARE
  V_SCORE NUMBER := 87;
BEGIN
  CASE
    WHEN V_SCORE >= 90 THEN DBMS_OUTPUT.PUT_LINE('A학점');
    WHEN V_SCORE >= 80 THEN DBMS_OUTPUT.PUT_LINE('B학점');
    WHEN V_SCORE >= 70 THEN DBMS_OUTPUT.PUT_LINE('C학점');
    WHEN V_SCORE >= 60 THEN DBMS_OUTPUT.PUT_LINE('D학점');
    ELSE DBMS_OUTPUT.PUT_LINE('F학점');
  END CASE;
END;
/

-- 기본 loop
DECLARE
  V_NUM NUMBER := 0;
BEGIN
  LOOP
    DBMS_OUTPUT.PUT_LINE('현재 V_NUM : ' || V_NUM);
    V_NUM := V_NUM + 1;
    EXIT WHEN V_NUM > 4;
  END LOOP;
END;
/

-- 기본 loop
DECLARE
  V_CNT NUMBER := 0;
  V_SUM NUMBER := 0;
BEGIN
  LOOP
    V_CNT := V_CNT + 1;
    V_SUM := V_SUM + V_CNT;
    DBMS_OUTPUT.PUT_LINE(V_SUM);
    EXIT WHEN V_CNT = 10;
  END LOOP;
  DBMS_OUTPUT.PUT_LINE('총 합: ' ||V_SUM);
END;
/

-- FOR LOOP
DECLARE
  V_CNT NUMBER;
  V_SUM NUMBER := 0;
BEGIN
  FOR V_CNT IN 1..10 LOOP
    V_SUM := V_SUM + V_CNT;
    DBMS_OUTPUT.PUT_LINE(V_SUM);
  END LOOP;
END;
/

-- WHILE LOOP
DECLARE
  V_CNT NUMBER := 0;
  V_SUM NUMBER := 0;
BEGIN
  WHILE V_CNT < 10 LOOP
    V_CNT := V_CNT + 1;
    V_SUM := V_SUM + V_CNT;
    DBMS_OUTPUT.PUT_LINE(V_SUM);
  END LOOP;
END;
/

-- P.444 Q1
--숫자 1부터 10까지 중 홀수만 출력
BEGIN
  FOR i IN 1..10 LOOP
    CONTINUE WHEN MOD(i, 2)=0;
    DBMS_OUTPUT.PUT_LINE('현재 i의 값 : '|| i);
    END LOOP;
  END;
/


-- P.481 저장 서브프로그램
-- 프로시저 생성
CREATE OR REPLACE PROCEDURE pro_noparam
IS
  V_EMPNO NUMBER(4) := 7788;
  V_ENAME VARCHAR2(10);
BEGIN
  V_ENAME := 'SCOTT';
  DBMS_OUTPUT.PUT_LINE('V_EMPNO: '|| V_EMPNO);
  DBMS_OUTPUT.PUT_LINE('V_ENAME: '|| V_ENAME);
END;
/

-- 프로시저 실행
EXECUTE pro_noparam;

SELECT * FROM STUDENT;

-- 파라미터 사용하는 프로시저
-- 학번으로 검색하여, 같은 학번 학생의 학년을, 입력받은 학년으로 변경한다
CREATE OR REPLACE PROCEDURE TEST2
(
  V_STU_NO IN STUDENT.STU_NO%TYPE,    -- 학생번호 입력받음
  V_STU_GRADE IN STUDENT.STU_GRADE%TYPE  
)
IS
BEGIN
  UPDATE STUDENT
  SET STU_GRADE = V_STU_GRADE
    WHERE STU_NO = V_STU_NO;
END TEST2;
/

-- 실행
EXECUTE TEST2(20153075, 3);

-- 프로시저 생성
CREATE OR REPLACE PROCEDURE TEST3
(
  V_STU_NO IN STUDENT.STU_NO%TYPE,
  V_STU_NAME OUT STUDENT.STU_NAME%TYPE
)

IS
BEGIN
  SELECT STU_NAME
    INTO V_STU_NAME   -- STU_NAME을 V_STU_NAME에 대입하겠다
  FROM STUDENT
    WHERE STU_NO = V_STU_NO;
END TEST3;
/

-- 이름을 전달받아, 출력하기 (변수 정의)
VARIABLE D_STU_NAME VARCHAR2(10);
EXECUTE TEST3(20153075, :D_STU_NAME);

PRINT D_STU_NAME;
-- P.491 참고
DECLARE 
  D_STU_NAME STUDENT.STU_NAME%TYPE;
BEGIN
  TEST3(20153075, D_STU_NAME);      -- 프로시저 호출
  DBMS_OUTPUT.PUT_LINE('D_STU_NAME: '|| D_STU_NAME);
END;
/

--
CREATE OR REPLACE PROCEDURE TEST4
(
  V_SUB_NO IN ENROL.SUB_NO%TYPE,
  V_STU_NO IN ENROL.STU_NO%TYPE,
  V_ENR_GRADE IN OUT ENROL.ENR_GRADE%TYPE
)
IS
BEGIN
  UPDATE ENROL
    SET ENR_GRADE = ENR_GRADE+V_ENR_GRADE
    WHERE STU_NO = V_STU_NO AND SUB_NO = V_SUB_NO;
    
  SELECT ENR_GRADE
    INTO V_ENR_GRADE
    FROM ENROL
    WHERE STU_NO = V_STU_NO AND SUB_NO = V_SUB_NO;
END TEST4;
/

-- DROP PROCEDURE TEST4;
-- 
VARIABLE D_ENR_GRADE NUMBER
BEGIN 
  :D_ENR_GRADE := 10;
END;
/

SELECT * FROM ENROL;

--
EXECUTE TEST4(101, 20131001, :D_ENR_GRADE);
PRINT D_ENR_GRADE;


-- P.444 Q2
DECLARE
  V_DEPTNO DEPT.DEPTNO%TYPE := 10;
BEGIN
  CASE V_DEPTNO
    WHEN 10 THEN DBMS_OUTPUT.PUT_LINE('부서명: ACCOUNTING');
    WHEN 20 THEN DBMS_OUTPUT.PUT_LINE('부서명: RESEARCH');
    WHEN 30 THEN DBMS_OUTPUT.PUT_LINE('부서명: SALES');
    WHEN 40 THEN DBMS_OUTPUT.PUT_LINE('부서명: OPERATIONS');
    ELSE  DBMS_OUTPUT.PUT_LINE('N/A');
  END CASE;
END;
/
    
-- p.518 q1-1
CREATE OR REPLACE PROCEDURE PRO_DEPT_IN
(
  V_DEPTNO IN OUT DEPT.DEPTNO%TYPE,
  V_DNAME OUT DEPT.DNAME%TYPE,
  V_LOC OUT DEPT.LOC%TYPE
)
IS
BEGIN
  SELECT DEPTNO, DNAME, LOC
    INTO  V_DEPTNO, V_DNAME, V_LOC
  FROM DEPT
  WHERE DEPTNO = V_DEPTNO;
END PRO_DEPT_IN;
/

-- DROP PROCEDURE PRO_DEPT_IN;

-- Q1-2
DECLARE
  V_DEPTNO DEPT.DEPTNO%TYPE;
  V_DNAME DEPT.DNAME%TYPE;
  V_LOC DEPT.LOC%TYPE;
BEGIN
  V_DEPTNO := 10;
  PRO_DEPT_IN(V_DEPTNO, V_DNAME, V_LOC);
  DBMS_OUTPUT.PUT_LINE('부서 번호: '|| V_DEPTNO);
  DBMS_OUTPUT.PUT_LINE('부서 이름: '|| V_DNAME);
  DBMS_OUTPUT.PUT_LINE('부서 지역: '|| V_LOC);
END;
/



-- 시퀀스 생성
CREATE SEQUENCE SEQ1
  INCREMENT BY 1
  START WITH 201
  MAXVALUE 999;

-- DROP PROCEDURE test5;

-- 저장 프로시저 생성
CREATE PROCEDURE test5
  (vV_sub_name in subject.sub_name%type,
  vV_sub_prof in subject.sub_prof%type,
  vV_sub_grade in subject.sub_grade%type,
  vV_sub_dept in subject.sub_dept%type)
IS
BEGIN
  INSERT INTO SUBJECT VALUES (SEQ1.NEXTVAL, VV_SUB_NAME, VV_SUB_PROF, VV_SUB_GRADE, VV_SUB_DEPT);
  COMMIT;
END TEST5;
/

SELECT * FROM SUBJECT;
EXECUTE TEST5('PL/SQL', '홍길동', 3, '컴퓨터정보');


-- 비디오 대여 가게
create table cust(
  c_no number(3) not null,
  c_name varchar2(10),
  c_flag number(1),
  c_addr varchar2(20),
  c_phone varchar2(20),
  constraint c_no_pk primary key(c_no)
);

insert into cust values(101,'김진수',1,'서울 성북구','02-455-5544');
insert into cust values(102,'김영희',2,'서울 강서구','02-299-2565');
insert into cust values(103,'이영수',3,'서울 서초구','02-555-5555');
insert into cust values(104,'김진숙',1,'서울 동대문구','02-444-4444');

create table video(
  V_NO NUMBER(1) not null,
  constraint pk_v_no primary key(V_NO),
  V_NAME varchar2(20),
  V_ACTOR varchar2(10),
  V_GROUP varchar2(10)
);
insert into video values(1,'극한직업','류승룡','코미디');
insert into video values(2,'기생충','송강호','드라마');
insert into video values(3,'엑시트','조정석','코미디');
insert into video values(4,'봉오동전투','유해진','액션');
insert into video values(5,'나쁜녀석들','마동석','액션');
insert into video values(6,'82년생김지영','정유미','드라마');

create table rent(
  r_no number(1) constraint pk_rent primary key,
  r_date date,
  c_no number(3) constraint c_no_fk references cust(c_no),
  r_rentfee number(5),
  v_no number(1) constraint v_no_fk references video(v_no)
);

insert into rent values(1,'2020-07-30',101,1000,1);
insert into rent values(2,'2020-07-30',101,500,2);
insert into rent values(3,'2020-08-2',103,500,5);
insert into rent values(4,'2020-08-2',102,1000,6);
insert into rent values(5,'2020-08-2',102,1000,3);
insert into rent values(6,'2020-08-3',104,2000,2);



-- 고객 테이블의 구조를 검색해라. (3점)
DESC CUST;

-- 고객 테이블의 고객이름, 등급, 주소를 검색해라. (3점)
SELECT C_NAME, C_FLAG, C_ADDR FROM CUST;

-- 비디오이름과 고객번호, 대여일(반납일)을 equi join, natural join, join~using을 다 써서 검색해라. (10점)
SELECT V_NAME, C_NO, R_DATE FROM VIDEO V, RENT R WHERE V.V_NO = R.V_NO;
SELECT V_NAME, C_NO, R_DATE FROM VIDEO NATURAL JOIN RENT;
SELECT V_NAME, C_NO, R_DATE FROM VIDEO JOIN RENT USING(V_NO);

-- 이영수 고객이 대여한 비디오이름과 주연배우를 검색해라. (equi join) (3점)
SELECT V_NAME, V_ACTOR 
  FROM  VIDEO V, RENT R, CUST C
WHERE V.V_NO = R.V_NO  AND R.C_NO = C.C_NO
  AND C.C_NAME = '이영수';

-- 기생충을 대여한 고객들의 고객번호와 이름을 검색해라. (3점)
SELECT C.C_NO, C.C_NAME
  FROM  VIDEO V, RENT R, CUST C
WHERE V.V_NO = R.V_NO  AND R.C_NO = C.C_NO
  AND V.V_NAME='기생충';

-- 등급이 1등급인 고객이 대여한 비디오 이름을 모두 검색해라. (3점)
SELECT V.V_NAME, C.C_NAME
  FROM  VIDEO V, RENT R, CUST C
WHERE V.V_NO = R.V_NO  AND R.C_NO = C.C_NO
  AND C.C_FLAG=1;

-- 대여료가 2000원 이상인 고객의 수를 검색해라. (3점)
SELECT COUNT(C_NO) FROM RENT WHERE R_RENTFEE >= 2000;

SELECT SUM(R_RENTFEE) FROM RENT GROUP BY C_NO;

-- 고객번호가 103보다 작은 값만 나오도록 대여테이블을 복사하여 a_rent 테이블을 만든다. (5점)
CREATE TABLE A_RENT 
  AS SELECT * FROM RENT WHERE C_NO < 103;

SELECT * FROM A_RENT;
DESC A_RENT;
-- 위에서 만든 a_rent테이블에 (9, 2020-08-01, 101, 1000, 3)을 삽입한다. (3점)
INSERT INTO A_RENT VALUES (9, TO_DATE('2020-08-01', 'YYYY/MM/DD'), 101, 1000,3);

-- 대여테이블의 ‘10’ 으로 시작하는 고객 데이터를 a_rent 테이블에 삽입한후, 내용을 확인해라. (5점)
INSERT INTO A_RENT SELECT * FROM RENT WHERE SUBSTR(C_NO, 1,2) = 10; 
INSERT INTO A_RENT SELECT * FROM RENT WHERE C_NO LIKE '10%';   

-- 고객번호를 입력으로 고객이름을 검색하는 프로시저를 만들어라. 
CREATE OR REPLACE PROCEDURE PRO_A_RENT
(
  V_C_NO IN CUST.C_NO%TYPE
)
IS
  V_C_NAME CUST.C_NAME%TYPE;
BEGIN
  SELECT C_NAME 
    INTO V_C_NAME
  FROM CUST WHERE C_NO = V_C_NO;
  DBMS_OUTPUT.PUT_LINE('V_C_NAME: '|| V_C_NAME);
END PRO_A_RENT;
/

DROP PROCEDURE PRO_A_RENT;
--
EXECUTE PRO_A_RENT(101);
