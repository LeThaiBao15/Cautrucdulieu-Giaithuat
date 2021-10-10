package com.letb2005110012.Tuan04;

public class TK {
    String ten;
    int sotaikhoan;
    int sodutaikhoan;
    TK(){}
    public TK(String t, int stk, int sdtk){
        ten = t;
        sotaikhoan = stk;
        sodutaikhoan = sdtk;
    }
    void intthongtin(){
        System.out.println("Ten chu tai khoan = " + ten +"So tai khoan= " + sotaikhoan + "So du tai khoan= " + sodutaikhoan);
    }
    
}
