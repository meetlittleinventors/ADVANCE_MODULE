-- Step 1: Create the table
CREATE TABLE students_performance (
  student_id INT PRIMARY KEY,
  student_name VARCHAR(50),
  subject VARCHAR(50),
  marks INT
);

-- Step 2: Insert sample data
INSERT INTO students_performance (student_id, student_name, subject, marks) VALUES
(1, 'Riya', 'Math', 85),
(2, 'Amit', 'Science', 78),
(3, 'Neha', 'English', 92),
(4, 'Ravi', 'Math', 68),
(5, 'Sonal', 'Science', 55);

-- Step 3: Update marks for a student
UPDATE students_performance
SET marks = 88
WHERE student_name = 'Amit';

-- Step 4: Delete records of students who scored below 60
DELETE FROM students_performance
WHERE marks < 60;

-- Step 5: Display all records after update and delete
SELECT * FROM students_performance;

-- Step 6: Calculate average, highest, and lowest marks
SELECT 
  AVG(marks) AS Average_Marks,
  MAX(marks) AS Highest_Marks,
  MIN(marks) AS Lowest_Marks
FROM students_performance;
