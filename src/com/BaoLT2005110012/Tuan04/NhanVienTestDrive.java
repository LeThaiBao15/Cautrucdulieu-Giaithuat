package com.letb2005110012.Tuan04;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien[] danhsachNV = new NhanVien[2];
        NhanVien nhanvien0 = new NhanVien("Le Thai Bao", 10000, "62/3 La Xuan Oai", "DH Gia Dinh", "4-10-2002");
        NhanVien nhanvien1 = new NhanVien("Le Van Teo", 15000, "Nga ba Vung Lay", "Hang hang khong airline", "5-5-1999");
        danhsachNV[1] = nhanvien1;
        danhsachNV[0] = nhanvien0;
        for(NhanVien nhanvien : danhsachNV){
            nhanvien.inthongtin();
        }
    }
    
}
