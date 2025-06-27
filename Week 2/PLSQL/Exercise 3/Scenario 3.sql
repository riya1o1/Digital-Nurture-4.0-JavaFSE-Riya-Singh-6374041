--Exercise 3: Scenario 3
CREATE OR REPLACE PROCEDURE TransferFunds (
    p_source_account_id IN NUMBER,
    p_target_account_id IN NUMBER,
    p_amount IN NUMBER
) AS
    v_source_balance NUMBER;
BEGIN
    SELECT Balance INTO v_source_balance
    FROM Accounts
    WHERE AccountID = p_source_account_id;

    IF v_source_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account');
    END IF;

    UPDATE Accounts
    SET Balance = Balance - p_amount,
        LastModified = SYSDATE
    WHERE AccountID = p_source_account_id;

    UPDATE Accounts
    SET Balance = Balance + p_amount,
        LastModified = SYSDATE
    WHERE AccountID = p_target_account_id;

    COMMIT;
END;
/

--Test
BEGIN
    TransferFunds(1, 2, 500);
END;
/
SELECT AccountID, Balance FROM Accounts;