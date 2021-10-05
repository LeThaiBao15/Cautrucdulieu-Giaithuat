package vn.edu.giadinh.Tuan2;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanvien;
        nhanvien = new NhanVien();
        nhanvien.tenNV = "Le Thai Bao";
        nhanvien.NgaySinh = "04-10-2002";
        nhanvien.Luong = 10000000;
        nhanvien.Diachi = "669/6 La Xuan Oai";
        nhanvien.Bophanlamviec = "DH Gia Dinh";

        nhanvien.inThongtinNV();
    }
    
}
