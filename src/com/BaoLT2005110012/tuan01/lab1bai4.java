package com.baolt2005110012.tuan01;

import java.util.Scanner;

public class lab1bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{System.out.print("Nhap he so bac 2: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap he so bac 1: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap he so tu do: ");
        double c = scanner.nextDouble();
        System.out.println("Delta: " + Math.pow(b, 2)-4*a*c);
        double Delta = scanner.nextDouble();
        System.out.println("Can Delta: " + Math.sqrt(Delta));}
        finally{scanner.close();}  
    }
    
}
