package com.baolt2005110012.tuan02;



public class SinhvienTestDrive {
    
     public static void main(String[] args) {
        Sinhvien sinhvien;// khai báo tên sinhvien tham chiếu đối tượng kiểu sinhvien
        sinhvien = new Sinhvien();// Tạo đối tượng sinh viên trong vùng nhớ Heap
        sinhvien.mssv = "2005110012";
        sinhvien.tenSinhVien = "Lê Thái Bảo";
        sinhvien.quequan = "TP Hồ Chí Minh";
        sinhvien.tuoi = 18;
        
        sinhvien.inThongTinSV();
    }
}
