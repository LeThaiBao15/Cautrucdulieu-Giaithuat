package com.letb2005110012.Tuan03;

import java.util.Scanner;

public class SoNguyenTo {    
    public static void main(String[] args) {
        boolean ok = true;
        int n;
        System.out.println("Nhap so bat ky n: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i=2; i< n -1; i++){
            if (n % i == 0){
                ok = false;
                break;
            }
            i++;
        }
        if(ok == true){
            System.out.println("la so nguyen to");
        }
        else{
            System.out.println("Del phai so nguyen to");
        }
    }
}

