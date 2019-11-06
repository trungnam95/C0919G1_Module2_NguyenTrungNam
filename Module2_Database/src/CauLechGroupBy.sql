/**
sử dụng mệnh đề group by với cột status trong bang orders
**/
select status from orders group by status;
/**
có bao nhiêu đơn đặt hàng trong mỗi trạng thái, chúng ta có thể sử dụng hàm COUNT với mệnh đề GROUP BY
**/
select status,count(*) as'So luong status' from orders group by status;
/**
Hãy thực hiện tính tổng số tiền của các đơn hàng theo trạng thái đặt hàng.
Ta sẽ sử dụng lệnh inner join để kết nối 2 bảng và sử dụng hàm sum để tính tổng số tiền,
nhóm theo trường status.
**/
select status,sum(quantityOrdered*priceEach)as'amount' from orders inner join orderdetails
on orders.orderNumber=orderdetails.orderNumber group by status;
/**
 tính tổng tiền của từng đơn hàng
**/
select orderNumber,sum(quantityOrdered*priceEach) as'tong tien' from orderdetails
group by orderNumber;
/**
tổng doanh thu của những năm lớn hơn năm 2003.
**/
select year(orderDate) as year, sum(quantityOrdered * priceEach) as total
from orders
inner join orderdetails on orders.orderNumber = orderdetails.orderNumber
where status = 'shipped'
group by year
having year > 2003




