select * from student;     select * from subject;     select * from enrol;

select stu_name, stu_dept from student where stu_dept = '컴퓨터정보';
select * from student where stu_weight BETWEEN 60 and 70;
select stu_name from student where stu_name like '김%';

-- 연산가능
select enr_grade, enr_grade+10 from enrol;
select enr_grade as 학점, enr_grade+10 as 상향조정 from enrol;

-- null
select stu_height from student where stu_height is null;
select stu_height from student where stu_height is not null;

-- 키를 100으로 나눠서 추출
select stu_height/100 from student;

select stu_no as 학번, stu_name as 이름, stu_dept as 학과
from student
where stu_dept in ('기계', '컴퓨터정보');

-- 16. 학생들의 학과, 학년 중복을 제거하고 검색하라.
select distinct stu_dept, stu_grade from student;
--17. 학생들의 학과, 반 중복을 제거하고 검색하라.
select distinct stu_dept,stu_class from student;
--18. 학생들의 체중을 5만큼 증가시킨 값을 검색하라. 
select stu_weight+5 from student;
--19. 학생들의 체중을 5만큼 감소시킨 값을 검색하라. 
select stu_weight-5 from student;
--20. 학생들의 학번과 이름을 별칭 "학번", "이름"으로 부여하여 검색하라.
select stu_no as 학번, stu_name as 이름 from student;
​
--21. 수강(enrol)테이블의 모든 정보를 검색하라.
select * from enrol;
--22. 학생 테이블에서 학과명과 이름을 합쳐서 검색하라.(||)
select stu_dept || stu_name from student;
--23. 학생의 이름과 학과를 '컴퓨터정보과 옥한빛입니다'식으로 검색하라.
select stu_dept ||' '|| stu_name||'입니다' from student;
--24. 컴퓨터정보 학생들을 검색하라.
select * from student where stu_dept = '컴퓨터정보';
--25. 기계과 학생들을 검색하라.
select * from student where stu_dept = '기계';
select * from student where stu_dept<>'기계';

-- 26. 전기전자과 학생들을 검색하라.
select * from student where stu_dept = '전기전자';
-- 27. 신장이 170이상인 학생들을 검색하라.
select * from student where stu_height >= '170';
-- 28. 체중이 65이상인 학생들을 검색하라.
select * from student where stu_weight >= '65';
-- 29. 기계 학생들의 학번, 이름을 검색하라.
select stu_no, stu_name from student where stu_dept = '기계';
-- 30. 컴퓨터정보 학생들의 학번, 이름을 검색하라.
select stu_no, stu_name from student where stu_dept = '컴퓨터정보';
​
-- 31. 남학생의 이름을 검색하라.
select stu_name from student where stu_gender<>'F';
-- 32. 전기전자과 이외 학생들의 모든 정보를 검색하라.
select * from student where stu_dept<>'전기전자';
-- 33. 점수가 80점 이상인 학생들의 학번을 검색하라.
select * from enrol where enr_grade >= '80';
-- 34. '김인중'학생의 모든 정보를 검색하라.
select * from student where stu_name like '김인중';
select * from student where stu_name = '김인중';
-- 35. '기계'과 이고 2학년인 학생들의 모든 정보를 검색하라. 
select * from student where stu_dept='기계' and stu_grade=2;

-- 36. 성별이 여학생이며, 체중이 60이하인 학생을 모두 검색하라.
select * from student where stu_gender='F' and stu_weight <= 60;
-- 37.'컴퓨터정보'외에 1학년 학생들의 이름을 검색하라.
select * from student where stu_dept<>'컴퓨터정보' and stu_grade =1;
-- 38. 학과 중 '기계'이외의 학과를 검색하라.
select stu_dept from student where stu_dept<>'기계';
select stu_dept from student where stu_dept not in '기계';
-- 39. 컴퓨터정보과 2학년 A반 학생의 이름을 검색하라.
select * from student where stu_dept='컴퓨터정보' and stu_grade =2 and stu_class='A';
-- 40. 신장이 160이상이며 170이하인 학생의 학번과 이름을 검색하라
select stu_no, stu_name from student where stu_height>= 160 and stu_height<=170;
select stu_no, stu_name from student where stu_height between 160 and 170;


-- 정렬
SELECT STU_NO, STU_NAME FROM STUDENT ORDER BY STU_HEIGHT;

SELECT STU_NO, STU_NAME, STU_DEPT, STU_WEIGHT-5 AS WEI FROM STUDENT
ORDER BY WEI;

SELECT STU_NO, STU_NAME, STU_DEPT, STU_WEIGHT-5 AS WEI FROM STUDENT
ORDER BY 2;

-- 학과별 체중 순 정렬
SELECT STU_NO, STU_NAME, STU_DEPT, STU_WEIGHT-5 AS WEI FROM STUDENT
ORDER BY STU_DEPT, WEI;

SELECT STU_NO, STU_NAME, STU_DEPT, STU_WEIGHT-5 AS WEI FROM STUDENT
ORDER BY STU_DEPT, WEI DESC;


-- 숫자형 함수
SELECT ROUND (345.678) FROM DUAL;
SELECT ROUND (345.678, 2) FROM DUAL;
SELECT ROUND (345.678, -1) FROM DUAL;

SELECT TRUNC (123.456, 2) FROM DUAL;    -- 123.45
SELECT TRUNC (123.456, -1) FROM DUAL;   -- 120

SELECT MOD (10, 5) FROM DUAL;

-- 문자
SELECT UPPER ('korea') FROM DUAL;   -- 대문자 변환
SELECT INITCAP ('korea') FROM DUAL;   -- 첫글자만 대문자 변환
SELECT CONCAT('korea', 'japan') FROM DUAL;  -- koreajapan
SELECT SUBSTR ('korea', 2, 3) FROM DUAL;    -- 2번째 글자부터 3개 글자 추출

SELECT * FROM STUDENT;

-- 2013학번인 학생의 학번과 이름, 학과를 검색
SELECT STU_NO, STU_NAME FROM STUDENT WHERE STU_NO LIKE '2013%';
-- 1,3 학년학생들의 모든 정보
SELECT * FROM STUDENT WHERE STU_GRADE='1' OR STU_GRADE='3';
SELECT * FROM STUDENT WHERE STU_GRADE IN (1,3);
SELECT STU_NO, STU_NAME FROM STUDENT WHERE STU_NAME LIKE '김%';
