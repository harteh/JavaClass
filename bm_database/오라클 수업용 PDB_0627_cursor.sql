-- p.466 파라미터를 사용하는 커서
SET SERVEROUTPUT ON;
select * from dept1;
declare
  v_dept_row dept1%rowtype;
  
  CURSOR c1 (p_deptno DEPT1.DEPTNO%TYPE) is
    select deptno, dname, loc
      from dept1
    where deptno = p_deptno;
begin
  open c1 (10);
    loop
      fetch c1 into v_dept_row;
      exit when c1%notfound;
      dbms_output.put_line('10번 부서 - deptno : '|| v_dept_row.deptno
                                  || ', dname : ' || v_dept_row.dname
                                  || ', loc : ' || v_dept_row.loc);
    end loop;
  close c1;
end;
/

-- p.468 커서에 사용할 파라미터 입력받기
declare
  v_deptno dept1.deptno%type;
  
  cursor c2 (p_deptno dept1.deptno%type) is
    select deptno, dname, loc
      from dept1
    where deptno = p_deptno;
  
  begin
    v_deptno := &input_deptno;
    for c2_rec in c2(v_deptno) loop
      dbms_output.put_line('deptno : '|| c2_rec.deptno
                      || ', dname : ' || c2_rec.dname
                      || ', loc : ' || c2_rec.loc);
    end loop;
  end;
/


-- p.500 패키지
-- 패키지 생성
CREATE OR REPLACE PACKAGE pkg_example
IS
  spec_no NUMBER := 10;
  FUNCTION func_aftertax(sal NUMBER) RETURN NUMBER;
  PROCEDURE pro_emp(in_empno IN EMP1.EMPNO%TYPE);
  PROCEDURE pro_dept(in_deptno IN DEPT1.DEPTNO%TYPE);
END;
/

-- 패키지 명세 확인
desc pkg_example;

-- 패키지 본문 생성
CREATE OR REPLACE PACKAGE BODY pkg_example
IS
  body_no NUMBER :=10;
  
  FUNCTION func_aftertax(sal NUMBER) RETURN NUMBER
    IS
      tax NUMBER := 0.05;
    BEGIN
      RETURN (ROUND(sal - (sal*tax)));
    END func_aftertax;
    
  PROCEDURE pro_emp(in_empno IN EMP1.EMPNO%TYPE)
    IS
      out_ename EMP1.ENAME%TYPE;
      out_sal EMP1.SAL%TYPE;
    BEGIN
      SELECT ENAME, SAL INTO out_ename, out_sal
        FROM EMP1
      WHERE EMPNO = in_empno;
    
      DBMS_OUTPUT.PUT_LINE('ENAME : ' || out_ename);
