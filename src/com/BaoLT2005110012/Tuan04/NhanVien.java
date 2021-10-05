package com.baolt2005110012.tuan04;

public class NhanVien {
    String tenNV;
    int luong;
    String diachi;
    String bophanlamviec;
    String ngaysinh;
    NhanVien(){}
    public NhanVien(String tnv, int l, String dc, String bp, String ns){
        tenNV = tnv;
        luong = l;
        diachi = dc;
        bophanlamviec = bp;
        ngaysinh = ns;
    }
    void inthongtin(){
        System.out.println("Ten Nhan Vien= " + tenNV + "Luong= " + luong + "Dia Chi= " + diachi+ "Bo phan lam viec= " + bophanlamviec +"Ngay sinh= " + ngaysinh);
    }

    
}
