-- Step 1: Create the table
CREATE TABLE students (
  id INT PRIMARY KEY,
  name VARCHAR(50)
);

-- Step 2: Insert a new student record
INSERT INTO students (id, name)
VALUES (101, 'Bob Smith');

-- Step 3: Retrieve all data from the table
SELECT * FROM students;
