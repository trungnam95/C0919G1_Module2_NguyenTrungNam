/**
 Hiển thị một số trường dữ liệu trong bảng customers như mã khách hàng (customernumber),
 họ (contactlastname), tên (contactfirstname), số điện thoại (phone), thành phố (city):
**/
select customerNumber,contactLastName,contactFirstName,phone,city from customers;
/**
 Hiển thị mã khách hàng, tên, họ, số điện thoại của tất cả khách hàng có tên là Peter
 và sống ở thành phố Melbourne:
**/
select customerNumber,contactLastName,contactFirstName,phone,city from customers
where contactFirstName='Peter' and city='Melbourne';
/**
 Hiển thị thông tin khách hàng có tên chứa ký tự a/A:
**/
select customerNumber,contactLastName,contactFirstName,phone,city from customers
where contactFirstName like '%A%';
/**
 Hiển thị thông tin các khách hàng có mã trong khoảng từ 103 đến 125:
**/
select customerNumber,contactLastName,contactFirstName,phone,city
from customers where customerNumber between 103 and 125;
/**
 Hiển thị thông tin các khách hàng sống ở USA, France, Spain:
**/
select customerNumber,contactLastName,contactFirstName,phone,city,country
from customers where country in ('USA','France','Spain');
/**
Hiển thị mã khách hàng, tên, họ, số điện thoại, quốc gia của các
khách hàng sống tại quốc gia USA hoặc France:
**/
select customerNumber,contactLastName,contactFirstName,phone,city,country
from customers where country='USA' or country='France';
/**
Hiển thị tất cả các khách hàng theo thứ tự từ a – z của tên:
**/
select customerNumber,contactLastName,contactFirstName,phone,city,country
from customers order by contactLastName asc;
/**
Hiển thị 10 khách hàng đầu tiên theo thứ tự từ z – a của tên:
**/
select customernumber, contactlastname, contactfirstname, phone, city
from customers  order by contactLastName desc;
/**
Đếm xem có bao nhiêu khách hàng sống ở France:
**/
select count(country) as 'so khach hang song o france la' from customers
where country='France';
/**
Cập nhập lại trường customername thành Baane Mini Imports cho  khách hàng có mã là 103:
**/
update customers set customername='Baane Mini Imports'where customernumber =103;
select*from customers where customerNumber=103;
/**
Xóa các khách hàng sống ở thành phố Nantes:
**/
select*from customers where city='Nantes';
delete from customers where city = 'Nantes' ;






