package com.baolt2005110012.tuan04;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh[] danhsachMT = new MayTinh[2];
        MayTinh mt0 = new MayTinh("Le Thai Bao", 2002, "IOS" , 4, "GiGabyte",20000, 2);
        MayTinh mt1 = new MayTinh("Le van teo", 2000, "AD", 5,"Naruto", 25000,3);
            danhsachMT[0] = mt0;
            danhsachMT[1] = mt1;
        for(MayTinh mt : danhsachMT){
            mt.inthongtin();
        }
    }
    
}
