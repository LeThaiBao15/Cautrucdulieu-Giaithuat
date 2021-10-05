package com.baolt2005110012.tuan04;

public class MayTinh {
    String nhasanxuat;
    int namsanxuat;
    String hedieuhanh;
    int Ram;
    String CPU;
    int gia;
    int nambaohanh;
    MayTinh(){}
    public MayTinh(String nh, int na, String he, int R, String C, int g, int nam){
    nhasanxuat = nh;
    namsanxuat= na;
    hedieuhanh = he;
    Ram = R;
    CPU = C;
    gia = g;
    nambaohanh = nam;
    }
    void inthongtin(){
        System.out.println("Nha San Xuat = " + nhasanxuat + "Nam San Xuat = " + namsanxuat +"He dieu hanh= " + hedieuhanh + "Ram = " +Ram + "CPU= " + CPU + "Gia = " + gia + "Nam bao hanh= " +nambaohanh);
    }
}
