package com.baolt2005110012.tuan04;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach[] danhsachSach = new Sach[2];
        Sach sach0 = new Sach(15000 , "Le Thai Bao", 2002 , 20000, 500 , "A");
        Sach sach1 = new Sach(25000, "Le Van Teo" , 2000, 50000, 1000, "S");
        danhsachSach[0] = sach0;
        danhsachSach[1] = sach1;
        for(Sach sach : danhsachSach){
            sach.inthongtin();
        }

    }
    
}
