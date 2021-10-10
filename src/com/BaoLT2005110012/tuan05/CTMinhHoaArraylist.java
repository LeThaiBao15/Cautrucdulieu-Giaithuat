package com.baolt2005110012.tuan05;

import java.util.ArrayList;


public class CTMinhHoaArraylist {
    public static void main(String[] args) {
        
        ArrayList a = new ArrayList();
        a.add("Cuong");
        a.add(1);
        a.add(1.5);
        System.out.println(a);

        ArrayList<String> x = new ArrayList<String>();
        x.add("Cuong");
        x.add("Tuan");
        x.add("Phuong");
        x.add("Hanh");
        String s = x.get(2);
        System.out.println(x);
}
}