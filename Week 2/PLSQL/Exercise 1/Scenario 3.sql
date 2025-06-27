--Exercise 1: Scenario 3
SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (
        SELECT l.LoanID, l.CustomerID, c.Name, l.EndDate
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ID ' || rec.LoanID || 
            ' for customer ' || rec.Name || 
            ' is due on ' || TO_CHAR(rec.EndDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/

--Test
SELECT 
    l.LoanID, 
    l.CustomerID, 
    c.Name, 
    l.EndDate
FROM Loans l
JOIN Customers c ON c.CustomerID = l.CustomerID
WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;