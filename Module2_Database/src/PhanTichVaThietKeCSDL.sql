drop database if exists QLBanHang;
create database QLBanHang;
use QLBanHang;
create table productlines(
	productLine varchar(50) primary key not null,
    textDescription text,
    image text
);
create table offices(
	officeCode varchar(10) primary key not null,
    city varchar(50) not null,
    phone varchar(50) not null,
    addressLine1 varchar(50) not null,
    addressLine2 varchar(50),
    state varchar(50),
    country varchar(50) not null,
    postalCode varchar(15) not null
);
create table employees(
	employeeNumber int auto_increment primary key not null,
    lastName varchar(50) not null,
    firstName varchar(50) not null,
    email varchar(100) not null,
    jobTitle varchar(100) not null,
    officeCode varchar(10),
    reportsTo int,
    foreign key (officeCode) references offices(officeCode),
    foreign key (reportsTo) references employees(employeeNumber)
);
create table customers(
	customer_Number int auto_increment primary key not null,
    customer_Name varchar(50) not null,
    contact_LastName varchar(50) not null,
    contact_FirstName varchar(50) not null,
    phone varchar(50) not null,
    addressLine1 varchar(50) not null,
    addressLine2 varchar(50),
    city varchar(50) not null,
    state varchar(50) not null,
    postalCode varchar(15) not null,
    contry varchar(50) not null,
    creditLimit int,
    employeeNumber int,
    foreign key (employeeNumber) references employees(employeeNumber)
);
create table orders(
	orderNumber int auto_increment primary key not null,
    orderDate date not null,
    requiredDate date not null,
    shippedDate date,
    `status` varchar(15) not null,
    comments text,
    quantityOrdered int not null,
    priceEach float not null,
	customer_Number int,
	foreign key (customer_Number) references customers(customer_Number)
);
create table payments(
	customerNumber int auto_increment primary key not null,
    checkNumber varchar(50) not null,
    paymentDate date not null,
    amount float not null,
    customer_Number int,
	foreign key (customer_Number) references customers(customer_Number)
);
create table products(
	productCode varchar(15) primary key not null,
    productName varchar(70) not null,
    productScale varchar(10) not null,
    productVendor varchar(50) not null,
    productDescription text not null,
    quantityInStock int not null,
    buyPrice float not null,
    MSRP float not null,
    productLine varchar(50),
    foreign key (productLine) references productLines(productLine)
);
create table OrderDetails(
	orderNumber int,
    productCode varchar(15),
    primary key(orderNumber,productCode),
    foreign key (orderNumber) references orders(orderNumber),
	foreign key (productCode) references products(productCode)
);














