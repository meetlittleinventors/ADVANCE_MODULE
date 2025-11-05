-- Step 1: Create the table
CREATE TABLE products (
  id INT PRIMARY KEY,
  name VARCHAR(50),
  price DECIMAL(10,2)
);

-- Step 2: Insert sample data
INSERT INTO products (id, name, price) VALUES
(1, 'Laptop', 55000.00),
(2, 'Smartphone', 25000.00),
(3, 'Headphones', 3000.00);

-- Step 3: Display all columns and data
SELECT * FROM products;

-- (Optional) Step 4: View column metadata (structure)
DESC products;        -- MySQL / Oracle
-- or
PRAGMA table_info(products);  -- SQLite
