--Exercise 1:Scenario 1

SET SERVEROUTPUT ON;

DECLARE
    v_age NUMBER;
BEGIN
    FOR rec IN (
        SELECT c.CustomerID, c.DOB, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
    ) LOOP
        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, rec.DOB) / 12);

        DBMS_OUTPUT.PUT_LINE('CustomerID: ' || rec.CustomerID || ' | Age: ' || v_age);

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;

            DBMS_OUTPUT.PUT_LINE('Discount applied to LoanID: ' || rec.LoanID);
        END IF;
    END LOOP;

    COMMIT;
END;
/

--Test
SELECT 
    c.CustomerID,
    c.Name,
    TRUNC(MONTHS_BETWEEN(SYSDATE, c.DOB)/12) AS Age,
    l.LoanID,
    l.InterestRate
FROM Customers c
JOIN Loans l ON c.CustomerID = l.CustomerID;