--Exercise 1: Scenario 2
ALTER TABLE Customers ADD IsVIP VARCHAR2(5);
BEGIN
    FOR rec IN (
        SELECT CustomerID, Balance
        FROM Customers
    ) LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;
        ELSE
            UPDATE Customers
            SET IsVIP = 'FALSE'
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/

--Test
SELECT 
    CustomerID, 
    Name, 
    Balance, 
    IsVIP 
FROM Customers;