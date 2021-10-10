package com.letb2005110012.Tuan04;

public class Sach {
    int gia;
    String nhaxuatban;
    int namxuatban;
    int giaban;
    int soluong;
    String loai;
    public Sach(){}
    public Sach(int g){
        gia = g;
    }
    public Sach(int g, String nh, int na, int gb, int sl, String l){
           gia = g;
           nhaxuatban = nh;
           namxuatban = na;
           giaban = gb;
           soluong = sl;
           loai = l;
    }
    void inthongtin(){
        System.out.println("Gia = " +gia + "Nha Xuat Ban = "+ nhaxuatban + "Nam Xuat Ban = " + namxuatban + "Gia ban = " + giaban + "So luong = " + soluong + "Loai = " + loai);
    }
    
}
