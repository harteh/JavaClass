-- chapter 5 실습
-- 1
SELECT * FROM EMP;
-- 2
SELECT * FROM EMP WHERE DEPTNO=30;
-- 3
SELECT * FROM EMP WHERE DEPTNO=30 AND JOB='SALESMAN';
-- 4
SELECT * FROM EMP WHERE DEPTNO = 30 OR JOB = 'CLERK';
-- 5 연봉(SAL*12) 가 36000인 사원
SELECT * FROM EMP WHERE SAL*12=36000;
-- 6 급여가 3000 이상인 사원
SELECT * FROM EMP WHERE SAL >= 3000;
-- 7 이름의 첫 문자(이름의 순서)가 F와 같거나 뒤쪽인것만 검색
SELECT * FROM EMP WHERE ENAME >= 'F';
-- 8
SELECT * FROM EMP WHERE ENAME <= 'FORZ';
-- 9~11 등가 비교 연산자
SELECT * FROM EMP WHERE SAL != 3000;
SELECT * FROM EMP WHERE SAL <> 3000;
SELECT * FROM EMP WHERE SAL ^= 3000;
-- 12
SELECT * FROM EMP WHERE NOT SAL=3000;
-- 13
SELECT * FROM EMP 
    WHERE JOB = 'MANAGER'
    OR JOB = 'SALESMAN'
    OR JOB = 'CLERK';
-- 14
SELECT * FROM EMP 
WHERE JOB IN('MANAGER','SALESMAN','CLERK');
-- 15
SELECT * FROM EMP 
WHERE JOB != 'MANAGER'
  AND JOB <> 'SALESMAN'
  AND JOB ^= 'CLERK';
-- 16
SELECT * FROM EMP 
WHERE JOB NOT IN('MANAGER','SALESMAN','CLERK');
-- 17
SELECT * FROM EMP 
WHERE SAL >= 2000
  AND SAL <= 3000;
-- 18
SELECT * FROM EMP 
WHERE SAL BETWEEN 2000 AND 3000;
-- 19
SELECT * FROM EMP 
WHERE SAL NOT BETWEEN 2000 AND 3000;
-- 20
SELECT * FROM EMP WHERE ENAME LIKE 'S%';
-- 21
SELECT * FROM EMP WHERE ENAME LIKE '_L%';
-- 22 이름에 AM 이 포함된 사원
SELECT * FROM EMP WHERE ENAME LIKE '%AM%';
-- 23
SELECT * FROM EMP WHERE ENAME NOT LIKE '%AM%';
-- 24
SELECT ENAME, SAL, SAL*12+COMM AS ANNSAL, COMM FROM EMP;
-- 25
SELECT *
FROM EMP
WHERE COMM = NULL;
-- 26
SELECT *
FROM EMP
WHERE COMM IS NULL;
-- 27
SELECT * FROM EMP
WHERE MGR IS NOT NULL;
-- 28
SELECT * FROM EMP
WHERE SAL > NULL
AND COMM IS NULL;
-- 29
SELECT * FROM EMP
WHERE SAL > NULL
OR COMM IS NULL;

