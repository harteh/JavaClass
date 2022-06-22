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
  



