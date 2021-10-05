package com.baolt2005110012.tuan02;

import java.util.Date;

public class Sinhvien {

    //1. Thuộc tính

    String mssv;
    String tenSinhVien;
    int tuoi;
   
    String quequan;
   
    Date NgaySinh;

    //2. Phương thức
    //<Kiểu dữ liệu trả về> <tên hàm> <danh sách tham số>{........}
   
    void inThongTinSV(){
        System.out.println("Mã số sinh viên: " + mssv);
        System.out.println("Tên sinh viên: " + tenSinhVien);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Quê quán: " + quequan);
        System.out.println("Ngày sinh: " + NgaySinh);
        
    }


    
}
