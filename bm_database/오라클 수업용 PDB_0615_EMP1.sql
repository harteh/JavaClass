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

-- 4.	???????????? ????????????, ????????????, ??????????????? ????????????.
SELECT EMPNO, ENAME, JOB FROM EMP1;
-- 5.	????????? ??????????????? ??????????????? ????????????.
SELECT DEPTNO, DNAME FROM DEPT1;
-- 6.	????????? ??????????????? ????????? ????????????.
SELECT DNAME, LOC FROM DEPT1;
-- 7.	???????????? ????????? ???????????? ????????????.
SELECT SAL, COMM FROM EMP1;
-- 8.	???????????? ????????? ????????? ???????????? ????????????.
SELECT DISTINCT(HIREDATE) FROM EMP1;
-- 9.	???????????? ?????????????????????(mgr)????????? ???????????? ????????????.
SELECT DISTINCT(MGR) FROM EMP1;
-- 10.	???????????? ???????????? ????????? ???????????? ????????????.
SELECT DISTINCT(DEPTNO) FROM EMP1;
-- 11.	???????????? ????????? 6?????? ????????? ????????????.
SELECT ENAME, SAL AS ??????, (SAL*6) FROM EMP1;

-- 12.	???????????? 6?????? ?????????(comm)??? ?????? ????????????.
SELECT SUM(COMM)*6 AS ??????????????? FROM EMP1;

-- 13.	??????????????? ???name????????? ????????? ????????? ???salary?????? ?????? ????????? ???????????? ????????????.
SELECT ENAME AS NAME, SAL AS SALARY FROM EMP1;
-- 14.	????????? ????????????, ????????????, ?????????, ??????????????? ????????? ????????? ????????????.
SELECT EMPNO AS ????????????, ENAME AS ????????????, HIREDATE AS ?????????, DEPTNO AS ???????????? FROM EMP1;
-- 15.	????????????, ????????????, ????????? ?????? ???????????? ????????????.
SELECT DEPTNO AS ????????????, DNAME AS ????????????, LOC AS ?????? FROM DEPT1;

-- 16.	????????? ??????????????? ??????????????? ????????? ????????????.
SELECT JOB||','||ENAME FROM EMP1;
-- 17.	?????????(hiredate) ??????????????? ???80-12-17??? ????????? SMITH???????????? ????????? ????????????.
SELECT TO_CHAR(HIREDATE, 'YY-MM-DD') ||'??? ????????? '|| ENAME ||'?????????.' FROM EMP1;
-- 18.	10??? ????????? ???????????? ??????????????? ????????????.
SELECT ENAME FROM EMP1 WHERE DEPTNO = '10';

-- 19.	????????? 2000 ????????? ???????????? ????????????, ??????????????? ????????????.
SELECT EMPNO,ENAME FROM EMP1 WHERE SAL >= 2000;
-- 20.	??????????????? ???CLERK?????? ???????????? ????????????, ??????????????? ????????????.
SELECT EMPNO,ENAME FROM EMP1 WHERE JOB='CLERK';
-- 21.	1980??? 12??? 17?????? ????????? ??????????????? ????????????.
SELECT ENAME, HIREDATE FROM EMP1 WHERE HIREDATE='1980-12-17';
-- 22.	???????????? 30????????? ??????????????? ????????? ????????????.
SELECT DNAME, LOC FROM DEPT1 WHERE DEPTNO <> 30;
-- 23.	??????????????? 5??? ????????? ??????????????? ??????????????? ????????????.
SELECT HISAL, LOSAL FROM SALGRADE1 WHERE GRADE=5;
-- 24.	???WARD???????????? ?????? ????????? ????????????.
SELECT * FROM EMP1 WHERE ENAME='WARD';
-- 25.	10??? ????????? ???????????? MANAGER??? ??????????????? ????????????.
SELECT ENAME FROM EMP1 WHERE DEPTNO=10 AND JOB='MANAGER';
-- 26.	????????? 2000????????????, 30??? ????????? ???????????? ???????????? ??????????????? ??????????????? ????????????.
SELECT EMPNO, ENAME FROM EMP1 WHERE SAL >= 2000 AND DEPTNO=30;
-- 27.	??????????????? ???CLERK?????????, 81??? ????????? ????????? ???????????? ??????????????? ??????????????? ????????????.
SELECT EMPNO, ENAME FROM EMP1 WHERE JOB='CLERK' AND TO_CHAR(HIREDATE, 'YY') > 81;
SELECT EMPNO, ENAME, HIREDATE FROM EMP1 WHERE JOB='CLERK' AND HIREDATE >= '1981-01-01';
SELECT EMPNO, ENAME, HIREDATE FROM EMP1 
WHERE JOB='CLERK' AND HIREDATE > TO_DATE('1981-01-01', 'YYYY-MM-DD');

SELECT empno, ename from emp1 where TO_NUMBER(TO_CHAR(hiredate,'yy')) >= 81 and job ='CLERK';

-- 28.	20?????? ?????? ???????????? MANAGER??? ??????????????? ????????????.
SELECT ENAME FROM EMP1 WHERE DEPTNO<>20;
-- 29.	BOSTON?????? ????????? ?????? ??????????????? ????????????.
SELECT DNAME FROM DEPT1 WHERE LOC<>'BOSTON';
-- 30.	SALEMAN?????? ????????? 1500????????? ??????????????? ????????????.
SELECT ENAME FROM EMP1 WHERE SAL >= 1500;
-- 31.	????????? 1000????????????, 2500????????? ????????? ????????????, ????????????, ????????? ????????????.
SELECT EMPNO, ENAME, SAL FROM EMP1 WHERE SAL BETWEEN 1000 AND 2500;
-- 32.	??????????????? 75XX??? ????????? ????????????, ????????????, ??????????????? ????????????.
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE EMPNO LIKE '75%';
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE EMPNO LIKE '75__';
-- 33.	??????????????? 10 ?????? 30??? ???????????? ???????????? ??????????????? ????????? ????????????.
SELECT ENAME, SAL FROM EMP1 WHERE DEPTNO IN (10, 30);
-- 34.	???????????????????????? 76?????? ???????????? ???????????? ??????????????? ????????????.
SELECT ENAME FROM EMP1 WHERE MGR LIKE '76%';
-- 35.	??????????????? 79??? ???????????? ???????????? ????????????, ??????, ???????????? ????????????.
SELECT ENAME, SAL, COMM FROM EMP1 WHERE EMPNO LIKE '79%';

-- 36.	1981??? 2?????? ????????? ????????? ????????????, ????????????, ??????????????? ????????????.
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE TO_CHAR(HIREDATE, 'YYYY-MM') = '1981-02';
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE HIREDATE BETWEEN '1981-02-01' AND '1981-02-28';
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE HIREDATE BETWEEN '19810201' AND '19810228';
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE TO_CHAR(HIREDATE, 'YYYY-MM') LIKE '1981-02%';

SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE HIREDATE LIKE '1981-02-%';
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 WHERE HIREDATE LIKE '1981/02/%';
-- ?????? SYSDATE ????????? ???????????? ????????? ??????.

-- ?????? ?????? ?????? ??????
ALTER SESSION SET NLS_DATE_FORMAT='YYYY-MM-DD';
SELECT SYSDATE FROM DUAL;

-- 37.	???????????? ????????? ???A?????? ???????????? ????????? ??????????????? ??????????????? ????????????.
SELECT EMPNO, ENAME FROM EMP1 WHERE ENAME LIKE '%A%';
-- 38.	???????????????????????? NULL??? ????????? ??????????????? ??????????????? ????????????.
SELECT EMPNO, ENAME FROM EMP1 WHERE EMPNO IS NOT NULL;
-- 39.	???????????????????????? NULL??? ?????? ????????? ????????????, ??????, ???????????????????????? ????????????.
SELECT EMPNO, ENAME, MGR FROM EMP1 WHERE MGR IS NOT NULL;
-- 40.	??????????????? 7902 ?????? 7781??? ??????????????? ????????????.
SELECT ENAME FROM EMP1 WHERE EMPNO IN (7902, 7781);


-- 1.	???????????????????????? 7698 ?????? 7839??? ????????? ??????????????? ??????????????? ????????????.
SELECT EMPNO, ENAME FROM EMP1 WHERE MGR IN(7698, 7839);
-- 2.	??????????????? ???MANAGER??? ?????? ???SALESMAN?????? ????????? ????????????, ????????????, ??????????????? ????????????.
SELECT EMPNO, ENAME, DEPTNO, JOB FROM EMP1 WHERE JOB ='MANAGER' OR JOB='SALESMAN';
-- 3.	???????????? ??????????????? ??????????????? ???????????? ????????? ????????????.
SELECT EMPNO, ENAME FROM EMP1 ORDER BY EMPNO;
-- 4.	???????????? ??????????????? ??????????????? ??????????????? ??????????????? ????????????.
SELECT EMPNO, ENAME, DEPTNO FROM EMP1 ORDER BY DEPTNO, ENAME;
-- 5.	???????????? ????????? ????????? ????????? ?????? ????????? ????????????.
SELECT * FROM EMP1 ORDER BY DEPTNO, SAL DESC;
-- 6.	???????????? ????????? ??????????????? ?????? ????????? ????????????.
SELECT * FROM EMP1 ORDER BY JOB, SAL DESC;
-- 7.	???????????? ????????? ???????????????, ???????????????, ?????? ????????? ????????????.
SELECT * FROM EMP1 ORDER BY DEPTNO, JOB, SAL DESC;
-- 8.	???????????? ??????????????? ???????????? ????????????.
SELECT LOWER(ENAME) FROM EMP1;
-- 9.	???????????? ????????????, ??????????????? ???????????? ????????????.
SELECT LOWER(ENAME), LOWER(JOB) FROM EMP1;
-- 10.	???????????? ??????????????? ???????????? ????????????.
SELECT UPPER(ENAME) FROM EMP1;
-- 11.	???????????? ????????????, ??????????????? ???????????? ????????????.
SELECT UPPER(ENAME), UPPER(JOB) FROM EMP1;
-- 12.	???????????? ??????????????? ????????? ???????????? ????????????.
SELECT INITCAP(ENAME) FROM EMP1;
-- 13.	???????????? ??????????????? ??????????????? ??? ?????? ???????????? ????????????.
SELECT INITCAP(ENAME), INITCAP(JOB) FROM EMP1;
-- 14.	???????????? ??????????????? ??????????????? ???????????? ????????????.(concat??????)
SELECT CONCAT(ENAME, JOB) FROM EMP1;
-- 15.	???????????? ??????????????? ??????????????? ??? ???????????? ????????????.
SELECT ENAME, SUBSTR(ENAME, 1,2) FROM EMP1;
-- 16.	???????????? ????????????, ???????????? ????????? ??????????????? ??????????????? ???????????? ????????????.
SELECT ENAME, JOB, SUBSTR(JOB, 2, 3) FROM EMP1;
-- 17.	???????????? ??????????????? ??????????????? ????????? ????????????.
SELECT ENAME, LENGTH(ENAME) FROM EMP1;
-- 18.	???????????? ??????????????? ??????????????? ???????????? ????????????.
SELECT ENAME, LENGTH(JOB) FROM EMP1;
-- 19.	???????????? ??????????????? ???A?????? ?????? ??? ????????? ????????? ????????????.
SELECT ENAME, INSTR(ENAME, 'A') FROM EMP1;
-- 20.	??????????????? ???A?????? ?????? ??? ????????? ????????? ????????????.
SELECT JOB, INSTR(JOB, 'A') FROM EMP1;
