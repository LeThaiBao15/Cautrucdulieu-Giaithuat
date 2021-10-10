package com.letb2005110012.Tuan04;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow[] danhsachCow = new Cow[2];
        Cow cow1 = new Cow(50);
        Cow cow0 = new Cow(100);
        danhsachCow[0] = cow0;
        danhsachCow[1] = cow1;
        for(Cow cow : danhsachCow){
            cow.intthongtin();
        }
    }
    
}
