--Exercise 2: Scenario 3
CREATE OR REPLACE PROCEDURE AddNewCustomer (
    p_customer_id IN NUMBER,
    p_name IN VARCHAR2,
    p_dob IN DATE,
    p_balance IN NUMBER
)
IS
BEGIN
    INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified, IsVIP)
    VALUES (p_customer_id, p_name, p_dob, p_balance, SYSDATE, 'FALSE');

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Customer added: ' || p_name);

EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        DBMS_OUTPUT.PUT_LINE('Error: Customer with ID ' || p_customer_id || ' already exists.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Unexpected error: ' || SQLERRM);
        ROLLBACK;
END;
/


--Test
EXEC AddNewCustomer(4, 'Kavya R', TO_DATE('1995-09-12', 'YYYY-MM-DD'), 8000);
EXEC AddNewCustomer(1, 'Duplicate John', TO_DATE('1980-01-01', 'YYYY-MM-DD'), 5000);
SELECT CustomerID, Name, DOB, Balance FROM Customers;