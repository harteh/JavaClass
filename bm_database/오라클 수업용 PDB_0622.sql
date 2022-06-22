create table t_tbl(
  t_empno number(4) NOT NULL,
  t_ename varchar2(40),
  t_job varchar2(9),
  t_mgr number(4),
  t_hiredate date,
  t_sal number(7,2),
  t_comm number(7,2),
  t_deptno number(2),
  constraint t_tbl_pk primary key(t_empno)
);

-- 구조확인
DESC T_TBL;

-- 데이터 삽입
INSERT INTO T_TBL VALUES (7369, 'SMITH', 'CLERK', 7902, TO_DATE('1980-12-17', 'YYYY-MM-DD'), 800, NULL, 20);

-- 데이터 삭제
DELETE FROM T_TBL WHERE T_EMPNO = 7369;

-- 부서번호 20인 데이터만 뽑아 T_TBL 테이블에 삽입
INSERT INTO T_TBL (SELECT * FROM EMP1 WHERE DEPTNO = 20);
-- 확인
SELECT * FROM T_TBL;


create table t_tbl10(
  t_empno number(4) NOT NULL,
  t_ename varchar2(40),
  t_job varchar2(9),
  t_mgr number(4),
  t_hiredate date,
  t_sal number(7,2),
  t_comm number(7,2),
  t_deptno number(2),
  constraint t_tbl10_pk primary key(t_empno)
);

SELECT * FROM T_TBL10;
DESC T_TBL;
-- 부서번호 10인 데이터 추가
INSERT INTO T_TBL10 (SELECT * FROM EMP1 WHERE DEPTNO = 10);

-- T_TBL1 에 성별(GENDER) 열 삽입 CHAR(1)
ALTER TABLE T_TBL ADD(GENDER CHAR(1));

-- GENDER 자료변경
ALTER TABLE T_TBL MODIFY (GENDER VARCHAR2(10));

-- 성별 열 삭제
ALTER TABLE T_TBL DROP (GENDER);

-- T_TBL 테이블 데이터 모두 삭제
-- DELETE FROM T_TBL;
TRUNCATE TABLE T_TBL;
SELECT * FROM T_TBL;

-- EMP1 테이블과 구조가 같은 T_EMP2 테이블에 DEPTNO에 외래 키 제약조건 사용하여 생성
CREATE TABLE T_EMP2 (
  t_empno number(4) NOT NULL,
  t_ename varchar2(40),
  t_job varchar2(9),
  t_mgr number(4),
  t_hiredate date,
  t_sal number(7,2),
  t_comm number(7,2),
  t_deptno number(2) CONSTRAINT T_EMP2_FK REFERENCES DEPT1(DEPTNO),
  constraint T_EMP2_PK primary key(t_empno)  
);

-- T_EMP2 테이블에 외래 키 제약조건을 비활성화
ALTER TABLE T_EMP2 DISABLE CONSTRAINT T_EMP2_FK;
-- 다시 활성화
ALTER TABLE T_EMP2 ENABLE CONSTRAINT T_EMP2_FK;
-- 외래 키 제약조건 삭제
ALTER TABLE T_EMP2 DROP CONSTRAINT T_EMP2_FK;
DESC T_EMP2;

-- 테이블 삭제
DROP TABLE T_EMP2;

-- EMP1 테이블로 부터 20번 부서의 사원들로 이루워진 뷰 생성 V_EMP20
CREATE OR REPLACE VIEW V_EMP20
  AS (SELECT * FROM EMP1 WHERE DEPTNO = 20);

SELECT * FROM V_EMP20;

-- EMPNO, ENAME, DNAME을 가지는 뷰 생성 
CREATE OR REPLACE VIEW V_EMP_DEPT
  AS (SELECT E.EMPNO, E.ENAME, D.DNAME FROM EMP1 E, DEPT1 D WHERE E.DEPTNO = D.DEPTNO);

SELECT * FROM V_EMP_DEPT;  

-- 가장 최근에 입사한 5명의 사번, 이름, 입사일 검색
SELECT EMPNO, ENAME, HIREDATE 
    FROM (SELECT EMPNO, ENAME, HIREDATE FROM EMP1 ORDER BY HIREDATE DESC)
  WHERE HIREDATE IS NOT NULL
    AND ROWNUM <= 5;
    
-- 급여와 커미션을 합한 급액으로 상위 7명의 사번과 이름 검색
SELECT EMPNO, ENAME, SAL+NVL(COMM,0) AS 총급여
    FROM (SELECT EMPNO, ENAME, SAL, COMM FROM EMP ORDER BY 3 DESC)
    WHERE ROWNUM <= 7;

-- 부서별 평균 급여가 가장 높은 부서2개의 부서이름 뽑기
SELECT DNAME
    FROM (SELECT AVG(E.SAL), D.DNAME FROM EMP E, DEPT D
             WHERE E.DEPTNO = D.DEPTNO
            GROUP BY D.DNAME ORDER BY AVG(E.SAL) DESC)
  WHERE ROWNUM <= 2;
  

-- 신입사원을 채용하였다.
-- 사원번호, 사원이름, 사원직무, 상급자사원번호, 급여, 부서번호를 입력받아
-- 사원 테이블에 삽입하는 프로시저를 작성해라.

CREATE OR REPLACE PROCEDURE PRO_ADD_EMP1
(
  V_EMPNO IN EMP1.EMPNO%TYPE,
  V_ENAME IN EMP1.ENAME%TYPE, 
  V_JOB IN EMP1.JOB%TYPE,
  V_MGR IN EMP1.MGR%TYPE,
  V_SAL IN EMP1.SAL%TYPE,
  V_DEPTNO  IN EMP1.DEPTNO%TYPE
)
IS
BEGIN
  INSERT INTO EMP1
    VALUES (V_EMPNO, V_ENAME, V_JOB, V_MGR, NULL, V_SAL, NULL, V_DEPTNO);
  COMMIT;
END PRO_ADD_EMP1;
/
-- 지정하지 않은 값은 NULL 혹은 초기값을 줘야한다

EXECUTE PRO_ADD_EMP1(9994, 'HOHO', 'JOP1', 4999, 7000, 20);

-- 부서번호 변경하는 프로시저
-- EMP 테이블에서 UPDATE
-- 입력된 사원번호가 같을 때 부서번호 변경하시오

CREATE OR REPLACE PROCEDURE PRO_MODIFY_EMP1
(  
  V_EMPNO IN EMP1.EMPNO%TYPE,
  V_DEPTNO  IN EMP1.DEPTNO%TYPE
)
IS
BEGIN
    UPDATE EMP1
      SET DEPTNO = V_DEPTNO
    WHERE EMPNO = V_EMPNO;
END PRO_MODIFY_EMP1;
/

SELECT * FROM EMP1;
-- 실행
EXECUTE PRO_MODIFY_EMP1(9994, 90);


-- 과목번호 입력해서 교수이름 검색하는 프로시저
CREATE PROCEDURE PF
(
  V_SUB_NO IN SUBJECT.SUB_NO%TYPE,
  V_SUB_PROF OUT SUBJECT.SUB_PROF%TYPE
)
IS
BEGIN
    SELECT SUB_PROF INTO V_SUB_PROF 
      FROM SUBJECT WHERE V_SUB_NO = SUB_NO;
END PF;
/

-- 실행 P.491
SET SERVEROUT ON;

DECLARE
  V_SUB_PROF SUBJECT.SUB_PROF%TYPE;
BEGIN
  PF(101, V_SUB_PROF);
  DBMS_OUTPUT.PUT_LINE('강사명= '||V_SUB_PROF);
END;
/

-- P.497 함수 생성
CREATE FUNCTION FUNC_AFTERTAX(
  SAL IN NUMBER
)
RETURN NUMBER
IS
  TEX NUMBER := 0.05;
BEGIN
  RETURN (ROUND(SAL - (SAL*TEX)) );
END FUNC_AFTERTAX;
/

DECLARE
  AFTERTAX NUMBER;
BEGIN
  AFTERTAX := FUNC_AFTERTAX(3000);  
  DBMS_OUTPUT.PUT_LINE('세후연봉 = '|| AFTERTAX);
END;
/


-- SQL문에서 함수 사용
SELECT EMPNO, ENAME, SAL, FUNC_AFTERTAX(SAL) AS 세후연봉 FROM EMP1;

-- 제약조건 검색
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'ENROL';
-- 제약조건 삭제
ALTER TABLE ENROL DROP CONSTRAINT P_COURSE;

-- 제약조건 추가
ALTER TABLE ENROL MODIFY (SUB_NO, STU_NO CONSTRAINT P_COURSE NOT NULL);
ALTER TABLE ENROL MODIFY (SUB_NO, STU_NO CONSTRAINT P_COURSE2 UNIQUE);




-- 예외 P. 474
CREATE OR REPLACE PROCEDURE TEST111
(
  V_STU_NO IN STUDENT.STU_NO%TYPE
)
IS
  V_STU_NAME STUDENT.STU_NAME%TYPE;
BEGIN
    SELECT STU_NAME INTO V_STU_NAME
        FROM STUDENT
      WHERE STU_NO = V_STU_NO;
    DBMS_OUTPUT.PUT_LINE (V_STU_NAME);
    
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE ('해당 데이터가 존재하지 않는다');
END TEST111;
/

SELECT * FROM STUDENT;
EXECUTE TEST111(20153075);


-- P.479 Q2
DECLARE
  V_WRONG DATE;
BEGIN
    SELECT ENAME INTO V_WRONG
        FROM EMP
      WHERE EMPNO = 7369;
      
      DBMS_OUTPUT.PUT_LINE ('예외가 발생하면 다음 문장은 실행되지 않습니다');
      
    EXCEPTION
      WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE ('오류가 발생하였습니다 ' || TO_CHAR(SYSDATE, '[YYYY"년"MM"월"DD"일" HH24"시"MM"분"SS"초"]'));
END;
/


--
--  CNT_ERROR EXCEPTION; 에러(예외)변수
-- RAISE : 예외를 직접 만드는 작업 -> 예외를 일부러 발생시킨다..
CREATE OR REPLACE PROCEDURE TEST22
(
  V_SUB_NO IN ENROL.SUB_NO%TYPE
)
IS
  V_CNT NUMBER;
  CNT_ERROR EXCEPTION;
BEGIN
    SELECT COUNT(STU_NO) INTO V_CNT
      FROM ENROL
    WHERE SUB_NO = V_SUB_NO;
    
    IF V_CNT = 0 THEN
      RAISE CNT_ERROR;
    END IF;
    
    DBMS_OUTPUT.PUT_LINE (V_SUB_NO || '과목 수강자는 ' || V_CNT || '명');
    
  EXCEPTION
    WHEN CNT_ERROR THEN
      DBMS_OUTPUT.PUT_LINE (V_SUB_NO || ' 과목 수강자는 없다');
END TEST22;
/

EXECUTE TEST22(109);

DESC ENROL;
SELECT COUNT(*) FROM ENROL
    WHERE SUB_NO =101
      AND STU_NO = 20131001;



-- 1. 수강테이블에 데이터 추가하는 프로시저
CREATE OR REPLACE PROCEDURE P_INSERT_ENROL
(
  V_SUB_NO IN ENROL.SUB_NO%TYPE,
  V_STU_NO IN ENROL.STU_NO%TYPE,
  V_ENR_GRADE IN ENROL.ENR_GRADE%TYPE  
)
IS
  SUB_CNT NUMBER;
  IS_ERROR EXCEPTION;
BEGIN
    SELECT COUNT(*) INTO SUB_CNT
      FROM ENROL
    WHERE SUB_NO = V_SUB_NO
      AND STU_NO = V_STU_NO;
          
    IF SUB_CNT >= 1 THEN
      RAISE IS_ERROR;
    ELSE
      INSERT INTO ENROL
      VALUES (V_SUB_NO, V_STU_NO,V_ENR_GRADE);
      
      DBMS_OUTPUT.PUT_LINE('과목 점수 등록 성공');
    END IF;
      
  EXCEPTION
    WHEN IS_ERROR THEN
      DBMS_OUTPUT.PUT_LINE('이미 등록한 과목입니다.');
END P_INSERT_ENROL;
/

-- q1 추가 해설
-- 수강테이블에 데이터 추가하는 프로시저
create OR REPLACE procedure p1_insert_enrol
(
  v_sub_no in enrol.sub_no%type,
  v_stu_no in enrol.stu_no%type,
  v_enr_grade in enrol.enr_grade%type
)

is
  v_cnt number;
  c_error exception;

begin
   select count(*) into v_cnt from subject where sub_no=v_sub_no;
    
    if v_cnt=0 then raise c_error;
    end if;
    
    select count(*) into v_cnt from student where stu_no=v_stu_no;
    
     if v_cnt=0 then raise c_error;
     end if;
     
     insert into enrol(sub_no,stu_no,enr_grade)values(v_sub_no,v_stu_no,v_enr_grade );
  DBMS_OUTPUT.PUT_LINE(v_stu_no || '학번의 '||v_sub_no || ' 과목 점수는 ' || v_enr_grade || '점 입니다.');
  
exception
    when c_error then 
    dbms_output.put_line('무결성에 위배됨');
end p1_insert_enrol;
/

-- 실행
SELECT * FROM ENROL;

EXECUTE P_INSERT_ENROL ('101', '20131001', 40);
EXECUTE P_INSERT_ENROL ('101', '20151001', 99);
-- 1번 끝


-- 2. 방법 1 :기존 과목번호를 새로운 과목번호로 교체하는 프로시저
UPDATE SUBJECT SET SUB_NO = 101  WHERE SUB_NO = 101;

CREATE OR REPLACE PROCEDURE P_P_SUB_NO_UPDATE
(
  V_SUB_NO IN SUBJECT.SUB_NO%TYPE,
  V_NEW_SUB_NO IN SUBJECT.SUB_NO%TYPE
)
IS
BEGIN
  UPDATE SUBJECT SET SUB_NO = V_NEW_SUB_NO
    WHERE SUB_NO = V_SUB_NO;
  
EXCEPTION
  WHEN DUP_VAL_ON_INDEX THEN
    DBMS_OUTPUT.PUT_LINE('중복값이 있다.' || TO_CHAR(SQLCODE));
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('뭔가 오류가 발생했다.' || TO_CHAR(SQLCODE));
  
END P_P_SUB_NO_UPDATE;
/

EXECUTE P_P_SUB_NO_UPDATE(101, 101);

-- 2. 방법 2 : 기존 과목번호를 새로운 과목번호로 교체하는 프로시저
CREATE OR REPLACE PROCEDURE P_P_SUB_NO_UPDATE2
(
  V_SUB_NO IN SUBJECT.SUB_NO%TYPE,
  V_NEW_SUB_NO IN SUBJECT.SUB_NO%TYPE
)
IS
  SUB_CNT NUMBER;
  MY_ERR EXCEPTION;
BEGIN
  SELECT COUNT(*) INTO SUB_CNT
  FROM SUBJECT
  WHERE SUB_NO = V_NEW_SUB_NO
    AND SUB_NO <> V_SUB_NO;
  
  IF SUB_CNT >= 1 THEN
    RAISE MY_ERR;
  END IF;

  UPDATE SUBJECT SET SUB_NO = V_NEW_SUB_NO
    WHERE SUB_NO = V_SUB_NO;
  
EXCEPTION
  WHEN MY_ERR THEN
    DBMS_OUTPUT.PUT_LINE('내가 만든 오류. 중복값이 있다.' || TO_CHAR(SQLCODE));
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('뭔가 오류가 발생했다.' || TO_CHAR(SQLCODE));
  
END P_P_SUB_NO_UPDATE2;
/

SELECT * FROM SUBJECT  ORDER BY SUB_NO;
EXECUTE P_P_SUB_NO_UPDATE2(101, 101);
EXECUTE P_P_SUB_NO_UPDATE2(202, 101);
EXECUTE P_P_SUB_NO_UPDATE(101, 102);


-- q2 추가 해설
-- 기존 과목번호를 새로운 과목번호로 교체하는 프로시저
create procedure p1_sub_no_update
(
  old_sub_no in subject.sub_no%type,
  new_sub_no in subject.sub_no%type
)
is
  v_cnt number;
  e1 exception;
  e2 exception;
  
begin
  select count(*) into v_cnt from subject where sub_no = old_sub_no;
  
  if v_cnt = 0 then raise e1;
  end if;
  
  select count(*) into v_cnt from subject where sub_no = new_sub_no;
  
  if v_cnt > 0 then raise e2;
  end if;
  
  UPDATE SUBJECT 
    SET SUB_NO = new_sub_no
    WHERE SUB_NO = old_sub_no;
    
  UPDATE enrol 
    SET SUB_NO = new_sub_no
    WHERE SUB_NO = old_sub_no;
    
  dbms_output.put_line('번호변경 성공');
  
  

exception
  when e1 then
    dbms_output.put_line('교체할 과목번호가 없음');
  when e2 then
    dbms_output.put_line('이미 있는 과목번호 입니다');
end p1_sub_no_update;
/

-- 실행 (기본과목번호, 새로운 번호)
-- 실행 결과 : 교체할 과목번호가 없다(교체 실패)
EXECUTE p1_sub_no_update ('501', '201');

-- 실행 결과 : 교체될 과목번호가 이미 있다(교체 실패)
EXECUTE p1_sub_no_update ('101', '102');

-- 실행 결과 : (교체 성공)
EXECUTE p1_sub_no_update ('101', '501');
