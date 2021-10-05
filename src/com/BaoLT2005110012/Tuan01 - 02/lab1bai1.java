package vn.edu.giadinh.Tuan2;

import java.util.Scanner;

public class  lab1bai1 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         try {System.out.print("Ho va Ten: ");
         String hoTen = scanner.nextLine();
         System.out.print("Diem TB: ");
         double diemTB = scanner.nextDouble();
         System.out.printf(" %s : %f diem ",hoTen,diemTB);}
         finally{scanner.close();}   
    }
    
}
