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
    