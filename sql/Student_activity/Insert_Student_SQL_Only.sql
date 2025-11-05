-- Step 1: Create the table
CREATE TABLE students (
  id INT PRIMARY KEY,
  name VARCHAR(50)
);

-- Step 2: Insert one student record
INSERT INTO students (id, name)
VALUES (101, 'Bob Smith');

-- Step 3: Retrieve all records
SELECT * FROM students;
