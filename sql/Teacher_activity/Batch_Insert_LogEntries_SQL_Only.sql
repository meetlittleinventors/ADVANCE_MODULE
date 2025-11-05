-- Step 1: Create the table
CREATE TABLE logentries (
  id INT PRIMARY KEY,
  message VARCHAR(100)
);

-- Step 2: Insert multiple records together
INSERT INTO logentries (id, message) VALUES
(1, 'User login successful'),
(2, 'Data updated successfully'),
(3, 'User logged out');

-- Step 3: Retrieve all records
SELECT * FROM logentries;
