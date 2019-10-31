drop database if exists mydata;
create database mydata;
use mydata;
/**
	tao khoa chinh
**/
CREATE TABLE users(
	user_id INT AUTO_INCREMENT PRIMARY KEY,
    username varchar(20),
    password varchar(200),
    email varchar(255)
);
CREATE TABLE roles(
	role_id INT AUTO_INCREMENT,
    role_name varchar(20),
    PRIMARY KEY(role_id)
);
/**
	tao khoa chinh phuc hop
**/
CREATE TABLE userroles(
	user_id INT NOT NULL,
	role_id INT NOT NULL,
    PRIMARY KEY(user_id,role_id),
    FOREIGN KEY(user_id) REFERENCES users(user_id),
    FOREIGN KEY(role_id) REFERENCES roles(role_id)
);
CREATE TABLE customers(
	customer_id INT(10),
    customer_name varchar(20)
);
/**
	bo sung khoa chinh sau khi da tao bang
**/
ALTER TABLE customers ADD PRIMARY KEY(customer_id);







