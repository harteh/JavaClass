-- 서브쿼리
-- '옥성우' 학생보다 키가 큰 학생들의 학번, 이름, 키 검색
SELECT STU_HEIGHT
    FROM STUDENT
  WHERE STU_NAME = '옥성우';
  
SELECT STU_NO, STU_NAME, STU_HEIGHT
    FROM STUDENT
  WHERE STU_HEIGHT > (SELECT STU_HEIGHT
                          FROM STUDENT
                        WHERE STU_NAME = '옥성우');
                        
-- 박희철과 같은 몸무게를 가지고 있는 학생의 모든 정보 검색
SELECT *
    FROM STUDENT
  WHERE STU_WEIGHT = (SELECT STU_WEIGHT 
                          FROM STUDENT 
                        WHERE STU_NAME='박희철') 
                        AND STU_NAME<>'박희철';
  
-- 키가 전체 학생들의 평균 키 보다 큰 학생
SELECT * 
    FROM STUDENT
  WHERE STU_HEIGHT > (SELECT AVG(STU_HEIGHT)
                          FROM STUDENT);
--
SELECT * FROM STUDENT
  WHERE STU_CLASS 
  IN(SELECT STU_CLASS FROM STUDENT
     WHERE STU_DEPT='컴퓨터정보') AND STU_DEPT<>'컴퓨터정보';
        
-- 9. BLAKE 사원보다 많은 급여를 받는 사원이름을검색하라. (부질의)
SELECT ENAME, SAL
    FROM EMP1
  WHERE SAL > (SELECT SAL FROM EMP1 WHERE ENAME = 'BLAKE');
-- 10. FORD 사원과 같은 부서에 근무하는 사원이름을 검색하라. (부질의)
SELECT ENAME, DEPTNO
    FROM EMP1
  WHERE DEPTNO = (SELECT DEPTNO FROM EMP1 WHERE ENAME = 'FORD');

