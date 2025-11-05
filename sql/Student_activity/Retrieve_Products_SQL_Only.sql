-- Step 1: Create the table
CREATE TABLE products (
  id INT PRIMARY KEY,
  name VARCHAR(50),
  price DECIMAL(10,2)
);

-- Step 2: Insert sample records
INSERT INTO products (id, name, price) VALUES
(1, 'Laptop', 55000.00),
(2, 'Smartphone', 25000.00),
(3, 'Headphones', 3000.00);

-- Step 3: Retrieve all records
SELECT * FROM products;

-- Step 4 (Optional): View table column information (metadata)
DESC products;
