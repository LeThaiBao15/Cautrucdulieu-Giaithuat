package vn.edu.giadinh.Tuan2;

import java.util.Scanner;

public class lab1bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{System.out.print("Nhap chieu dai: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double chieuRong = scanner.nextDouble();
        System.out.println("Chu vi: " + (chieuDai + chieuRong)*2);
        System.out.println("Dien tich: " + chieuDai*chieuRong);
        System.out.println("Canh nho nhat:" + Math.min(chieuDai,chieuRong));}
        finally{scanner.close();}  
    }
    
}
