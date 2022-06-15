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
