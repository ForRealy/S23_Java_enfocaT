-- Create a table
CREATE TABLE products (
  product_id INT NOT NULL AUTO_INCREMENT,
  product_name VARCHAR(255) NOT NULL,
  product_price DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (product_id)
);

-- Insert some data into the table
INSERT INTO products (product_name, product_price) VALUES
('Product 1', 10.00),
('Product 2', 20.00),
('Product 3', 30.00);

-- Start a transaction
START TRANSACTION;

-- Update the price of Product 1
UPDATE products SET product_price = 15.00 WHERE product_name = 'Product 1';

-- Check the updated data
SELECT * FROM products;

-- Rollback the transaction
ROLLBACK;

-- Check the data after the rollback
SELECT * FROM products;

-- Start a new transaction
START TRANSACTION;

-- Update the price of Product 2
UPDATE products SET product_price = 25.00 WHERE product_name = 'Product 2';

-- Check the updated data
SELECT * FROM products;

-- Commit the transaction
COMMIT;

-- Check the data after the commit
SELECT * FROM products;
