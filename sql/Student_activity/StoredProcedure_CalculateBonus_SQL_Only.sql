-- Step 1: Change the delimiter (so MySQL can understand the procedure block)
DELIMITER $$

-- Step 2: Create the stored procedure
CREATE PROCEDURE calculatesalarybonus (
    IN salary DECIMAL(10,2),
    OUT bonus DECIMAL(10,2)
)
BEGIN
    SET bonus = salary * 0.10;  -- Calculate 10% bonus
END$$

DELIMITER ;

-- Step 3: Declare a variable to store the output value
SET @bonus_value = 0;

-- Step 4: Call the procedure with a sample salary input
CALL calculatesalarybonus(60000, @bonus_value);

-- Step 5: Display the bonus result
SELECT @bonus_value AS 'Calculated Bonus';
