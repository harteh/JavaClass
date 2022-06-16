-- JOIN
-- 부서번호가 같을 때 테이블을 조인해서 출력하겠다
SELECT * FROM EMP, DEPT WHERE EMP.DEPTNO=DEPT.DEPTNO;
-- STUDENT, ENROL 합쳐서 다 출력
SELECT STUDENT.STU_NO, STU_NAME, STU_DEPT
FROM STUDENT, ENROL WHERE STUDENT.STU_NO = ENROL.STU_NO;
-- NATURAL JOIN
SELECT STU_NO, STU_NAME, ENR_GRADE FROM STUDENT NATURAL JOIN ENROL;
-- JOIN ~ USING
SELECT STU_NO, STU_NAME, ENR_GRADE 
FROM STUDENT JOIN ENROL USING(STU_NO);
select student.stu_no, stu_name, stu_dept, enr_grade from student join enrol on student.stu_no=enrol.stu_no;

-- 학생테이블과 수강테이블을 NATURAL JOIN 하시오
SELECT * FROM STUDENT NATURAL JOIN ENROL;
-- 과목이름과 학번, 점수를 검색하시오 (NATURAL JOIN)
SELECT SUB_NAME, STU_NO, ENR_GRADE
    FROM SUBJECT 
    NATURAL JOIN ENROL;
-- -- 과목이름과 학번, 점수를 검색하시오 (JOIN ~ USING)
SELECT SUB_NAME, STU_NO, ENR_GRADE
    FROM SUBJECT 
    JOIN ENROL USING(SUB_NO);

-- 점수가 70점 이상인 학생 이름을 검색 (이큐조인)
SELECT STU_NAME
    FROM STUDENT, ENROL
WHERE STUDENT.STU_NO = ENROL.STU_NO
    AND ENR_GRADE >= 70;
-- 점수가 60점 이상인 학생 이름 J.U (JOIN ~ USING)
SELECT STU_NAME
    FROM STUDENT
    JOIN ENROL USING (STU_NO)
WHERE ENR_GRADE >= 60;
-- 70점 이하인 학생 (NATURAL JOIN)
SELECT STU_NAME
    FROM STUDENT
    NATURAL JOIN ENROL
WHERE ENR_GRADE <= 70;
-- 강종영 교수가 강의하는 과목을 수강하는 학생 이름 (이큐조인)
SELECT STU_NAME
    FROM STUDENT, SUBJECT, ENROL
WHERE STUDENT.STU_NO=ENROL.STU_NO
    AND ENROL.SUB_NO=SUBJECT.SUB_NO
    AND SUB_PROF='강종영';
-- 컴퓨터개론을 수강하는 학생들의 학번과 이름 (이큐조인)
SELECT STUDENT.STU_NO, STU_NAME
    FROM STUDENT, SUBJECT, ENROL
WHERE STUDENT.STU_NO = ENROL.STU_NO
    AND ENROL.SUB_NO = SUBJECT.SUB_NO
    AND SUB_NAME = '컴퓨터개론';
    

-- 21. 사원이름을 15자리로 하고, 뒤에 ‘&’를채워 검색하라.
SELECT RPAD(ENAME, 15, '&') FROM EMP1;

-- 22. 사원직무를 20자리로 하고, 앞에 ‘%’를채워 검색하라.
SELECT LPAD(JOB, 20, '%') FROM EMP1;

-- 23. 사원의 사원번호, 사원이름, 급여를 검색하라.(급여는두번째 자리에서 반올림함)
SELECT EMPNO, ENAME, SAL, ROUND(SAL, -2) FROM EMP1;

-- 24. 사원의 사원번호, 사원이름, 급여를 검색하라.(급여는두번째 자리에서 절삭함)
SELECT EMPNO, ENAME, SAL, TRUNC(SAL, -2) FROM EMP1;

-- 25. 사원번호와 급여를 100으로 나눈 나머지를 검색하라.
SELECT EMPNO,  MOD(SAL,100) FROM EMP1;

-- 26. 사원번호, 사원이름, 입사일, 입사후 100일의 날짜를 검색하라.
SELECT EMPNO, ENAME, HIREDATE, HIREDATE+100 FROM EMP1;

-- 27. 사원번호,  사원이름, 입사일, 근무 일자를 계산하여 검색하라.
SELECT EMPNO, ENAME, HIREDATE, 
    TRUNC( SYSDATE - HIREDATE) AS 근속일자,
    TRUNC( MONTHS_BETWEEN(SYSDATE, HIREDATE)) AS 근속개월
    FROM EMP1;

-- 28. 사원들의 입사일에서 3달째 되는 날짜를 검색하라.
SELECT HIREDATE, ADD_MONTHS(HIREDATE, 3)
    FROM EMP1;

-- P.153
-- 29. 사원들의 입사일다음 토요일의 날짜를 검색하라.
SELECT HIREDATE, 
    NEXT_DAY(HIREDATE, '금요일'), 
    NEXT_DAY(HIREDATE, 7)
    FROM EMP1;

-- 30. 사원들의 입사월의마지막 날짜를 검색하라. 
SELECT HIREDATE, LAST_DAY(HIREDATE)
    FROM EMP1;
    
    
-- 부서별 사원의 평균 급여
SELECT DEPTNO, AVG(SAL)
    FROM EMP1
    GROUP BY DEPTNO;
    
-- 부서별 사원들의 급여의 표준편차(STDDEV)
SELECT DEPTNO, 
    STDDEV(SAL) AS 표준편차
    FROM EMP1
    GROUP BY DEPTNO;
    
-- 부서별 사원직무별 사원의 급여 합
SELECT DEPTNO, JOB, SUM(SAL) AS 급여합
    FROM EMP1
    GROUP BY DEPTNO, JOB
    ORDER BY DEPTNO;

-- 부서별 사원직무별 사원들의 평균 급여
SELECT DEPTNO, JOB, AVG(SAL) AS 평균급여
    FROM EMP1    
    GROUP BY DEPTNO, JOB
    ORDER BY DEPTNO;

-- 부서별 사원직무별 사원들의 입사일이 MAX와 MIN
SELECT DEPTNO, JOB, MAX(HIREDATE), MIN(HIREDATE)
    FROM EMP1    
    GROUP BY DEPTNO, JOB
    ORDER BY DEPTNO, JOB;
    
--36. 부서별 사원들의 인원수를 인원수가 많은 순으로 검색하라.
SELECT DEPTNO, COUNT(*)
    FROM EMP1
    GROUP BY DEPTNO
    ORDER BY COUNT(*) DESC;
    
--37. 부서별사원들의 평균 급여를 평균 급여 순으로 검색하라.
SELECT ROUND( AVG(SAL), 1 ) AS AVG_SAL
    FROM EMP1
    GROUP BY DEPTNO
    ORDER BY AVG(SAL);

--38. 부서별, 사원직무별 사원의 급여 합을 많은 순으로 검색하라.
SELECT DEPTNO, JOB, SUM(SAL) AS 급여합
    FROM EMP1
    GROUP BY DEPTNO, JOB
    ORDER BY 급여합 DESC;

--39. 부서별, 사원직무별 사원들의 평균 급여를 평균 급여가 많은 순으로 검색하라.
SELECT DEPTNO, JOB, ROUND(AVG(SAL),1) AS 평균급여
    FROM EMP1
    GROUP BY DEPTNO, JOB
    ORDER BY AVG(SAL) DESC;

-- P.156
--40. 사원들의 입사일을 년을 기준으로 반올림하여 검색하라.
SELECT ENAME, 
    ROUND( HIREDATE, 'YEAR')
    FROM EMP1;
    
--41. 사원들의 입사일을 년을 기준으로 절삭하여 검색하라. (이름 순으로 정렬)
SELECT ENAME, 
    TRUNC( HIREDATE, 'YEAR'),
    TO_CHAR(TRUNC( HIREDATE, 'YEAR'), 'YYYY') AS 연도
    FROM EMP1
    ORDER BY 1;
    
-- 42 상급자가 없는 사원의 경우 '상급자없음' (NVL, TO_CHAR)
SELECT ENAME, NVL(TO_CHAR(MGR), '상급자없음')
    FROM EMP1;
    
-- COMM 을 포함한 급여를 사원번호와 이름
SELECT EMPNO, ENAME, 
    NVL(SAL+COMM, SAL)
    FROM EMP1;
SELECT EMPNO, ENAME, 
    SAL+NVL(COMM, 0) AS 수당포함급여
    FROM EMP1;
    
-- 커미션을 포함한 연봉
SELECT EMPNO, ENAME,
    (SAL*12)+NVL(COMM, 0) AS 수당포함연봉1,
    ( NVL(SAL+COMM, SAL) * 12 ) AS 수당포함연봉
    FROM EMP1;
    
-- 101번 과목을 수강하는 학생들의 학번 이름
SELECT S.STU_NO, STU_NAME
    FROM STUDENT S, ENROL E
  WHERE S.STU_NO = E.STU_NO
    AND SUB_NO=101;

-- 101번 또는 102번 과목 수강생
SELECT S.STU_NO, STU_NAME
    FROM STUDENT S, ENROL E
  WHERE S.STU_NO = E.STU_NO
    AND (SUB_NO=101 OR SUB_NO=102);
-- 추가조건이 여러개인 경우 이큐조인은 잘 사용하지 않는다
SELECT STU_NO, STU_NAME
    FROM STUDENT NATURAL JOIN ENROL
  WHERE SUB_NO=101 
     OR SUB_NO=102;
  
SELECT STU_NO, STU_NAME
    FROM STUDENT JOIN ENROL USING(STU_NO)
  WHERE SUB_NO=101 
     OR SUB_NO=102;


-- NON-EQUI 조인
SELECT STU_NAME, ENR_GRADE,
       SUB_NO AS 과목번호
    FROM STUDENT NATURAL JOIN ENROL
  WHERE ENR_GRADE BETWEEN 80 AND 90;


-- 51. 사원 테이블과 부서 테이블을 natural join해라.
SELECT DEPTNO AS 부서번호, DNAME, 
       EMPNO AS 사원번호, ENAME
    FROM EMP1 NATURAL JOIN DEPT1;

-- 52. 사원번호, 사원이름, 부서이름을 검색하라.(equi)
SELECT E.EMPNO, E.ENAME, D.DNAME
    FROM EMP1 E, DEPT1 D
  WHERE E.DEPTNO = D.DEPTNO;

-- 53. 사원번호, 사원이름, 부서이름을 검색하라.(natural)
SELECT EMPNO, ENAME, DNAME
    FROM EMP1 NATURAL JOIN DEPT1;

-- 54. 사원번호, 사원이름, 부서이름을 검색하라.(join~using)
SELECT EMPNO, ENAME, DNAME
  FROM EMP1 JOIN DEPT1 USING(DEPTNO);

-- 55. 지역이 NEW YORK인 사원이름을 검색하라.(equi)
SELECT E.ENAME, D.LOC
    FROM EMP1 E, DEPT1 D
  WHERE E.DEPTNO = D.DEPTNO
    AND D.LOC='NEW YORK';
    

-- 1. ADAMS사원이 근무 중인 부서이름과 지역을검색하라.(equi join)
SELECT D.DNAME, D.LOC
    FROM EMP1 E, DEPT1 D
  WHERE E.DEPTNO = D.DEPTNO
    AND E.ENAME = 'ADAMS';

-- 2. 급여가 2000이상인 사원들의 사원명과 지역을검색하라. (natural join)
SELECT ENAME, LOC
    FROM EMP1 NATURAL JOIN DEPT1
  WHERE SAL >= 2000;

-- 3. 2번을equi join으로 바꿔라.
SELECT E.ENAME, D.LOC
    FROM EMP1 E, DEPT1 D
  WHERE E.DEPTNO = D.DEPTNO
    AND E.SAL >= 2000;

-- 4. 급여가 1000 이상 2000 이하인 사원들의 사원번호, 사원이름, 부서이름을 사원번호순으로 검색하라. (join using)
SELECT EMPNO, ENAME, DNAME, SAL
    FROM EMP1 JOIN DEPT1 USING (DEPTNO)
  WHERE SAL BETWEEN 1000 AND 2000
ORDER BY EMPNO;

-- 5. 사원직무가 SALESMAN이면서 CHICAGO 지역에 근무 중인 사원명을 검색하라.
SELECT ENAME, JOB, LOC
    FROM EMP1 NATURAL JOIN DEPT1
  WHERE JOB = 'SALESMAN'
    AND LOC = 'CHICAGO';

-- 6. NEW YORK이나 DALLAS 지역에 근무하는 사원들의 사원번호와 사원이름을 사원번호 순으로 검색하라. (equi join)
SELECT E.EMPNO, E.ENAME, D.LOC
    FROM EMP1 E, DEPT1 D
  WHERE E.DEPTNO = D.DEPTNO
    AND D.LOC IN ('NEW YORK', 'DALLAS')
ORDER BY E.EMPNO;

-- 7. 부서이름이 ACCOUNTING 이거나, 지역이 CHICAGO 인 사원의 사원번호와 사원이름을 검색하라. (equi join)
SELECT  E.EMPNO, E.ENAME, 
        D.DNAME AS 부서이름, D.LOC AS 지역
    FROM EMP1 E, DEPT1 D
  WHERE E.DEPTNO = D.DEPTNO
    AND (D.DNAME = 'ACCOUNTING' OR D.LOC = 'CHICAGO');

-- 8. NEW YORK 이나 DALLAS 지역에 근무하는 사원들의 사원번호와 사원이름을 사원번호 순으로 검색하라. (natural join)
SELECT EMPNO AS 사번, ENAME AS 이름, LOC AS 지역
    FROM EMP1 NATURAL JOIN DEPT
  WHERE LOC IN ('NEW YORK', 'DALLAS')
ORDER BY EMPNO;


-- SELF JOIN
-- 상급자사원번호 = 사원번호 같은것
SELECT A.EMPNO AS 사번, A.ENAME AS 사원이름,
       B.EMPNO AS 상급자사번, B.ENAME AS 상급자사원이름
    FROM EMP1 A, EMP1 B
  WHERE A.MGR = B.EMPNO;

-- outer join
-- ENROL 테이블의 모든 정보, 과목이름
SELECT A.*, 
       SUB_NAME AS 과목명
    FROM ENROL A, SUBJECT B
  WHERE A.SUB_NO(+) = B.SUB_NO
ORDER BY 1;
-- 과목테이블도 다 출력(외부 조인)
SELECT A.*, SUB_NAME
    FROM ENROL A RIGHT OUTER JOIN SUBJECT B
  ON A.SUB_NO = B.SUB_NO
ORDER BY 1;

--
SELECT A.*, 
       SUB_NAME AS 과목명
    FROM ENROL A, SUBJECT B
  WHERE A.SUB_NO = B.SUB_NO(+)
ORDER BY 1;
SELECT A.*, SUB_NAME
    FROM ENROL A LEFT OUTER JOIN SUBJECT B
  ON A.SUB_NO = B.SUB_NO
ORDER BY 1;


-- p.239, 240
-- Q1 급여가 2000 초과인 사원들의 부서 정보, 사원 정보
SELECT D.DEPTNO, D.DNAME, E.EMPNO, E.ENAME, E.SAL
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO
    AND SAL > 2000;
-- 
SELECT DEPTNO, DNAME, EMPNO, ENAME, SAL
    FROM EMP NATURAL JOIN DEPT
    WHERE SAL > 2000;

-- Q2 각 부서별 평균 급여, 최대 급여, 최소 급여, 사원수 출력
SELECT  D.DEPTNO, D.DNAME,
        TRUNC(AVG(SAL)) AS AVG_SAL,
        MAX(SAL), MIN(SAL), COUNT(*) AS CNT
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO
    GROUP BY D.DEPTNO, D.DNAME;
--
SELECT DEPTNO, D.DNAME,
       TRUNC(AVG(SAL)) AS AVG_SAL,
       MAX(SAL), MIN(SAL), COUNT(*) AS CNT
  FROM EMP E JOIN DEPT D USING (DEPTNO)
GROUP BY DEPTNO, D.DNAME;

-- Q3 모든 부서 정보와 사원 정보를 부서번호, 사원 이름순으로 정렬하여 출력
SELECT D.DEPTNO, D.DNAME, E.EMPNO, E.ENAME, E.JOB, E.SAL
    FROM EMP E RIGHT JOIN DEPT D
    ON(E.DEPTNO = D.DEPTNO);

-- Q4 모든 부서 정보, 사원 정보, 급여 등급 정보, 각 사원의 직속 상관의 정보를
--    부서번호, 사원 번호 순서로 정렬하여 출력하시오
SELECT D.DEPTNO, D.DNAME,
       E.EMPNO, E.ENAME, E.MGR, E.SAL, E.DEPTNO,
       S.LOSAL, S.HISAL, S.GRADE,
       E2.EMPNO AS MGR_EMPNO, E2.ENAME AS MGR_ENAME
    FROM EMP E 
      RIGHT OUTER JOIN DEPT D 
        ON(E.DEPTNO=D.DEPTNO)
      LEFT OUTER JOIN SALGRADE S 
        ON(E.SAL BETWEEN S.LOSAL AND S.HISAL)
      LEFT OUTER JOIN EMP E2
        ON(E.MGR = E2.EMPNO)
  ORDER BY E.DEPTNO, E.ENAME;
