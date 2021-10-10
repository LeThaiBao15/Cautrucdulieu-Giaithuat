package com.letb2005110012.Tuan04;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe[] danhsachXe = new Xe[2];
        Xe xe0 = new Xe("Le Thai Bao","Toshiba", "S", "Co", "62lit");
        Xe xe1 = new Xe("Le van teo", "Akasuki","SS", "Ko", "150lit");
        danhsachXe[0] = xe0;
        danhsachXe[1] = xe1;
        for(Xe xe : danhsachXe){
            xe.intthongtin();
        }

    }
    
}
