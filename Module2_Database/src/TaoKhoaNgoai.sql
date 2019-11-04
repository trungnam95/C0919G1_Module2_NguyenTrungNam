drop database if exists mydata;
create database mydata;
use mydata;
CREATE TABLE customers(
	id INT AUTO_INCREMENT PRIMARY KEY,
    customer_name varchar(20),
    customer_address varchar(100),
    customer_email varchar(100)
);
CREATE TABLE orders(
	order_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT,
    staff varchar(100),
    FOREIGN KEY(customer_id) REFERENCES customers(id)
);
/**
cach 2
**/
CREATE TABLE orders(
	order_id INT AUTO_INCREMENT PRIMARY KEY,
    staff varchar(100),
	customer_id INT REFERENCES customers(id)
);