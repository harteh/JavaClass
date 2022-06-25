CREATE TABLE BOOK(
  BOOKID CHAR(4) PRIMARY KEY,
  BOOKNAME VARCHAR2(100),
  PUBLISHER VARCHAR2(30),
  PRICE NUMBER
);
--DROP TABLE BOOK;
select * from BOOK;
INSERT INTO BOOK VALUES (1, '컴퓨터의 역사', '아이티', 7000);
INSERT INTO BOOK VALUES (2, '컴퓨터는 무엇일까', '굿북', 13000);
INSERT INTO BOOK VALUES (3, '컴퓨터의 이해', '솔데스크', 22000);
INSERT INTO BOOK VALUES (4, '자바 이론', '솔데스크', 35000);
INSERT INTO BOOK VALUES (5, '데이터베이스 교본', '아이티', 8000);
INSERT INTO BOOK VALUES (6, 'HTML 기술', '아이티', 6000);
INSERT INTO BOOK VALUES (7, '스프링의 개념', '에비씨미디어', 20000);
INSERT INTO BOOK VALUES (8, '스프링을 부탁해', '에비씨빛미디어', 13000);
INSERT INTO BOOK VALUES (9, '파이썬 이야기', '코딩빔', 7500);
INSERT INTO BOOK VALUES (10, 'python story', 'Pearson', 13000);

CREATE TABLE CUSTOMER(
  CUSTID CHAR(4) PRIMARY KEY,
  CUSTNAME VARCHAR2(12),
  ADDRESS VARCHAR2(100),
  PHONE VARCHAR2(15)
);

INSERT INTO CUSTOMER VALUES (1, '박건우', '인천시 송도', '010-1111-2222');
INSERT INTO CUSTOMER VALUES (2, '김선해', '서울시 종로구', '010-2111-2222');
INSERT INTO CUSTOMER VALUES (3, '장지혜', '서울시 용산구', '010-3111-2222');
INSERT INTO CUSTOMER VALUES (4, '추오섭', '경기도 의정부', '010-4111-2222');
INSERT INTO CUSTOMER VALUES (5, '박승철', '서울시 마포구', NULL);
--DROP TABLE CUSTOMER;
select * from CUSTOMER;

CREATE TABLE ORDERS(
  ORDERID CHAR(4) PRIMARY KEY,
  CUSTID CHAR(4) CONSTRAINT ORDERS_CUSTID_FK REFERENCES CUSTOMER (CUSTID),
  BOOKID CHAR(4) CONSTRAINT ORDERS_BOOKID_FK REFERENCES BOOK (BOOKID),
  SALEPRICE NUMBER,
  ORDERDATE DATE
);

INSERT INTO ORDERS VALUES (1, 1, 1, 7000, to_date('01-05-2022','dd-mm-yyyy'));
INSERT INTO ORDERS VALUES (2, 1, 3, 22000, to_date('03-05-2022','dd-mm-yyyy'));
INSERT INTO ORDERS VALUES (3, 2, 5, 8000, to_date('03-05-2022','dd-mm-yyyy'));
INSERT INTO ORDERS VALUES (4, 3, 6, 6000, to_date('04-05-2022','dd-mm-yyyy'));
INSERT INTO ORDERS VALUES (5, 4, 7, 20000, to_date('05-05-2022','dd-mm-yyyy'));
INSERT INTO ORDERS VALUES (6, 1, 2, 13000, to_date('07-05-2022','dd-mm-yyyy'));
INSERT INTO ORDERS VALUES (7, 4, 8, 13000, to_date('07-05-2022','dd-mm-yyyy'));
INSERT INTO ORDERS VALUES (8, 3, 10, 13000, to_date('08-05-2022','dd-mm-yyyy'));
INSERT INTO ORDERS VALUES (9, 2, 10, 13000, to_date('09-05-2022','dd-mm-yyyy'));
INSERT INTO ORDERS VALUES (10, 3, 8, 13000, to_date('10-05-2022','dd-mm-yyyy'));
--DROP TABLE ORDERS;
select * from ORDERS;


-- 1.	김선해 고객의 전화번호를 찾아라.
SELECT PHONE FROM CUSTOMER WHERE CUSTNAME = '김선해';

-- 2.	모든 도서의 이름과 가격을 검색해라.
SELECT BOOKNAME, PRICE FROM BOOK;

-- 3.	모든 도서의 도서번호,도서이름,출판사,가격을 검색해라.
SELECT BOOKID AS 도서번호, BOOKNAME AS 도서명, PUBLISHER AS 출판사, PRICE AS 가격 FROM BOOK;

-- 4.	도서 테이블에 있는 모든 출판사를 검색해라. (중복제거해서)
SELECT DISTINCT(PUBLISHER) FROM BOOK;

-- 5.	가격이 20000원 미만인 도서를 검색해라.
SELECT * FROM BOOK WHERE PRICE < 20000;

-- 6.	가격이 10000원 이상 20000 이하인 도서를 검색해라.
SELECT * FROM BOOK WHERE PRICE BETWEEN 10000 AND 20000;

-- 7.	출판사가 ‘아이티’ 혹은 ‘솔데스크’ 인 도서를 검색해라.
SELECT * FROM BOOK WHERE PUBLISHER IN ('아이티','솔데스크');

-- 8.	출판사가 ‘아이티’ 혹은 ‘솔데스크’ 아닌 도서를 검색해라.
SELECT * FROM BOOK WHERE PUBLISHER NOT IN ('아이티','솔데스크');

-- 9.	‘컴퓨터의 역사’를 출간한 출판사를 검색해라.
SELECT PUBLISHER FROM BOOK WHERE BOOKNAME = '컴퓨터의 역사';

-- 10.	도서이름에 ‘컴퓨터’가 포함된 출판사를 검색해라.
SELECT PUBLISHER FROM BOOK WHERE BOOKNAME LIKE '%컴퓨터%';

-- 11.	도서이름의 왼쪽 두번 째에 ‘퓨’라는 문자열을 갖는 도서를 검색해라.
SELECT * FROM BOOK WHERE BOOKNAME LIKE '_퓨%';

-- 12.	컴퓨터에 관한 도서 중 가격이 20000원 이상인 도서를 검색해라.
SELECT * FROM BOOK WHERE BOOKNAME LIKE '%컴퓨터%' AND PRICE >= 20000;

-- 13.	도서를 이름순으로 검색해라.
SELECT * FROM BOOK ORDER BY BOOKNAME;

-- 14.	도서를 가격순으로 검색하고,가격이 같으면 이름순으로 검색해라.
SELECT * FROM BOOK ORDER BY PRICE, BOOKNAME;

-- 15.	도서를 가격의 내림차순으로 검색해라.가격이 같다면 출판사의 오름차순으로 검색해라.
SELECT * FROM BOOK ORDER BY PRICE DESC, PUBLISHER;

-- 16.	고객이 주문한 도서의 총 판매액을 구해라.
SELECT SUM(SALEPRICE) FROM ORDERS;

-- 17.	2번 김선해 고객이 주문한 도서의 총 판매액을 구해라.
SELECT SUM(SALEPRICE) FROM ORDERS  WHERE CUSTID = 2;
SELECT SUM(O.SALEPRICE)
    FROM ORDERS O, CUSTOMER C
  WHERE O.CUSTID = C.CUSTID
    AND C.CUSTNAME = '김선해';

-- 18.	고객이 주문한 도서의 총 판매액,평균값,최저가,최고가를 구해라.
SELECT SUM(SALEPRICE), AVG(SALEPRICE), MIN(SALEPRICE), MAX(SALEPRICE) FROM ORDERS;

-- 19.	503서점의 도서 판매 건수를 구해라.
SELECT COUNT(*) FROM ORDERS;

-- 20.	고객별로 주문한 도서의 총 수량과 총 판매액을 구해라.
SELECT CUSTID, COUNT(*) AS 총주문수량, SUM(SALEPRICE) AS 총주문금액
    FROM ORDERS
  GROUP BY CUSTID
  ORDER BY CUSTID;

-- 21.	가격이 8000원 이상인 도서를 구매한 고객에 대하여 고객별 주문 도서의 총 수량을 구해라.
-- 단,두 권 이상 구매한 고객만 구해라.
SELECT CUSTID AS 회원ID, COUNT(*) AS 주문수량
    FROM ORDERS
  WHERE SALEPRICE >= 8000
GROUP BY CUSTID
  HAVING COUNT (*) > 2;

-- 22.	고객과 고객의 주문에 관한 데이터를 모두 보여라.
SELECT  C.CUSTNAME AS 고객이름,
        B.BOOKID AS 도서번호, B.BOOKNAME AS 도서이름,
        O.ORDERID AS 주문번호, O.SALEPRICE AS 주문액, O.ORDERDATE AS 주문일
    FROM BOOK B, CUSTOMER C, ORDERS O
  WHERE B.BOOKID = O.BOOKID AND C.CUSTID = O.CUSTID;

-- 23.	고객과 고객의 주문에 관한 데이터를 고객번호 순으로 정렬하여 보여라.
SELECT  C.CUSTID, C.CUSTNAME AS 고객이름, O.ORDERID AS 주문번호, 
        B.BOOKID AS 도서번호, B.BOOKNAME AS 도서이름,
        O.SALEPRICE AS 주문액, O.ORDERDATE AS 주문일
    FROM BOOK B, CUSTOMER C, ORDERS O
  WHERE B.BOOKID = O.BOOKID AND C.CUSTID = O.CUSTID
ORDER BY C.CUSTID;

-- 24.	고객의 이름과 고객이 주문한 도서의 판매가격을 검색해라.
SELECT C.CUSTNAME, B.PRICE
    FROM BOOK B, CUSTOMER C, ORDERS O
  WHERE B.BOOKID = O.BOOKID AND C.CUSTID = O.CUSTID;
  
-- 25.	고객별로 주문한 모든 도서의 총 판매액을 구하고,고객별로 정렬해라.
SELECT O.CUSTID, SUM(O.SALEPRICE)
    FROM BOOK B, CUSTOMER C, ORDERS O
  WHERE B.BOOKID = O.BOOKID AND C.CUSTID = O.CUSTID
GROUP BY O.CUSTID;
  
-- 26.	고객의 이름과 고객이 주문한 도서의 이름을 구해라.
SELECT  C.CUSTNAME AS 고객이름, B.BOOKNAME AS 도서이름
    FROM BOOK B, CUSTOMER C, ORDERS O
  WHERE B.BOOKID = O.BOOKID AND C.CUSTID = O.CUSTID;

-- 27.	가격이 20000원인 도서를 주문한 고객의 이름과 도서의 이름을 구해라.
SELECT  C.CUSTNAME AS 고객이름, B.BOOKNAME AS 도서이름
    FROM BOOK B, CUSTOMER C, ORDERS O
  WHERE B.BOOKID = O.BOOKID AND C.CUSTID = O.CUSTID
    AND B.PRICE = 20000;
    
-- 28.	도서를 구매하지 않은 고객을 포함하여 고객의 이름과 고객이 주문한 도서의 판매가격을 구해라.
SELECT C.CUSTNAME, O.SALEPRICE
    FROM CUSTOMER C LEFT OUTER JOIN ORDERS O ON (C.CUSTID = O.CUSTID)
  ORDER BY C.CUSTNAME;

-- 29.	가장 비싼 도서의 이름을 구해라.
SELECT BOOKNAME FROM BOOK 
  WHERE PRICE = (SELECT MAX(PRICE) FROM BOOK);

-- 30.	도서를 구매한 적이 있는 고객의 이름을 검색해라.
SELECT CUSTNAME FROM CUSTOMER
  WHERE CUSTID IN (SELECT CUSTID FROM ORDERS);

-- 31.	솔데스크에서 출판한 도서를 구매한 고객의 이름을 보여라.
SELECT CUSTNAME 
    FROM BOOK B, CUSTOMER C, ORDERS O
  WHERE B.BOOKID = O.BOOKID AND C.CUSTID = O.CUSTID
    AND B.PUBLISHER = '솔데스크';

-- 32.	출판사별로 출판사의 평균 도서 가격보다 비싼 도서를 구해라.
SELECT B1.BOOKNAME FROM BOOK B1
  WHERE B1.PRICE > (SELECT AVG(B2.PRICE) FROM BOOK B2 WHERE B2.PUBLISHER=B1.PUBLISHER);

-- 33.	Book테이블에 새로운 도서 ‘공학 도서’를 삽입해라.공학 도서는 더샘에서 출간했으며 가격을 40000원이다.
INSERT INTO BOOK VALUES (11, '공학 도서', '더샘', 40000);

-- 34.	Book테이블에 새로운 도서 ‘공학 도서’를 삽입해라.공학 도서는 더샘에서 출간했으며 가격은 미정이다.
INSERT INTO BOOK VALUES (12, '공학 도서', '더샘', NULL);

-- 35.	Customer테이블에서 고객번호가 5인 고객의 주소를 ‘서울시 서초구’로 변경해라.
UPDATE CUSTOMER
  SET ADDRESS = '서울시 서초구'
  WHERE CUSTID = 5;

-- 36.	Customer테이블에서 박승철 고객의 주소를 김선해 고객의 주소로 변경해라.
UPDATE CUSTOMER
  SET ADDRESS = (SELECT ADDRESS FROM CUSTOMER WHERE CUSTNAME = '김선해')
  WHERE CUSTNAME = '박승철';

-- 37.	아이티에서 출판한 도서의 제목과 제목의 글자수를 확인해라.
SELECT BOOKNAME, LENGTH(BOOKNAME)
  FROM BOOK WHERE PUBLISHER = '아이티';

-- 38.	503서점의 고객 중에서 같은 성(이름성)을 가진 사람이 몇 명이나 되는지 성별 인원수를 구해라.
SELECT SUBSTR(CUSTNAME, 1,1) AS 성, COUNT(*) AS 인원수
  FROM CUSTOMER
GROUP BY SUBSTR(CUSTNAME, 1,1);

SELECT fname, COUNT(*) AS 인원수
  FROM (select substr(custname,1,1) as fname from CUSTOMER ) group by fname;
  

  
-- 39.	503서점은 주문일로부터 10일 후 매출을 확정한다.각 주문의 확정일자를 구해라.
SELECT ORDERDATE+10 AS 주문확정일자 FROM ORDERS;

-- 40.	503서점이 2022년 5월 7일에 주문받은 도서의 주문번호,주문일,고객번호,도서번호를 모두 보여라.
-- 주문일은 ‘yyyy-mm-dd요일’형태로 표시한다.
SELECT ORDERID, TO_CHAR(ORDERDATE, 'YYYY-MM-DD') AS 주문일, CUSTID, BOOKID
  FROM ORDERS WHERE ORDERDATE = '2022-05-07';

-- 41.	이름,전화번호가 포함된 고객목록을 보여라.단,전화번호가 없는 고객은 ‘연락처없음’으로 표시해라.
SELECT CUSTNAME, NVL(PHONE, '연락처없음') AS PHONE FROM CUSTOMER ;

-- 42.	평균 주문금액 이하의 주문에 대해 주문번호와 금액을 보여라.
SELECT ORDERID, SALEPRICE
  FROM ORDERS WHERE SALEPRICE <= (SELECT AVG(SALEPRICE) FROM ORDERS);

-- 43.	각 고객의 평균 주문금액보다 큰 금액의 주문 내역에 대해 주문번호,고객번호,금액을 보여라.
SELECT O1.ORDERID, O1.CUSTID, O1.SALEPRICE 
  FROM ORDERS O1 WHERE O1.SALEPRICE > (SELECT AVG(O2.SALEPRICE) 
                                          FROM ORDERS O2 WHERE O1.CUSTID = O2.CUSTID);
                                          
SELECT ORDERID, CUSTID, SALEPRICE 
  FROM ORDERS WHERE SALEPRICE > all (SELECT AVG(SALEPRICE) FROM ORDERS group by CUSTID);

-- 44.	서울시에 거주하는 고객에게 판매한 도서의 총판매액을 구해라.
SELECT SUM(SALEPRICE) 
    FROM ORDERS NATURAL JOIN CUSTOMER
  WHERE ADDRESS LIKE '서울%';
  
-- 45.	Customer테이블에서 고객번호가 5인 고객을 삭제해라.
SELECT * FROM CUSTOMER;
DELETE FROM CUSTOMER WHERE CUSTID = 5;