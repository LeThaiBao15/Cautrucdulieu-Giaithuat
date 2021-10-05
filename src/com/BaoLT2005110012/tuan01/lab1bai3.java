package com.baolt2005110012.tuan01;

import java.util.Scanner;

public class lab1bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{System.out.print("Nhap canh lap phuong: ");
        double canh = scanner.nextDouble();
        System.out.println("The tich khoi lap phuong: " +canh*canh*canh);}
        finally{scanner.close();}  
    }
    
}
