package com.baolt2005110012.tuan04;

public class TKTestDrive {
    public static void main(String[] args) {
        TK[] danhsachTK = new TK[2];
        TK tk0 = new TK("Le Thai Bao" , 051202034,50000);
        TK tk1 = new TK("Le van teo", 15162161, 10000);
        danhsachTK[0] = tk0;
        danhsachTK[1] = tk1;
        for(TK tk : danhsachTK){
            tk.intthongtin();
        }
    }
    
}
