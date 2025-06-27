--Exercise 2: Scenario 2
CREATE OR REPLACE PROCEDURE UpdateSalary (
    p_employee_id IN NUMBER,
    p_percentage IN NUMBER
)
IS
    v_salary NUMBER;
BEGIN
    SELECT Salary INTO v_salary
    FROM Employees
    WHERE EmployeeID = p_employee_id;

    UPDATE Employees
    SET Salary = Salary + (Salary * p_percentage / 100),
        HireDate = HireDate  -- Dummy change to trigger update
    WHERE EmployeeID = p_employee_id;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Salary updated for Employee ID ' || p_employee_id);

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Error: Employee ID ' || p_employee_id || ' not found.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Unexpected error: ' || SQLERRM);
        ROLLBACK;
END;
/


--Test
EXEC UpdateSalary(1, 10);  
EXEC UpdateSalary(999, 10);  
SELECT EmployeeID, Name, Salary FROM Employees;