package vn.edu.giadinh.Tuan2;

import java.util.Scanner;

public class lab2bai4 {
    public static void main(String[] args) {
        System.out.println("==========Menu==========");
        System.out.println(">>>1.Giai phuong trinh bac 1");
        System.out.println(">>>2.Giai phuong trinh bac 2");
        System.out.println(">>>3.Tinh tien dien");
        System.out.println("==========Menu==========");
        int suLuaChon;
        System.out.print("Lua chon chuc nang: ");
        Scanner bienNhap;
        bienNhap = new Scanner(System.in);
        suLuaChon = bienNhap.nextInt();

        switch(suLuaChon){
            case 1: giaiPTBacI();; break;
            case 2: giaiPTBacII();break;
            case 3: tinhTienDien();; break;
            default: System.out.println("Chon chuc nang khac: ");
        }
    }
    static void giaiPTBacI(){
        System.out.println("Trien khai code giai phuong trinh bac I...");
    }
    static void giaiPTBacII(){
        System.out.println("Trien khai code giai phuong trinh bac II...");
    }
    static void tinhTienDien(){
        System.out.println("Trien khai code tinh tien dien...");
    }
}
