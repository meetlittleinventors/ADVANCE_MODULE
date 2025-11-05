-- Step 1: Create the tables
CREATE TABLE authors (
  author_id INT PRIMARY KEY,
  author_name VARCHAR(100)
);

CREATE TABLE books (
  book_id INT PRIMARY KEY,
  title VARCHAR(100),
  author_id INT,
  price DECIMAL(10,2),
  FOREIGN KEY (author_id) REFERENCES authors(author_id)
);

-- Step 2: Insert data into authors
INSERT INTO authors (author_id, author_name) VALUES
(1, 'J.K. Rowling'),
(2, 'George R.R. Martin'),
(3, 'Agatha Christie');

-- Step 3: Insert data into books
INSERT INTO books (book_id, title, author_id, price) VALUES
(101, 'Harry Potter', 1, 499.00),
(102, 'A Game of Thrones', 2, 699.00),
(103, 'Murder on the Orient Express', 3, 399.00),
(104, 'Harry Potter and the Chamber of Secrets', 1, 550.00);

-- Step 4: Retrieve all books with their author names using JOIN
SELECT 
  books.book_id,
  books.title,
  authors.author_name,
  books.price
FROM books
INNER JOIN authors ON books.author_id = authors.author_id;

-- Step 5 (Optional): Retrieve books costing more than 500
SELECT 
  title, price
FROM books
WHERE price > 500;
