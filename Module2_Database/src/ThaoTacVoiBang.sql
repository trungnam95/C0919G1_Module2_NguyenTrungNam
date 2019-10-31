drop database if exists mydata;
create database mydata;
use mydata;
SELECT * FROM contacts;
/**
tao bang contacts
**/
CREATE TABLE contacts(
	contact_id INT(10) NOT NULL AUTO_INCREMENT,
	last_name VARCHAR(30) NOT NULL,
    first_name VARCHAR(20) NOT NULL,
	birthday DATE,
    CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);
INSERT INTO contacts(last_name) VALUES ('asdasd');
/**
tao bang suppliers
**/
CREATE TABLE suppliers(
	supplier_id INT(10) NOT NULL AUTO_INCREMENT,
    supplier_name VARCHAR(50) NOT NULL,
    account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
    CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);
SELECT * FROM suppliers;
/**
xoa bang suppliers,contacts
**/
DROP TABLE contacts;
DROP TABLE contacts,suppliers;
/**
them cot gender va address vao bang contacts sau cot birthday
**/
ALTER TABLE contacts ADD gender varchar(4) NOT NULL AFTER birthday ,ADD address varchar(20) NOT NULL AFTER gender;
/**
chinh sua mo ta cua 1 cot
**/
ALTER TABLE contacts MODIFY address varchar(10) NULL,MODIFY gender char(5);
/**
xoa 1 cot trong bang
**/
ALTER TABLE contacts DROP COLUMN last_name;
 /**
thay doi ten 1 cot
**/
ALTER TABLE contacts CHANGE COLUMN contact_id ok INT(10) NOT NULL;
 /**
doi ten bang
**/
ALTER TABLE suppliers RENAME TO NAM;



