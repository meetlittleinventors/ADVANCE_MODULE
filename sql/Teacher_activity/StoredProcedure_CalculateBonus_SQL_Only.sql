-- Step 1: Change the delimiter (needed for procedure creation)
DELIMITER $$

-- Step 2: Create the stored procedure
CREATE PROCEDURE calculatesalarybonus (
    IN salary DECIMAL(10,2),
    OUT bonus DECIMAL(10,2)
)
BEGIN
    SET bonus = salary * 0.10; -- Bonus = 10% of salary
END$$

DELIMITER ;

-- Step 3: Declare a variable to hold the output
SET @bonus_value = 0;

-- Step 4: Call the stored procedure
CALL calculatesalarybonus(50000, @bonus_value);

-- Step 5: Display the output
SELECT @bonus_value AS 'Calculated Bonus';
