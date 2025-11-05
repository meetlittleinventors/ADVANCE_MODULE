-- Step 1: Create the table
CREATE TABLE sales (
  sale_id INT PRIMARY KEY,
  salesperson VARCHAR(50),
  region VARCHAR(50),
  amount DECIMAL(10,2)
);

-- Step 2: Insert sample sales data
INSERT INTO sales (sale_id, salesperson, region, amount) VALUES
(1, 'Amit', 'North', 15000.00),
(2, 'Neha', 'South', 18000.00),
(3, 'Amit', 'North', 12000.00),
(4, 'Ravi', 'East', 22000.00),
(5, 'Neha', 'South', 17000.00),
(6, 'Sonal', 'West', 9000.00),
(7, 'Ravi', 'East', 25000.00),
(8, 'Amit', 'North', 8000.00);

-- Step 3: Calculate total sales by each salesperson
SELECT 
  salesperson,
  SUM(amount) AS total_sales
FROM sales
GROUP BY salesperson;

-- Step 4: Show only those salespeople whose total sales are greater than 20000
SELECT 
  salesperson,
  SUM(amount) AS total_sales
FROM sales
GROUP BY salesperson
HAVING SUM(amount) > 20000;

-- Step 5: Order the results by total sales (descending)
SELECT 
  salesperson,
  SUM(amount) AS total_sales
FROM sales
GROUP BY salesperson
HAVING SUM(amount) > 20000
ORDER BY total_sales DESC;
