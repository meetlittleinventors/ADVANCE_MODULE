-- Step 1: Create the table
CREATE TABLE images (
  id INT PRIMARY KEY,
  photo BLOB
);

-- Step 2: Insert image data
-- (LOAD_FILE() is used to read an image from your system)
INSERT INTO images (id, photo)
VALUES (1, LOAD_FILE('C:/images/sample_photo.jpg'));

-- Step 3: Verify insertion by checking file size (length of BLOB)
SELECT id, LENGTH(photo) AS ImageSize
FROM images;
