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

-- P.262
SELECT JOB, EMPNO, ENAME, SAL, DEPTNO, DNAME
    FROM EMP NATURAL JOIN DEPT
  WHERE JOB IN (SELECT JOB FROM EMP WHERE ENAME = 'ALLEN');
-- Q2
SELECT E.EMPNO, E.ENAME, D.DNAME, E.HIREDATE, D.LOC, E.SAL, S.GRADE
    FROM EMP E, DEPT D, SALGRADE S
  WHERE E.DEPTNO = D.DEPTNO
    AND E.SAL BETWEEN S.LOSAL AND S.HISAL
    AND E.SAL > (SELECT AVG(SAL) FROM EMP)
ORDER BY E.SAL DESC, E.EMPNO;

-- Q3
SELECT EMPNO, ENAME, JOB, DEPTNO, DNAME, LOC
    FROM EMP NATURAL JOIN DEPT
  WHERE DEPTNO = 10
    AND JOB NOT IN (SELECT JOB FROM EMP WHERE DEPTNO = 30);
    
-- Q4
-- 단일행 사용
SELECT EMPNO, ENAME, SAL, GRADE
    FROM EMP, SALGRADE
  WHERE SAL BETWEEN LOSAL AND HISAL
    AND SAL > ( SELECT MAX(SAL) FROM EMP WHERE JOB='SALESMAN')
ORDER BY EMPNO;
-- 다중행
SELECT EMPNO, ENAME, SAL, GRADE
    FROM EMP, SALGRADE
  WHERE SAL BETWEEN LOSAL AND HISAL
    AND SAL > ALL ( SELECT SAL FROM EMP WHERE JOB='SALESMAN')
ORDER BY EMPNO;











