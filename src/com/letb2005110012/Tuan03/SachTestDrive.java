package com.letb2005110012.Tuan03;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach sach;
        sach = new Sach(15000, "Le Thai Bao", 2002, 20000, 500, "A");
        System.out.println("Gia: "+ sach.gia + "Nha xuat ban: " + sach.nhaxuatban + "Nam xuat ban: " + sach.namxuatban + "Gia ban:" + sach.giaban + "So luong: " + sach.soluong + "Loai: "+ sach.loai);
    }
    
}
