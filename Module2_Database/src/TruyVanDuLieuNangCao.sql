/**
hiển thị ra các sản phẩm có giá lớn hơn 56.76 và số lượng trong kho lớn hơn 10
**/
select productCode,productName,buyPrice,quantityInStock from products
where buyPrice>56.65 and quantityInStock>10;
/**
muốn lấy productcode, productname và buyprice từ bảng products, textdescription từ
bảng productlines với điều kiện giá mua nằm trong khoảng từ 1000 đến 2000. Bạn cần
chọn dữ liệu từ cả hai bảng và đối chiếu các hàng bằng cách so sánh cột productline
từ bảng sản phẩm với cột productline từ bảng productlines
**/
select productCode,productName,buyPrice,textDescription from products
inner join productlines
on products.productLine=productlines.productLine
where buyPrice>56.65 and buyPrice <95.59;
/**
hiển thị ra các sản phẩm có loại sản phẩm là Classic Cars hoặc nhà cung cấp là 'Min Lin Diecast'
**/
select productCode,productName,buyPrice,quantityInStock,productVendor,productLine from products
where productLine='Classic Cars' or productVendor='Min Lin Diecast';

