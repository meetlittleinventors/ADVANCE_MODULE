-- Step 1: Create the table
CREATE TABLE images (
  id INT PRIMARY KEY,
  photo BLOB
);

-- Step 2: Insert image data (simulation example)
-- In practice, you'd use a database tool or function to load a real image.
-- For demo purposes, we can store sample binary or placeholder text.

INSERT INTO images (id, photo)
VALUES (1, LOAD_FILE('C:/images/sample_photo.jpg'));
-- (For systems without file access, use NULL or 'Simulated image data')

-- Step 3: Retrieve the data
SELECT id, LENGTH(photo) AS ImageSize
FROM images;
