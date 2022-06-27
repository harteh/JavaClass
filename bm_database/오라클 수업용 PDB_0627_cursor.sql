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

