package com.baolt2005110012.tuan03;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanvien;
        nhanvien = new NhanVien("Le Thai Bao", 2000000, "62/3 La Xuan Oai", "DH Gia Dinh", "4-10-2002");
        System.out.println("Ten Nhan Vien: " + nhanvien.TenNhanVien + "Luong: " + nhanvien.Luong + "Dia Chi: " +nhanvien.diachi + "Bo phan lam viec: " + nhanvien.bophanlamviec + "Ngay Sinh: " + nhanvien.NgaySinh);
    }
    
}
