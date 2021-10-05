package com.baolt2005110012.tuan04;

public class Xe {
    String tenchuxe;
    String hangsanxuat;
    String dong;
    String giayphep;
    String dungtich;
    Xe(){}
    public Xe(String ten, String hang, String d, String gp, String dt){
        tenchuxe = ten;
        hangsanxuat = hang;
        dong = d;
         giayphep = gp;
         dungtich = dt;
    }
    void intthongtin(){
        System.out.println("Ten chu xe= " + tenchuxe + "Hang san xuat= " +hangsanxuat +"Dong= " + dong + "Giay phep= " + giayphep + "Dung tich = " + dungtich);
    }
    
}
