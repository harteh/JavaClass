create table dept1(
    deptno number(2)
    constraint pk_dept primary key,
    dname varchar2(14),
    loc varchar2(13));

insert into dept1 values
(10,'ACCOUNTING','NEW YORK');
insert into dept1 values
(20,'RESEARCH','DALLAS');
insert into dept1 values
(30,'SALES','CHICAGO');
insert into dept1 values
(40,'OPERATIONS','BOSTON');

create table emp1(
    empno number(4)
    constraint pk_emp primary key,
    ename varchar2(10),
    job varchar2(9),
    mgr number(4),
    hiredate date,
    sal number(7,2),
    comm number(7,2),
    deptno number(2));

insert into emp1 values(7839,'KING','PRESIDENT',NULL,to_date('17-11-1981','dd-mm-yyyy'),5000,NULL,10);
insert into emp1 values(7566,'JONES','MANAGER',7839,to_date('2-4-1981','dd-mm-yyyy'),2975,NULL,20);
insert into emp1 values(7698,'BLAKE','MANAGER',7839,to_date('1-5-1981','dd-mm-yyyy'),2850,NULL,30);
insert into emp1 values(7782,'CLARK','MANAGER',7839,to_date('9-6-1981','dd-mm-yyyy'),2450,NULL,10);
insert into emp1 values(7788,'SCOTT','ANALYST',7566,to_date('13-07-1987','dd-mm-yyyy'),3000,NULL,20);
insert into emp1 values(7902,'FORD','ANALYST',7566,to_date('3-12-1981','dd-mm-yyyy'),3000,NULL,20);
insert into emp1 values(7499,'ALLEN','SALESMAN',7698,to_date('20-2-1981','dd-mm-yyyy'),1600,300,30);
insert into emp1 values(7521,'WARD','SALESMAN',7698,to_date('22-2-1981','dd-mm-yyyy'),1250,500,30);
insert into emp1 values(7654,'MARTIN','SALESMAN',7698,to_date('28-9-1981','dd-mm-yyyy'),1250,1400,30);
insert into emp1 values(7844,'TURNER','SALESMAN',7698,to_date('8-9-1981','dd-mm-yyyy'),1500,0,30);
insert into emp1 values(7900,'JAMES','CLERK',7698,to_date('3-12-1981','dd-mm-yyyy'),950,NULL,30);
insert into emp1 values(7934,'MILLER','CLERK',7782,to_date('23-1-1982','dd-mm-yyyy'),1300,NULL,10);
insert into emp1 values(7369,'SMITH','CLERK',7902,to_date('17-12-1980','dd-mm-yyyy'),800,NULL,20);
insert into emp1 values(7876,'ADAMS','CLERK',7788,to_date('13-07-1987','dd-mm-yyyy'),1100,NULL,20);

create table salgrade1(
    grade number(7,2),
    losal number(7,2),
    hisal number(7,2));

insert into salgrade1 values(1,700,1200);
insert into salgrade1 values(2,1201,1400);
insert into salgrade1 values(3,1401,2000);
insert into salgrade1 values(4,2001,3000);
insert into salgrade1 values(5,3001,9999);

SELECT * FROM EMP1;
SELECT * FROM DEPT1;
SELECT * FROM SALGRADE1;

-- 1~3
DESC EMP1;
DESC DEPT1;
DESC SALGRADE1;

-- 4.	사원들의 사원번호, 사원이름, 사원직무를 검색하라.
SELECT EMPNO, ENAME, JOB FROM EMP1;
-- 5.	부서의 부서번호와 부서이름을 검색하라.
SELECT DEPTNO, DNAME FROM DEPT1;
-- 6.	부서의 부서이름과 지역을 검색하라.
SELECT DNAME, LOC FROM DEPT1;
-- 7.	사원들의 급여와 커미션을 검색하라.
SELECT SAL, COMM FROM EMP1;
-- 8.	사원들의 입사일 중복을 제거하고 검색하라.
SELECT DISTINCT(HIREDATE) FROM EMP1;
-- 9.	사원들의 상급자사원번호(mgr)중복을 제거하고 검색하라.
SELECT DISTINCT(MGR) FROM EMP1;
-- 10.	사원들의 부서번호 중복을 제거하고 검색하라.
SELECT DISTINCT(DEPTNO) FROM EMP1;
-- 11.	사원들의 이름과 6개월 급여을 검색하라.
SELECT ENAME, SAL AS 연봉, (SAL*6) FROM EMP1;

-- 12.	사원들의 6개월 커미션(comm)의 합을 검색하라.
SELECT SUM(COMM)*6 AS 반년치수당 FROM EMP1;

-- 13.	사원이름을 ‘name’으로 사원의 급여를 ‘salary’로 열의 이름을 부여하여 검색하라.
SELECT ENAME AS NAME, SAL AS SALARY FROM EMP1;
-- 14.	사원의 사원번호, 사원이름, 입사일, 부서번호를 한글로 바꾸어 검색하라.
SELECT EMPNO AS 사원번호, ENAME AS 사원이름, HIREDATE AS 입사일, DEPTNO AS 부서번호 FROM EMP1;
-- 15.	부서번호, 부서이름, 지역을 한글 제목으로 검색하라.
SELECT DEPTNO AS 부서번호, DNAME AS 부서이름, LOC AS 지역 FROM DEPT1;

-- 16.	사원의 사원직무와 사원이름을 합쳐서 검색하라.
SELECT JOB||','||ENAME FROM EMP1;
-- 17.	입사일(hiredate) 사원이름을 ’80-12-17에 입사한 SMITH입니다’ 식으로 검색하라.
SELECT TO_CHAR(HIREDATE, 'YY-MM-DD') ||'에 입사한 '|| ENAME ||'입니다.' FROM EMP1;
-- 18.	10번 부서에 근무하는 사원이름을 검색하라.
SELECT ENAME FROM EMP1 WHERE DEPTNO = '10';

-- 19.	급여가 2000 이상인 사원들의 사원번호, 사원이름을 검색하라.
SELECT EMPNO,ENAME FROM EMP1 WHERE SAL >= 2000;
-- 20.	사원직무가 “CLERK”인 사원들의 사원번호, 사원이름을 검색하라.
SELECT EMPNO,ENAME FROM EMP1 WHERE JOB='CLERK';
-- 21.	1980년 12월 17일에 입사한 사원이름을 검색하라.
SELECT ENAME, HIREDATE FROM EMP1 WHERE HIREDATE='1980-12-17';
-- 22.	부서번호 30이외의 부서이름과 지역을 검색하라.
SELECT DNAME, LOC FROM DEPT1 WHERE DEPTNO <> 30;
-- 23.	급여등급이 5인 급여의 상위급여와 하위급여를 검색하라.
SELECT HISAL, LOSAL FROM SALGRADE1 WHERE GRADE=5;
-- 24.	‘WARD’사원의 모든 정보를 검색하라.
SELECT * FROM EMP1 WHERE ENAME='WARD';
-- 25.	10번 부서의 근무하는 MANAGER의 사원이름을 검색하라.
SELECT ENAME FROM EMP1 WHERE DEPTNO=10 AND JOB='MANAGER';
-- 26.	급여가 2000이상이며, 30번 부서에 근무하는 사원들의 사원번호와 사원이름을 검색하라.
SELECT EMPNO, ENAME FROM EMP1 WHERE SAL >= 2000 AND DEPTNO=30;
-- 27.	사원직무가 “CLERK”이며, 81년 이후에 입사한 사원들의 사원번호와 사원이름을 검색하라.
SELECT EMPNO, ENAME FROM EMP1 WHERE JOB='CLERK' AND TO_CHAR(HIREDATE, 'YY') > 81;
SELECT EMPNO, ENAME, HIREDATE FROM EMP1 WHERE JOB='CLERK' AND HIREDATE >= '1981-01-01';
SELECT EMPNO, ENAME, HIREDATE FROM EMP1 
WHERE JOB='CLERK' AND HIREDATE > TO_DATE('1981-01-01', 'YYYY-MM-DD');

SELECT empno, ename from emp1 where TO_NUMBER(TO_CHAR(hiredate,'yy')) >= 81 and job ='CLERK';

-- 28.	20부터 외에 근무하는 MANAGER의 사원이름을 검색하라.
SELECT ENAME FROM EMP1 WHERE DEPTNO<>20;
-- 29.	BOSTON이외 지역에 있는 부서이름을 검색하라.
SELECT DNAME FROM DEPT1 WHERE LOC<>'BOSTON';
-- 30.	SALEMAN이며 급여가 1500이상인 사원이름을 검색하라.
SELECT ENAME FROM EMP1 WHERE SAL >= 1500;
-- 31.	급여가 1000이상이며, 2500이하인 사원의 사원번호, 사원이름, 급여를 검색하라.
SELECT EMPNO, ENAME, SAL FROM EMP1 WHERE SAL BETWEEN 1000 AND 2500;
-- 32.	사원번호가 75XX인 사원의 사원번호, 사원이름, 부서번호를 검색하라.
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE EMPNO LIKE '75%';
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE EMPNO LIKE '75__';
-- 33.	부서번호가 10 또는 30에 근무하는 사원들의 사원이름과 급여를 검색하라.
SELECT ENAME, SAL FROM EMP1 WHERE DEPTNO IN (10, 30);
-- 34.	상급자사원번호가 76으로 시작하는 사원들의 사원이름을 검색하라.
SELECT ENAME FROM EMP1 WHERE MGR LIKE '76%';
-- 35.	사원번호가 79로 시작하는 사원들의 사원이름, 급여, 커미션을 검색하라.
SELECT ENAME, SAL, COMM FROM EMP1 WHERE EMPNO LIKE '79%';

-- 36.	1981년 2월에 입사한 사원의 사원번호, 사원이름, 부서번호를 검색하라.
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE TO_CHAR(HIREDATE, 'YYYY-MM') = '1981-02';
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE HIREDATE BETWEEN '1981-02-01' AND '1981-02-28';
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE HIREDATE BETWEEN '19810201' AND '19810228';
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE TO_CHAR(HIREDATE, 'YYYY-MM') LIKE '1981-02%';

SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE HIREDATE LIKE '1981-02-%';
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE HIREDATE LIKE '1981/02/%';
-- 현재 SYSDATE 설정과 같아야지 인식이 된다.

-- 기본 날짜 설정 변경
ALTER SESSION SET NLS_DATE_FORMAT='YYYY-MM-DD';
SELECT SYSDATE FROM DUAL;

-- 37.	사원이름 중간에 ‘A’가 들어있는 사원의 사원번호와 사원이름을 검색하라.
SELECT EMPNO, ENAME FROM EMP1 WHERE ENAME LIKE '%A%';
-- 38.	상급자사원번호가 NULL인 사원의 사원번호와 사원이름을 검색하라.
SELECT EMPNO, ENAME FROM EMP1 WHERE EMPNO IS NOT NULL;
-- 39.	상급자사원번호가 NULL이 아닌 사원의 사원번호, 이름, 상급자사원번호를 검색하라.
SELECT EMPNO, ENAME, MGR FROM EMP1 WHERE MGR IS NOT NULL;
-- 40.	사원번호가 7902 또는 7781인 사원이름을 검색하라.
SELECT ENAME FROM EMP1 WHERE EMPNO IN (7902, 7781);


-- 1.	상급자사원번호가 7698 또는 7839인 사원의 사원번호와 사원이름을 검색하라.
SELECT EMPNO, ENAME FROM EMP1 WHERE MGR IN(7698, 7839);
-- 2.	사원직무가 ‘MANAGER’ 또는 ‘SALESMAN’인 사원의 사원번호, 사원이름, 부서번호를 검색하라.
SELECT EMPNO, ENAME, DEPTNO, JOB FROM EMP1 WHERE JOB ='MANAGER' OR JOB='SALESMAN';
-- 3.	사원들의 사원번호와 사원이름을 사원번호 순으로 검색하라.
SELECT EMPNO, ENAME FROM EMP1 ORDER BY EMPNO;
-- 4.	사원들의 사원번호와 사원이름을 부서번호별 이름순으로 검색하라.
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 ORDER BY DEPTNO, ENAME;
-- 5.	사원들의 정보를 부서별 급여가 많은 순으로 검색하라.
SELECT * FROM EMP1 ORDER BY DEPTNO, SAL DESC;
-- 6.	사원들의 정보를 사원직무별 급여 순으로 검색하라.
SELECT * FROM EMP1 ORDER BY JOB, SAL DESC;
-- 7.	사원들의 정보를 부서번호별, 사원직무별, 급여 순으로 검색하라.
SELECT * FROM EMP1 ORDER BY DEPTNO, JOB, SAL DESC;
-- 8.	사원들의 사원이름을 소문자로 검색하라.
SELECT LOWER(ENAME) FROM EMP1;
-- 9.	사원들의 사원이름, 사원직무를 소문자로 검색하라.
SELECT LOWER(ENAME), LOWER(JOB) FROM EMP1;
-- 10.	사원들의 사원이름을 대문자로 검색하라.
SELECT UPPER(ENAME) FROM EMP1;
-- 11.	사원들의 사원이름, 사원직무를 대문자로 검색하라.
SELECT UPPER(ENAME), UPPER(JOB) FROM EMP1;
-- 12.	사원들의 사원이름을 첫자만 대문자로 검색하라.
SELECT INITCAP(ENAME) FROM EMP1;
-- 13.	사원들의 사원이름과 사원직무를 첫 자만 대문자로 검색하라.
SELECT INITCAP(ENAME), INITCAP(JOB) FROM EMP1;
-- 14.	사원들의 사원이름과 사원직무를 연결하여 검색하라.(concat이용)
SELECT CONCAT(ENAME, JOB) FROM EMP1;
-- 15.	사원들의 사원이름과 사원이름의 첫 두글자를 검색하라.
SELECT ENAME, SUBSTR(ENAME, 1,2) FROM EMP1;
-- 16.	사원들의 사원이름, 사원직무 그리고 사원직무의 두번째부터 세글자를 검색하라.
SELECT ENAME, JOB, SUBSTR(JOB, 2, 3) FROM EMP1;
-- 17.	사원들의 사원이름과 사원이름의 길이를 검색하라.
SELECT ENAME, LENGTH(ENAME) FROM EMP1;
-- 18.	사원들의 사원이름과 사원직무의 자리수를 검색하라.
SELECT ENAME, LENGTH(JOB) FROM EMP1;
-- 19.	사원들의 사원이름에 ‘A’가 몇번 째 위치에 있는지 검색하라.
SELECT ENAME, INSTR(ENAME, 'A') FROM EMP1;
-- 20.	사원직무에 ‘A’가 몇번 째 위치에 있는지 검색하라.
SELECT JOB, INSTR(JOB, 'A') FROM EMP1;
