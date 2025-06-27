--Exercise 3:Scenario 1

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    FOR rec IN (
        SELECT AccountID, Balance
        FROM Accounts
        WHERE AccountType = 'Savings'
    ) LOOP
        UPDATE Accounts
        SET Balance = Balance + (Balance * 0.01),
            LastModified = SYSDATE
        WHERE AccountID = rec.AccountID;
    END LOOP;

    COMMIT;
END;
/
--Test
BEGIN
    ProcessMonthlyInterest;
END;
/
SELECT AccountID, AccountType, Balance FROM Accounts WHERE AccountType = 'Savings';