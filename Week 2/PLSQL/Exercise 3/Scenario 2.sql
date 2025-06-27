--Exercise 3: Scenario 2
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,
    p_bonus_pct IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_pct / 100)
    WHERE Department = p_department;

    COMMIT;
END;
/

--Test
BEGIN
    UpdateEmployeeBonus('IT', 10);
END;
/
SELECT EmployeeID, Name, Department, Salary FROM Employees;