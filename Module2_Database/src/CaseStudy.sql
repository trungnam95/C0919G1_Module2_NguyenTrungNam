drop database if exists case_study;
create database case_study;
use case_study;
create table LoaiDichVu(
	IDLoaiDichVu INT primary key,
    TenLoaiDichVu varchar(45)
);
create table KieuThue(
	IDKieuThue INT primary key,
    TenKieuThue varchar(45),
    Gia INT
);
create table DichVu(
	IDDichVu INT primary key,
    TenLoaiDichVu varchar(45),
    DienTich INT,
    SoTang INT,
    SoNguoiToiDa varchar(45),
    ChiPhiThue varchar(45),
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
	IDDichVuDiKem INT primary key,
    TenDichVuDiKem varchar(45),
    Gia INT,
    DonVi INT,
    TrangThaiKhaDung varchar(45)
);
create table ViTri(
	IDViTri INT primary key,
    TenViTri varchar(45)
);
create table TrinhDo(
	IDTrinhDo INT primary key,
    TrinhDo varchar(45)
);
create table BoPhan(
	IDBoPhan INT primary key,
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
	IDHopDongChiTiet INT primary key,
    IDHopDong INT,
    IDDichVuDiKem INT,
    SoLuong INT,
	constraint FK_IDHopDong foreign key (IDHopDong) references HopDong(IDHopDong),
    constraint FK_IDDichVuDiKem foreign key (IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem)
);
insert into nhanvien(HoTen,NgaySinh,SoCMTND,Luong,SDT,Email,DiaChi) value
('Huynh van Kong','1999-01-01','02598764','4 trieu','0905194471','huynhvankong@gmail.com','Gia Lai'),
('Huynh Nguyen van Kong','2001-09-09','123456789','10 trieu','0528595594','huynhnguyenvankong@gmail.com','Da Nang'),
('Huynh Nguyen va','1990-8-9','987654321','15 trieu','035654365950','huynhnguyenva@gmail.com','Ho Chi Minh'),
('Huynh Nguyen van','1989-10-11','456789321','9 trieu','01217542298','huynhnguyenvan@gmail.com','Ha Noi'),
('Huynh van Kong Anh','1991-1-3','569871234','8 trieu','0905917845','huynhvankonganh@gmail.com','Hai Duong'),
('Thi Nga','1992-7-7','9876541245','12 trieu','0528595595','thinga@gmail.com','Thai Binh'),
('Kong Thanh','1993-3-6','456321799','13 trieu','0909999999','kongthanh@gmail.com','Ho Chi Minh'),
('Nguyen Trung Nam','1995-4-10','156321799','14 trieu','0123456789','nguyentrungnam@gmail.com','Ho Chi Minh');
select IDNhanVien,HoTen from nhanvien where (HoTen like 'H%' or HoTen like'T%'or HoTen like 'K%') and length(HoTen)<=15;
insert into khachhang( HoTen,NgaySinh,SoCMTND,SDT,email,DiaChi) value
('Nguyen thi','2008-7-04','6541234894','025659874','nguyenthi@gmail.com','Da Nang'),
('Tran Tam','1995-4-10','2222456897','0905654789','trantam@gmail.com','Quang Tri'),
('Le Phuoc','1995-8-11','1113336666','0257994135','lephuoc@gmail.com','Hue'),
('Ho Ca','2000-10-10','33646879','0598713546','hoca@gmail.com','Gia Lai'),
('le Nam','1994-09-22','6669997621','056598713','lenam@gmail.com','Quang Tri');
select * from khachhang where year(NgaySinh)<=2001 and DiaChi='Da Nang' or DiaChi='Quang Tri';
/**
4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp
xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng
là “Diamond”.
**/
insert into HopDong(NgayLamHopDong,NgayKetThuc,TienDatCoc,TongTien) value
('2013-09-11','2020-10-20',500000,1000000),
('2016-12-12','2019-05-24',400000,3000000),
('2012-12-12','2019-06-24',400000,5000000);






insert into loaikhach(TenLoaiKhach) values('Diamond');
insert into loaikhach(TenLoaiKhach) values('Bronze');
select * from loaikhach;
insert into khachhang(IDLoaiKhach, HoTen,NgaySinh,SoCMTND,SDT,email,DiaChi) values
('1','Nguyen thi Kim','2008-7-04','6541234894','025659874','nguyenthi@gmail.com','Da Nang'),
('1','Nguyen thi kim','1999-9-9','6549879132','246597132','nguyenthikim@gmail.com','Hue'),
('1','Nguyen thi kim tuyen','1999-9-9','6549879132','246597132','nguyenthikim@gmail.com','Hue');
select HoTen,count(TenLoaiKhach) as 'so lan dat' from loaikhach inner join khachhang on
loaikhach.IDLoaiKhach=khachhang.IDLoaiKhach group by HoTen order by count(TenLoaiKhach) asc;
select count(IDLoaiKhach) as 'so lan dat' from loaikhach;
select * from khachhang






