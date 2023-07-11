-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS hosteleria;
USE hosteleria;

-- Eliminar las tablas si existen
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS salesman;

-- Crear la tabla salesman
CREATE TABLE salesman (
  salesman_id INT PRIMARY KEY,
  name VARCHAR(30),
  city VARCHAR(15),
  commission DECIMAL(5, 2)
);

-- Crear la tabla customer
CREATE TABLE customer (
  customer_id INT PRIMARY KEY,
  cust_name VARCHAR(30),
  city VARCHAR(15),
  grade VARCHAR(3),
  salesman_id INT,
  orders_id INT
);

-- Crear la tabla orders
CREATE TABLE orders (
  orders_id INT PRIMARY KEY,
  purch_amt DECIMAL(10, 2),
  ord_date DATE,
  salesman_id INT,
  customer_id INT,
  CONSTRAINT fk_orders_salesman FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id),
  CONSTRAINT fk_orders_customer FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);
-- Inserciones en la tabla salesman
INSERT INTO salesman (salesman_id, name, city, commission) VALUES
  (1, 'Juan García', 'New York', 0.11),
  (2, 'María Rodríguez', 'London', 0.12),
  (3, 'David López', 'Tokyo', 0.13),
  (4, 'Ana Martínez', 'Sydney', 0.14),
  (5, 'Pedro González', 'Rome', 0.15),
  (6, 'Laura Sánchez', 'Dubai', 0.16),
  (7, 'Carlos Ramírez', 'Barcelona', 0.17),
  (8, 'Sandra Torres', 'Berlin', 0.18),
  (9, 'Luis Morales', 'Toronto', 0.19),
  (10, 'Isabel Flores', 'Paris', 0.1);

-- Inserciones en la tabla customer
INSERT INTO customer (customer_id, cust_name, city, grade, salesman_id, orders_id) VALUES
  (1, 'Acme Corporation', 'New York', 'A', 1, 1),
  (2, 'Global Industries', 'London', 'B', 2, 2),
  (3, 'Tech Solutions', 'Tokyo', 'A', 3, 3),
  (4, 'VentaMax Corporation', 'Sydney', 'C', 4, 4),
  (5, 'InnoviaTech Group', 'Rome', 'C', 5, 5),
  (6, 'VisionQuest Ventures', 'Dubai', 'A', 6, 6),
  (7, 'Stratix Systems', 'Barcelona', 'A', 7, 7),
  (8, 'QuantumWave Technologies', 'Berlin', 'B', 8, 8),
  (9, 'OptimaPro Solutions', 'Toronto', 'C', 9, 9),
  (10, 'Fashion Outlet', 'Paris', 'A', 10, 10);

-- Inserciones en la tabla orders
INSERT INTO orders (orders_id, purch_amt, ord_date, salesman_id, customer_id) VALUES
  (1, 1000.50, '2023-01-15', 1, 1),
  (2, 750.20, '2023-02-10', 2, 2),
  (3, 829.73, '2023-03-05', 3, 3),
  (4, 523.12, '2023-02-14', 4, 4),
  (5, 156.55, '2023-06-30', 5, 5),
  (6, 901.89, '2023-04-22', 6, 6),
  (7, 734.47, '2023-11-08', 7, 7),
  (8, 267.28, '2023-08-05', 8, 8),
  (9, 682.61, '2023-05-19', 9, 9),
  (10, 1200.75, '2023-04-20', 10, 10);

SELECT COUNT(*) AS total_registros FROM orders;

SELECT DISTINCT cust_name FROM customer;

SELECT * FROM salesman ORDER BY commission DESC;

SELECT * FROM customer ORDER BY customer_id LIMIT 5;

SELECT * FROM orders ORDER BY purch_amt LIMIT 1;

SELECT * FROM orders ORDER BY purch_amt DESC LIMIT 1;
