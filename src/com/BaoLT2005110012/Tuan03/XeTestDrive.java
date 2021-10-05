package com.baolt2005110012.tuan03;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe xe;
        xe = new Xe("Le Thai Bao", "Toshiba", "S", "Co", "62lit");
        System.out.println("Ten chu xe: " + xe.TenChuxe + "Hang san xuat: "+ xe.HangSanxuat + "Dong: " + xe.dong + "Giay phep: " + xe.Giayphep + "Dung tich xang: " + xe.Dungtichxang);
    }
    
}
