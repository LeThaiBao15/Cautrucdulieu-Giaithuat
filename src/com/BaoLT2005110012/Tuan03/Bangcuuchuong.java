package com.letb2005110012.Tuan03;

import java.util.Scanner;

public class Bangcuuchuong {  
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try{System.out.print("Nhap so can xem bang cuu chuong : ");
    int x = scanner.nextInt() ;
      
    for  (int i = 2 ; i <= 10 ; i ++){
        System.out.printf("%d x %d = %d",x,i,x*i);
        System.out.println();
    }
    }    finally{scanner.close();}  
} 
    // Xuất 9 bảng cửu chương 
    
  /*  for(int i = 1 ;  i <= 9 ; i++){
        for(int j =1 ; j<=10 ; j++)
        System.out.printf("> %d x %d = %d  ", i, j, i*j);
        System.out.println();
    }    
    */
}  

