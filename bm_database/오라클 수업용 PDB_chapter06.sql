-- p.167 - 185
-- 6- 45
SELECT EMPNO, ENAME, SAL, COMM, SAL+COMM,
    NVL(COMM,0),
    SAL+NVL(COMM, 0)
FROM EMP;
-- 46
SELECT EMPNO AS 사원번호, ENAME AS 이름, COMM AS 수당,
    NVL2(COMM, '0', '기타수당이 없는 사람'),
    -- 기타수당이 있으면 연봉에 수당을 더하여 추출하고
    -- 수당이 없으면 연봉을 추출한다
    NVL2(COMM, SAL*12+COMM, SAL*12) AS ANNSAL
FROM EMP;


-- P.174 Q1
SELECT EMPNO, ENAME,
    RPAD( SUBSTR(EMPNO,1,2), 4, '*') AS MASKING_EMPNO,
    RPAD( SUBSTR(ENAME,1,1), LENGTH(ENAME) , '*') AS MASKING_ENAME
FROM EMP1
WHERE LENGTH(ENAME) >= 5 AND LENGTH(ENAME) < 6; 
   
SELECT EMPNO, ENAME,
    RPAD( SUBSTR(EMPNO,1,2), 4, '*') AS MASKING_EMPNO,
    RPAD( SUBSTR(ENAME,1,1), LENGTH(ENAME) , '*') AS MASKING_ENAME
FROM EMP1
WHERE LENGTH(ENAME) BETWEEN 5 AND 6;
-- 6이 포함된 결과값이 출력된다

-- P.174 Q2
SELECT EMPNO, ENAME, SAL,
    TRUNC((SAL/21.5), 2) AS DAY_PAY,
    ROUND((SAL/21.5)/8, 1) AS TIME_PAY
FROM EMP1;

-- P.174 Q3
SELECT EMPNO, ENAME, HIREDATE
FROM EMP1;
