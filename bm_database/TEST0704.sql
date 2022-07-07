-- 환자테이블 생성
create table PATIENT(
  P_NO NUMBER NOT NULL PRIMARY KEY,
  P_NAME VARCHAR2(50),
  P_GRADE NUMBER,
  P_ADR VARCHAR2(50),
  P_PHONE VARCHAR2(50),
  P_DEPT VARCHAR2(50)
);

SELECT * FROM PATIENT;

-- 병원테이블 생성
CREATE TABLE HOSPITAL(
  H_NO NUMBER NOT NULL PRIMARY KEY,
  H_NAME VARCHAR2(50),
  H_DEPT VARCHAR2(100)
);

SELECT * FROM HOSPITAL;

-- 등록 테이블 생성
CREATE TABLE EN(
  E_NO NUMBER NOT NULL PRIMARY KEY,
  E_DATE DATE,
  P_NO NUMBER,
  E_PRICE NUMBER,
  E_RENTFEE NUMBER,
  H_NO NUMBER,
  CONSTRAINT EN_P_NO FOREIGN KEY(P_NO) REFERENCES PATIENT(P_NO),
  CONSTRAINT EN_H_NO FOREIGN KEY(H_NO) REFERENCES HOSPITAL(H_NO)
);

SELECT * FROM EN;

-- 환자데이터 입력
insert into patient values(1001,'김철수',1,'서울 송파구','02-455-5544','내과');
insert into patient values(1002,'김민혁',2,'서울 강서구','02-299-2565','이비인후과');
insert into patient values(1003,'양종현',3,'서울 서초구','02-555-5555','소아과');
insert into patient values(1004,'김진숙',1,'서울 강남구','02-444-4444','소아과');
insert into patient values(1005,'최현철',3,'서울 은평구','02-123-4544','정형외과');
insert into patient values(1006,'박민재',3,'서울 강동구','02-442-4844','안과');

--병원 데이터 입력
insert into hospital values(1,'김영철','내과');
insert into hospital values(2,'이다해','소아과');
insert into hospital values(3,'김사라','소아과');
insert into hospital values(4,'연아람','정형외과');
insert into hospital values(5,'고광훈','안과');
insert into hospital values(6,'이승철','이비인후과');

-- 등록 데이터 입력
insert into en values(1,'2022-06-06',1001,250000,605,1);
insert into en values(2,'2022-06-30',1003,570000,303,2);
insert into en values(3,'2022-07-02',1006,550000,201,5);
insert into en values(4,'2022-07-01',1002,830000,204,6);
insert into en values(5,'2022-07-02',1005,300000,345,4);
insert into en values(6,'2022-07-03',1004,500000,602,2);

-- 4. 
DESC HOSPITAL;


-- 5.	환자 테이블의 환자이름, 등급, 주소를 검색해라. 
SELECT P_NAME, P_GRADE, P_ADR FROM PATIENT;

-- 6.	의사이름과 병원과를 합쳐서 검색해라. 
SELECT CONCAT(H_NAME, H_DEPT) FROM HOSPITAL;

-- 7.	양종현 환자가 등록한 의사 이름과 병원과를 검색해라. (equi join) 
SELECT H_NAME, H_DEPT, P_NAME
    FROM HOSPITAL H, PATIENT P, EN E
  WHERE E.P_NO = P.P_NO
    AND H.H_NO = E.H_NO
    AND P.P_NAME = '양종현';

--8.	소아과를 등록한 환자들의 환자번호와 이름을 검색해라. 
SELECT P_NO, P_NAME FROM PATIENT WHERE P_DEPT = '소아과';

--9.	등급이 1등급인 환자가 등록한 의사 이름을 모두 검색해라. 
SELECT H_NAME
 FROM HOSPITAL H, PATIENT P
WHERE H.H_DEPT = P.P_DEPT
AND P_GRADE=1;

-- 10.	금액이 50만원 이상인 환자의 수를 검색해라.
SELECT COUNT(*) FROM EN WHERE E_PRICE >= 500000;


--11.	환자번호가 1003 이외의 환자이름과 주소를 검색해라.
SELECT P_NAME, P_ADR
FROM PATIENT
WHERE P_NO <> 1003;

-- 12.	금액이 50만원 이상이고 201호에 입원한 환자들의 번호와 과 번호를 검색해라.
SELECT P.P_NO, P_DEPT
    FROM PATIENT P, EN E
  WHERE P.P_NO=E.P_NO
    AND E_PRICE>=500000 AND E_RENTFEE=201;

--13.	환자이름이 김씨 성을 가진 환자들을 검색해라.
SELECT * FROM PATIENT WHERE P_NAME LIKE '김%';

--14.	병원과가 소아과나 내과인 의사이름을 검색해라.
SELECT H_NAME FROM HOSPITAL WHERE H_DEPT='소아과' OR H_DEPT='내과';

--15.	금액이 25만원이면 10%로 할인, 57만원이면 20%로 할인하는 코드를 select ~case문을 사용하여 검색해라.
SELECT 
    CASE WHEN E_PRICE = 250000 THEN E_PRICE*0.9
         WHEN E_PRICE = 570000 THEN E_PRICE*0.8
         ELSE E_PRICE
    END AS 할인금액
  FROM EN;

--16.	등급이 3인 환자들만 선택하여 등록한 병원과로 그룹화하고 그룹별 환자수를 구한다.
SELECT COUNT(*) FROM PATIENT  WHERE P_GRADE=3 GROUP BY P_DEPT;

--17.	김민혁 환자가 등록한 의사 이름과 등록한 병원과를 검색하는데 equi join, natural join, join~using을 각각 사용해라.
SELECT H_NAME AS 의사명, H_DEPT AS 병원과
    FROM HOSPITAL H, PATIENT P, EN E
  WHERE E.P_NO = P.P_NO
    AND H.H_NO = E.H_NO
    AND P.P_NAME = '김민혁'; 

SELECT H_NAME AS 의사명, H_DEPT AS 병원과
    FROM HOSPITAL NATURAL JOIN EN
  WHERE P_NO =(SELECT P_NO FROM PATIENT WHERE P_NAME='김민혁');
  
SELECT  H_NAME AS 의사명, H_DEPT AS 병원과
    FROM HOSPITAL JOIN EN USING(H_NO)
  WHERE P_NO =(SELECT P_NO FROM PATIENT WHERE P_NAME='김민혁');

-- 18.	이승철 교수가 진료하는 병원과에 등록한 환자이름을 검색해라.
SELECT P.P_NAME
    FROM HOSPITAL H, PATIENT P, EN E
  WHERE E.P_NO = P.P_NO
    AND H.H_NO = E.H_NO
    AND H.H_NAME = '이승철'; 

--19.	이비인후과에 등록한 환자들의 환자번호와 이름을 검색해라.
SELECT P_NO, P_NAME FROM PATIENT WHERE P_DEPT='이비인후과';


--여기서부터  a_en테이블을 조작해라-- (20~ 26번까지)
-- 20.	환자번호가 1004보다 작은 값만 나오도록 등록 테이블을 복사하여 a_en 테이블을 만든다. (5점)
CREATE TABLE A_EN AS SELECT * FROM EN WHERE P_NO < 1004;



-- 21.	위에서 만든 테이블에 (7, 2022-07-01, 1007, 70,000, 202, 3)을 삽입한다.
INSERT INTO A_EN VALUES (7, TO_DATE('2022-07-01', 'YYYY/MM/DD'), 1007, 70000, 202, 3);


--22.	 ‘10’ 으로 시작하는 환자번호를 a_en 테이블에 삽입한후, 내용을 확인해라. 
INSERT INTO A_EN SELECT * FROM EN WHERE P_NO LIKE '10%';

SELECT * FROM A_EN;

--23.	환자번호가 1001일 때 대여료를 1000원씩 증가시켜 변경해라.
UPDATE A_EN SET E_PRICE = E_PRICE+1000 WHERE P_NO=1001;

-- 24.	등록번호 3에 금액을 5만원씩 증가시켜라.
UPDATE A_EN SET E_PRICE = E_PRICE+50000 WHERE E_NO=3;

-- 25.	이비인후과 금액을 3만원 증가시켜라.
UPDATE A_EN SET E_PRICE = E_PRICE+30000 WHERE E_NO=(SELECT H_NO FROM HOSPITAL WHERE H_DEPT='이비인후과');

-- 26.	병원과가 소아과인 데이터들의 뷰를 생성해라.
CREATE OR REPLACE VIEW V_HOSPITAL
    AS SELECT A.E_NO, A.E_DATE FROM  A_EN A, hospital H
  WHERE A.H_NO = H.H_NO
    AND H.H_DEPT = '소아과';

SELECT * FROM V_HOSPITAL;

-- 27.	등록 테이블에서 금액이 큰 상위 5명의 환자번호, 입원실을 검색해라.(금액은 큰 순서대로 출력)
SELECT P_NO, E_RENTFEE FROM A_EN WHERE ROWNUM <= 5 ORDER BY E_PRICE DESC;

-- 28.	환자번호와 환자이름을 입력하여 
-- 해당 환자의 환자이름을 수정하는 프로시저를 만들어라.
-- (프로시저명은 pa, 환자번호는 1003으로 입력하고, 환자이름을 이철수로 수정)
CREATE OR REPLACE PROCEDURE PA
(
  V_P_NAME IN PATIENT.P_NAME%TYPE,
  V_p_no IN PATIENT.P_NO%TYPE
)
IS
BEGIN
  UPDATE PATIENT
  SET P_NAME = V_P_NAME
    WHERE P_NO = V_p_no;
END PA;
/
variable NAME varchar2;
variable NO NUMBER;
execute PA('이철수', 1003);

SELECT * FROM PATIENT;

-- 29.	과번호와 환자번호를 입력받아 
-- 환자의 금액을 할인해주고 결과를 출력하는 프로시저 만들어라. (프로시저명: discount) -> 임의의 값으로 할인
SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE discount
(
  V_H_NO IN A_EN.H_NO%TYPE,
  V_p_no IN A_EN.P_NO%TYPE
)
IS
  E_PRICE NUMBER;
BEGIN
  SELECT (E_PRICE*0.5) INTO E_PRICE
  FROM A_EN
  WHERE H_NO = V_H_NO
  AND P_NO = V_p_no;
  
END discount;
/

VARIABLE E_PRICE NUMBER;
execute discount(3, 1007);
PRINT E_PRICE;

select * from a_en;

-- 30.	과번호가 1일 때 환자번호와 금액을 구해라. (커서 사용)
declare
  v_h_no_row h_no%rowtype;
  
  CURSOR c1 (hno a_en.h_no%type) is
    select p_no, e_price
      from a_en
    where h_no = v_h_no;
begin
  open c1 (1);
    loop
      fetch c1 into v_h_no_row;
      exit when c1%notfound;
      dbms_output.put_line( p_no, e_price);
    end loop;
  close c1;
end;
/

----------------------------------
29.   과번호와 환자번호를 입력받아 환자의 금액을 할인해주고 결과를 출력하는 프로시저 만들어라. (프로시저명:discount)
set serveroutput on

create or replace procedure discount(
  v_h_no in en.h_no%type,
  v_p_no in en.p_no%type)
is
  v_e_price en.e_price%type;
begin
  select e_price*0.9 into v_e_price from en
  where h_no=v_h_no and p_no=v_p_no;
  dbms_output.put_line('할인된 금액: '||v_e_price);
end discount;
/

execute discount(1, 1001);
select * from en;
--30.   과번호가 1일 때 환자번호와 금액을 구해라. (커서 사용)
set serveroutput on

create or replace procedure test_curs
is
    v_p_no en.p_no%type;
    v_e_price en.e_price%type;
    cursor t_cursor is
        select p_no, e_price from en
        where h_no=1;
    begin
        open t_cursor;
    loop
        fetch t_cursor into v_p_no, v_e_price;
        exit when t_cursor%NOTFOUND;
        dbms_output.put_line(v_p_no||' '||v_e_price);
    end loop;
    close t_cursor;
end test_curs;
/

execute test_curs;










