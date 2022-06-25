CREATE TABLE CUSTOMER_0625(
  c_code varchar2(4) not null,
  c_name varchar2(30),
  c_ceo varchar2(12),
  c_addr varchar2(100),
  c_phone varchar2(13),
  constraint customer0625_pk primary key(c_code)
);
insert into CUSTOMER_0625 values('101','늘푸른회사','김수종','경기도 안산시','010-1234-5678');
insert into CUSTOMER_0625 values('102','사랑과바다','박나리','경기도 평택시','010-1122-3344');
insert into CUSTOMER_0625 values('103','대한회사','이민수','서울시 구로구','010-3785-8809');
insert into CUSTOMER_0625 values('104','하얀기판','허진수','경상북도 포항시','010-8569-3468');
insert into CUSTOMER_0625 values('105','한마음한뜻','하민우','인천시 남동구','010-9455-6033');


CREATE TABLE PRODUCT_0625(
  p_code char(3) not null,
  p_name varchar2(30),
  p_cost number,
  p_group varchar2(30),
  constraint product0625_pk primary key(p_code)
);
insert into PRODUCT_0625 values('101','19인치 모니터',150000,'모니터');
insert into PRODUCT_0625 values('102','22인치 모니터',200000,'모니터');
insert into PRODUCT_0625 values('103','25인치',260000,'모니터');
insert into PRODUCT_0625 values('201','유선마우스',7000,'마우스');
insert into PRODUCT_0625 values('202','무선마우스',18000,'마우스');
insert into PRODUCT_0625 values('301','유선키보드',8000,'키보드');
insert into PRODUCT_0625 values('302','무선키보드',22000,'키보드');
insert into PRODUCT_0625 values('401','2채널 스피커',10000,'스피커');
insert into PRODUCT_0625 values('402','5.1채널 스피커',120000,'스피커');


CREATE TABLE STOCK_0625(
  p_code char(3) not null,
  s_qty number not null,
  s_lastdate date,
  constraint stock_pk1 primary key(p_code,s_qty)
);
insert into STOCK_0625 values('101',50,to_date('2016-04-1','yyyy-mm-dd'));
insert into STOCK_0625 values('102',20,to_date('2016-04-26','yyyy-mm-dd'));
insert into STOCK_0625 values('103',5,to_date('2016-05-20','yyyy-mm-dd'));
insert into STOCK_0625 values('201',2,to_date('2016-04-13','yyyy-mm-dd'));
insert into STOCK_0625 values('202',15,to_date('2016-06-02','yyyy-mm-dd'));
insert into STOCK_0625 values('301',0,to_date('2016-05-02','yyyy-mm-dd'));
insert into STOCK_0625 values('302',20,to_date('2016-06-09','yyyy-mm-dd'));
insert into STOCK_0625 values('401',10,to_date('2016-06-15','yyyy-mm-dd'));
insert into STOCK_0625 values('402',7,to_date('2016-05-08','yyyy-mm-dd'));


CREATE TABLE TRADE_0625(
  t_seq number not null,
  p_code char(3),
  c_code varchar2(4),
  t_date date,
  t_qty number,
  t_cost number,
  t_tax number,
  constraint trade0625_pk primary key(t_seq)
);
insert into TRADE_0625
  values (61,'131','101',to_date('2016-04-01','yyyy-mm-dd'),10,150000,150000);
insert into TRADE_0625
  values (5,'102','102',to_date('2016-04-26','yyyy-mm-dd'),8,200000,160000);
insert into TRADE_0625
  values (8,'103','101',to_date('2016-05-20','yyyy-mm-dd'),2,260000,52000);
insert into TRADE_0625
  values (3,'201','103',to_date('2016-04-13','yyyy-mm-dd'),7,7000,4900);
insert into TRADE_0625
  values (2,'201','101',to_date('2016-04-12','yyyy-mm-dd'),5,7000,3500);
insert into TRADE_0625
  values (9,'202','104',to_date('2016-06-02','yyyy-mm-dd'),8,18000,14400);
insert into TRADE_0625
  values (6,'301','103',to_date('2016-05-02','yyyy-mm-dd'),12,8000,9600);
insert into TRADE_0625
  values (10,'302','103',to_date('2016-06-09','yyyy-mm-dd'),9,22000,19800);
insert into TRADE_0625
  values (4,'401','104',to_date('2016-04-20','yyyy-mm-dd'),15,10000,15000);
insert into TRADE_0625
  values (11,'401','105',to_date('2016-06-15','yyyy-mm-dd'),20,10000,20000);
insert into TRADE_0625
  values (7,'402','102',to_date('2016-05-08','yyyy-mm-dd'),5,120000,60000);

SELECT * FROM CUSTOMER_0625;
SELECT * FROM PRODUCT_0625;
SELECT * FROM STOCK_0625;
SELECT * FROM TRADE_0625;

-- 1.	상품 정보(PRODUCT_0625)테이블에 열 이름이 ‘비고’ 라는 열을 varchar2(20)으로 삽입해라.
ALTER TABLE PRODUCT_0625
  ADD 비고 VARCHAR2(20);

-- 2.	1번에서 삽입한 열이 상품 정보(PRODUCT_0625)테이블에 삽입되었는지 확인해라.
SELECT * FROM PRODUCT_0625;

-- 3.	상품 정보(PRODUCT_0625)테이블에 ‘비고’ 열의 구조를 char(3)으로 변경해라.
ALTER TABLE PRODUCT_0625
  MODIFY 비고 CHAR(3);
  
DESC PRODUCT_0625;
-- 4.	상품코드 401에 대한 거래내역 뷰(v_trade)를 만들어라.
CREATE OR REPLACE VIEW V_TRADE
  AS ( SELECT * FROM PRODUCT_0625 NATURAL JOIN STOCK_0625
        WHERE P_CODE = 401);

SELECT * FROM V_TRADE;
-- 5.	상품 정보(PRODUCT_0625)테이블에 가장 최근에 들어온 거래처 코드 정보를 검색해라(top-n질의)
-- 상품정보 테이블의 상품 중 가장 최근에 거래된(들어온) 상품의 거래처 코드
SELECT C_CODE FROM TRADE_0625
  WHERE T_DATE = (SELECT MAX(T_DATE) FROM TRADE_0625);

-- 6.	상품을 삽입하는 프로시저를 생성해라.
  /*  (이미 p_code가 들어있다 부분은 예외처리 시켜라.) 
      ->기본키신경쓰지 말고 이미 들어있는 데이터면 예외처리 시켜라.
        execute p_pro(‘101’, ’7.1채널 스피커’, 180000, ‘스피커’);
          이미 p_code가 들어있다.
        execute p_pro(‘403’, ’7.1채널 스피커’, 180000, ‘스피커’);
          완료되었다.
  */
CREATE OR REPLACE PROCEDURE ADDPRO01
(
  V_P_CODE PRODUCT_0625.P_CODE%TYPE,
  V_P_NAME PRODUCT_0625.P_NAME%TYPE,
  V_P_COST PRODUCT_0625.P_COST%TYPE,
  V_P_GROUP PRODUCT_0625.P_GROUP%TYPE
)
IS
  CHK_P_CODE NUMBER;
  P_CODE_ERROR EXCEPTION;
BEGIN
  SELECT COUNT(P_CODE) INTO CHK_P_CODE
      FROM PRODUCT_0625
    WHERE P_CODE = V_P_CODE;
    
  IF CHK_P_CODE >= 1 THEN
    RAISE P_CODE_ERROR;
  ELSE
    INSERT INTO PRODUCT_0625
      VALUES (V_P_CODE, V_P_NAME, V_P_COST, V_P_GROUP, NULL);
      COMMIT;
    DBMS_OUTPUT.PUT_LINE('상품 추가가 완료되었다.');
  END IF;
  
  EXCEPTION
    WHEN P_CODE_ERROR THEN
      DBMS_OUTPUT.PUT_LINE('이미 있는 상품입니다.');
      
END ADDPRO01;
/

SET SERVEROUTPUT ON;

SELECT * FROM PRODUCT_0625;
-- 입력하려는 p_code가 있으면 1 이 반환됨
-- SELECT COUNT(P_CODE) FROM PRODUCT_0625 WHERE P_CODE = 104;

-- 실행
-- EXECUTE ADDPRO01('999', '상품추가테스트', 99900, '스피커');
-- DELETE FROM PRODUCT_0625 WHERE P_CODE = 999;
execute ADDPRO01('101', '7.1채널 스피커', 180000, '스피커');
  
  
-- 7.	product_0625_del테이블을 만들어라.
create table product_0625_del(
  u_id varchar2(10),
  wdate date,
  p_code number(6),
  p_name varchar2(30),
  p_cost number,
  p_group varchar2(30)
);
-- 8.	7번을 한 후,상품 삭제 시(PRODUCT_0625 테이블에서) product_0625_del 테이블에 삽입이 이루어지는 트리거를 작성해라.
-- p_code ,p_name , p_cost , p_group은 기존 PRODUCT_0625 테이블에 있는 값으로 삽입해라.
-- delete from PRODUCT_0625 where p_code=’201’;

-- 9.	Emp, dept, salgrade테이블로 작업해라.
--  (없으면 카페에 “부서, 사원, 급여 테이블” 복붙해서 생성하기)

-- 9-1. 부서번호를 입력하면 부서에 근무하는 모든 사원들의 사원번호,사원이름,사원직무가 화면에 출력되며,
-- 사원직무를 입력하면 사원번호,사원이름,부서이름이 화면에 출력되는 프로시저를 
-- 같은 이름으로 작성하여 한 패키지로 구성해라.
/*
  -예외 처리
    1. 입력된 부서번호가 테이블에 없을 경우 “부서번호가 잘못 입력되었다”
    2. 입력된 사원직무가 테이블에 없을경우“사원직무가 잘못 입력되었다”를 출력

    execute pack1_01.pro1_01(15);
    부서번호가 잘못 입력되었다
    
    execute pack1_01.pro1_01(10);
    7839 
    KING PRESIDENT
    7782
    CLARK MANAGER
    7934 
    MILLER CLERK
    
    execute pack1_01.pro1_01(‘DIRECTOR’);
    사원직무가 잘못 입력되었다
*/


