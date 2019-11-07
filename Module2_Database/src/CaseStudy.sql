drop database if exists case_study;
create database case_study;
use case_study;
create table LoaiDichVu(
	IDLoaiDichVu INT auto_increment primary key,
    TenLoaiDichVu varchar(45)
);
create table KieuThue(
	IDKieuThue INT auto_increment primary key,
    TenKieuThue varchar(45),
    Gia INT
);
create table DichVu(
	IDDichVu INT auto_increment primary key,
    TenDichVu varchar(45),
    DienTich INT,
    SoTang INT,
    SoNguoiToiDa varchar(45),
    ChiPhiThue double,
    IDKieuThue INT,
    IDLoaiDichVu INT,
    TrangThai varchar(45),
    constraint FK_IDLoaiDichVu foreign key (IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu),
    constraint FK_IDKieuThue foreign key (IDKieuThue) references KieuThue(IDKieuThue)
);
create table LoaiKhach(
	IDLoaiKhach INT auto_increment primary key,
    TenLoaiKhach varchar(45)
);
create table KhachHang(
	IDKhachHang INT auto_increment primary key,
    IDLoaiKhach INT,
    HoTen varchar(45),
    NgaySinh date,
    SoCMTND varchar(45),
    SDT varchar(45),
    email varchar(45),
    DiaChi varchar(45),
    constraint FK_IDLoaiKhach foreign key (IDLoaiKhach) references LoaiKhach(IDLoaiKhach)
);
create table DichVuDiKem(
	IDDichVuDiKem INT auto_increment primary key,
    TenDichVuDiKem varchar(45),
    Gia INT,
    DonVi INT,
    TrangThaiKhaDung varchar(45)
);
create table ViTri(
	IDViTri INT auto_increment primary key,
    TenViTri varchar(45)
);
create table TrinhDo(
	IDTrinhDo INT auto_increment primary key,
    TrinhDo varchar(45)
);
create table BoPhan(
	IDBoPhan INT auto_increment primary key,
    TenBoPhan varchar(45)
);
create table NhanVien(
	IDNhanVien INT auto_increment primary key,
    HoTen varchar(45),
    IDViTri INT,
    IDTrinhDo INT,
    IDBoPhan INT,
    NgaySinh date,
    SoCMTND varchar(45),
    Luong varchar(45),
    SDT varchar(45),
    Email varchar(45),
    DiaChi varchar(45),
	constraint FK_IDViTri foreign key (IDViTri) references ViTri(IDViTri),
    constraint FK_IDTrinhDo foreign key (IDTrinhDo) references TrinhDo(IDTrinhDo),
    constraint FK_IDBoPhan foreign key (IDBoPhan) references BoPhan(IDBoPhan)
);
create table HopDong(
	IDHopDong INT auto_increment primary key,
    IDNhanVien INT,
    IDKhachHang INT,
    IDDichVu INT,
    NgayLamHopDong date,
    NgayKetThuc date,
    TienDatCoc INT,
    TongTien INT,
    constraint FK_IDNhanVien foreign key (IDNhanVien) references NhanVien(IDNhanVien),
    constraint FK_IDKhachHang foreign key (IDKhachHang) references KhachHang(IDKhachHang),
    constraint FK_IDDichVu foreign key (IDDichVu) references DichVu(IDDichVu)
);
create table HopDongChiTiet(
	IDHopDongChiTiet INT auto_increment primary key,
    IDHopDong INT,
    IDDichVuDiKem INT,
    SoLuong INT,
	constraint FK_IDHopDong foreign key (IDHopDong) references HopDong(IDHopDong),
    constraint FK_IDDichVuDiKem foreign key (IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem)
);
insert into TrinhDo(TrinhDo) values ('Dai Hoc'),
('Cao Dang'),
('Trung Cap');
insert into BoPhan(TenBoPhan) values('Sales'),
('Ke Toan'),
('IT');
insert into nhanvien(HoTen,IDTrinhDo,IDBoPhan,NgaySinh,SoCMTND,Luong,SDT,Email,DiaChi) value
('Huynh van Kong',1,2,'1999-01-01','02598764','4 trieu','0905194471','huynhvankong@gmail.com','Gia Lai'),
('Huynh Nguyen van Kong',1,3,'2001-09-09','123456789','10 trieu','0528595594','huynhnguyenvankong@gmail.com','Da Nang'),
('Huynh Nguyen',1,3,'1990-8-9','987654321','15 trieu','035654365950','huynhnguyen@gmail.com','Ho Chi Minh'),
('Huynh Nguyen van',2,3,'1989-10-11','456789321','9 trieu','01217542298','huynhnguyenvan@gmail.com','Ha Noi'),
('Huynh van Kong Anh',3,3,'1991-1-3','569871234','8 trieu','0905917845','huynhvankonganh@gmail.com','Hai Duong'),
('Thi Nga',1,2,'1992-7-7','9876541245','12 trieu','0528595595','thinga@gmail.com','Thai Binh'),
('Kong Thanh',1,3,'1993-3-6','456321799','13 trieu','0909999999','kongthanh@gmail.com','Ho Chi Minh'),
('Nguyen Trung Nam',3,3,'1995-4-10','156321799','14 trieu','0123456789','nguyentrungnam@gmail.com','Ho Chi Minh');
insert into loaikhach(TenLoaiKhach) values('Diamond'),
('Bronze');
insert into khachhang( IDLoaiKhach,HoTen,NgaySinh,SoCMTND,SDT,email,DiaChi) value
(2,'Nguyen thi','2008-7-04','6541234894','025659874','nguyenthi@gmail.com','Vinh'),
(2,'Tran Tam','1995-4-10','2222456897','0905654789','trantam@gmail.com','Vinh'),
(2,'Le Phuoc','1995-8-11','1113336666','0257994135','lephuoc@gmail.com','Hue'),
(1,'Ho Ca','2000-10-10','33646879','0598713546','hoca@gmail.com','Vinh'),
(2,'le Nam','1994-09-22','6669997621','056598713','lenam@gmail.com','Quang Ngai');
insert into LoaiDichVu(TenLoaiDichVu) value('Villa'),
('House');
insert into DichVu(TenDichVu,DienTich,SoNguoiToiDa,ChiPhiThue,IDLoaiDichVu) value('Villa 5*',1000,5,5000000,1),
('House 4*',2000,4,10000000,2);
insert into DichVuDiKem(TenDichVuDiKem,Gia,DonVi,TrangThaiKhaDung) value('massage',100000,5,'ok'),
('karaoke',200000,1,'full');
insert into HopDong(IDNhanVien,IDKhachHang,IDDichVu,NgayLamHopDong,NgayKetThuc,TienDatCoc,TongTien) value
(3,3,1,'2013-09-11','2020-10-20',500000,1000000),
(3,3,1,'2013-09-11','2020-10-20',500000,1000000),
(3,3,1,'2013-09-11','2020-10-20',500000,1000000),
(2,5,2,'2019-09-11','2021-10-20',500000,1000000),
(2,4,2,'2019-09-11','2021-10-20',500000,1000000),
(3,1,1,'2017-09-11','2021-10-20',500000,1000000),
(2,2,1,'2016-12-12','2018-05-24',400000,3000000),
(7,3,2,'2012-12-12','2019-06-24',400000,5000000),
(5,4,2,'2019-12-12','2019-05-24',400000,3000000),
(6,5,1,'2012-12-12','2019-06-24',400000,5000000);
insert into HopDongChiTiet(IDHopDong,IDDichVuDiKem,SoLuong) value(1,1,2);
insert into HopDongChiTiet(IDHopDong,IDDichVuDiKem,SoLuong) value(1,1,4);
insert into HopDongChiTiet(IDHopDong,IDDichVuDiKem,SoLuong) value(1,1,4);
insert into HopDongChiTiet(IDHopDong,IDDichVuDiKem,SoLuong) value(3,1,2);
insert into HopDongChiTiet(IDHopDong,IDDichVuDiKem,SoLuong) value(2,2,1);
insert into HopDongChiTiet(IDHopDong,IDDichVuDiKem,SoLuong) value(5,2,3);
insert into HopDongChiTiet(IDHopDong,IDDichVuDiKem,SoLuong) value(7,2,4);
select IDNhanVien,HoTen from nhanvien where (HoTen like 'H%' or HoTen like'T%'or HoTen like 'K%') and length(HoTen)<=15;
select * from khachhang where year(NgaySinh)<=2001 and DiaChi='Da Nang' or DiaChi='Quang Tri';
/**
4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp
xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng
là “Diamond”.
**/
select khachhang.IDLoaiKhach,count(hopdong.IDHopDong)as 'so lan dat',khachhang.HoTen,loaikhach.tenloaikhach
from khachhang
join hopdong on khachhang.IDKhachHang=hopdong.IDKhachHang
join loaikhach on khachhang.IDLoaiKhach=loaikhach.IDLoaiKhach
where loaikhach.tenloaikhach='Diamond'
group by khachhang.IDKhachHang
order by count(hopdong.IDHopDong) asc ;
/**
5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc,
TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và
Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng.
(Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
**/
select khachhang.IDKhachHang,KhachHang.HoTen,loaikhach.TenLoaiKhach,hopdong.NgayLamHopDong,
hopdong.NgayKetThuc,sum(ChiPhiThue+(SoLuong*Gia))as'Tong Tien' from khachhang
join loaikhach on khachhang.IDLoaiKhach=loaikhach.IDLoaiKhach
left join hopdong on khachhang.IDKhachHang=hopdong.IDKhachHang
left join dichvu on hopdong.IDDichVU=dichvu.IDDichVu
left join hopdongchitiet on hopdong.IDHopdong=hopdongchitiet.IDHopDong
left join dichvudikem on hopdongchitiet.IDDichVuDiKem=dichvudikem.IDDichVuDiKem
group by khachhang.IDKhachHang
order by khachhang.IDKhachHang;
/**
6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ
chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
**/
select dichvu.IDDichVu,dichvu.TenDichVu,dichvu.DienTich,dichvu.ChiPhiThue,loaidichvu.TenLoaiDichVu
from dichvu
join loaidichvu on dichvu.idLoaiDichVu=loaidichvu.idLoaiDichVu
where not exists(select hopdong.NgayLamHopDong from hopdong where(hopdong.NgayLamHopDong between
'2019-01-01' and '2019-03-29') and dichvu.IDDichVu=hopdong.IDDichVu);
/**
7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của
tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách
hàng đặt phòng  trong năm 2019.
**/
select dichvu.IDDichVu,dichvu.TenDichVu,dichvu.DienTich,dichvu.SoNguoiToiDa,dichvu.ChiPhiThue,
loaidichvu.TenLoaiDichVu from dichvu
join loaidichvu
on dichvu.IDLoaiDichVu=loaidichvu.IDLoaiDichVu
where exists(select hopdong.NgayLamHopDong from hopdong where(hopdong.NgayLamHopDong between'2018-01-01' and '2019-01-01')
and dichvu.IDDichVu=hopdong.IDDichVu)
and not exists(select hopdong.NgayLamHopDong from hopdong where(hopdong.NgayLamHopDong between '2019-01-01' and now())
and dichvu.IDDichVu=hopdong.IDDichVu);
/**
8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
**/
select distinct khachhang.HoTen from khachhang;
select khachhang.HoTen from khachhang
group by khachhang.HoTen;
select khachhang.HoTen from khachhang
union
select khachhang.HoTen from khachhang;
/**
9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
**/
select meses.month , count(month(NgayLamHopDong)) as sokhachhangdangki
FROM
           (
                     SELECT 1 AS MONTH
                      UNION SELECT 2 AS MONTH
                      UNION SELECT 3 AS MONTH
                      UNION SELECT 4 AS MONTH
                      UNION SELECT 5 AS MONTH
                      UNION SELECT 6 AS MONTH
                      UNION SELECT 7 AS MONTH
                      UNION SELECT 8 AS MONTH
                      UNION SELECT 9 AS MONTH
                      UNION SELECT 10 AS MONTH
                      UNION SELECT 11 AS MONTH
                      UNION SELECT 12 AS MONTH
           ) as meses
left join hopdong on month(hopdong.NgayLamHopDong) = meses.month
left join khachhang on khachhang.IDKhachHang = hopdong.IDKhachHang
where year(hopdong.NgayLamHopDong) = '2019' or year(hopdong.NgayLamHopDong) is null or month(hopdong.NgayLamHopDong) is null
group by meses.month
order by meses.month;
/**
10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem
(được tính dựa trên việc count các IDHopDongChiTiet).
**/
select hopdong.IDHopDong,hopdong.NgayLamHopDong,hopdong.NgayKetThuc,hopdong.TienDatCoc,sum(HopDongChiTiet.SoLuong)as'SoLuongDichVuDiKem '
from hopdong
left join hopdongchitiet
on hopdong.IDHopDong=hopdongchitiet.IDHopDong
left join dichvudikem
on hopdongchitiet.IDDichVuDiKem=dichvudikem.IDDichVuDiKem
group by hopdong.IDhopdong;
/**
11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và
có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
**/
select dichvudikem.IDDichVuDiKem,dichvudikem.Gia from dichvudikem
join hopdongchitiet
on dichvudikem.IDDichVuDiKem=hopdongchitiet.IDDichVuDiKem
join hopdong
on hopdongchitiet.IDHopDongChiTiet=hopdong.IDHopDong
join khachhang
on hopdong.IDKhachHang=khachhang.IDKhachHang
where khachhang.IDLoaiKhach=1 and (khachhang.DiaChi='Vinh' or khachhang.DiaChi='Quang Ngai');
/**
12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem
(được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối
năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
**/
select hopdong.IDHopDong,nhanvien.HoTen as'ho ten nhan vien',khachhang.HoTen as'ho ten khach hang',khachhang.SDT,dichvu.TenDichVu,
sum(hopdongchitiet.SoLuong)as'So Luong Dich Vu Di Kem',hopdong.TienDatCoc from khachhang
join hopdong on khachhang.IDKhachHang=hopdong.IDKhachHang
join nhanvien on hopdong.IDNhanVien=nhanvien.IDNhanVien
join dichvu on hopdong.IDDichVu=dichvu.IDDichvu
join hopdongchitiet on hopdong.IDhopdong=hopdongchitiet.IDhopdong
join dichvudikem on hopdongchitiet.IDDichVuDiKem=dichvudikem.IDDichVuDiKem
where exists(select hopdong.NgayLamHopDong from hopdong where(hopdong.NgayLamHopDong between'2019-09-01' and '2020-01-01')
and dichvu.IDDichVu=hopdong.IDDichVu)
and not exists(select hopdong.NgayLamHopDong from hopdong where(hopdong.NgayLamHopDong between '2019-01-01' and '2019-06-01')
and dichvu.IDDichVu=hopdong.IDDichVu)
group by hopdong.IDHopDong
order by hopdong.IDHopDong asc;
/**
13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
(Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
**/
select dichvudikem.TenDichVuDiKem,hopdong.idhopdong,sum(hopdongchitiet.SoLuong) as solan from dichvudikem
inner join hopdongchitiet on hopdongchitiet.iddichvudikem = dichvudikem.iddichvudikem
inner join hopdong on hopdong.idhopdong = hopdongchitiet.idhopdong
where hopdongchitiet.IDDichVuDiKem >=1
group by hopdongchitiet.IDDichVuDiKem
having count( hopdongchitiet.IDDichVuDiKem) >=all( select max(solan) from(select dichvudikem.TenDichVuDiKem,
hopdong.idhopdong,count( hopdongchitiet.IDDichVuDiKem) as 'solan' from dichvudikem
inner join hopdongchitiet on hopdongchitiet.iddichvudikem = dichvudikem.iddichvudikem
inner join hopdong on hopdong.idhopdong = hopdongchitiet.idhopdong
where hopdongchitiet.IDDichVuDiKem >=1
group by hopdongchitiet.IDDichVuDiKem) tmp);
select *,sum(hopdongchitiet.SoLuong) as soluongsudung  from dichvudikem
join hopdongchitiet on dichvudikem.IDDichVuDikem=hopdongchitiet.IDDichVuDiKem
group by dichvudikem.IDDichVuDiKem;
/**
14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
**/
select hopdong.IDHopDong,loaidichvu.TenLoaiDichVu,dichvudikem.TenDichVuDiKem,count( hopdongchitiet.IDDichVuDiKem) as solansudung from dichvudikem
join hopdongchitiet on dichvudikem.IDDichVuDiKem=hopdongchitiet.IDDichVuDiKem
join hopdong on hopdong.IDHopDong=hopdongchitiet.IDHopDong
join dichvu on dichvu.IDDichVu=hopdong.IDDichVu
join loaidichvu on dichvu.IDLoaiDichVu=loaidichvu.IDLoaiDichVu
group by hopdongchitiet.IDDichVuDiKem
having count(hopdongchitiet.IDDichVuDiKem)=1;
/**
15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai,
DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
**/
select nhanvien.IDNhanVien,nhanvien.HoTen,trinhdo.TrinhDo,bophan.TenBoPhan,nhanvien.SDT,nhanvien.DiaChi from nhanvien
join trinhdo on nhanvien.IDTrinhDo=trinhdo.IDTrinhDo
join bophan on bophan.IDBoPhan=nhanvien.IDBoPhan
join hopdong on nhanvien.IDNhanVien=hopdong.IDNhanVien
group by nhanvien.IDNhanVien
having count(hopdong.IDHopDong) between 1 and 3
order by IDNhanVien;
/**
16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
**/
select nhanvien.IDNhanVien,nhanvien.HoTen,trinhdo.TrinhDo,bophan.TenBoPhan,nhanvien.SDT,nhanvien.DiaChi from nhanvien
left join trinhdo on nhanvien.IDTrinhDo=trinhdo.IDTrinhDo
left join bophan on bophan.IDBoPhan=nhanvien.IDBoPhan
left join hopdong on nhanvien.IDNhanVien=hopdong.IDNhanVien
group by nhanvien.IDNhanVien
having count(hopdong.IDHopDong)=0
order by IDNhanVien;





