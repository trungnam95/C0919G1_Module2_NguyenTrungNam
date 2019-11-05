/**
lấy customerNumber, customerName, phone, paymentDate, amount từ hai bảng customers và payments với
điều kiện là các khách hàng sống ở thành phố Las Vegas
**/
select customers.customerNumber,customers.customerName,customers.city,paymentDate,amount from customers inner join payments
on customers.customerNumber=payments.customerNumber
where city='Las Vegas';
/**
tìm tất cả các đơn hàng thuộc từng khách hàng
**/
select customers.customerNumber,customerName,orders.orderNumber,status from customers left join orders
on customers.customerNumber=orders.customerNumber;
/**
tìm tất cả khách hàng chưa đặt hàng bất kỳ sản phẩm nào
**/
select customers.customerNumber,customerName,orders.orderNumber,status from customers left join orders
on customers.customerNumber=orders.customerNumber
where orderNumber is null;