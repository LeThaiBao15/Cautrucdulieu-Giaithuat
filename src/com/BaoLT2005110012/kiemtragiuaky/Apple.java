package com.baolt2005110012.kiemtragiuaky;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Apple {
    int ID;
    float weight;
    String color;
    Scanner khotao = new Scanner(System.in);
    static List<Apple> lApple = new ArrayList<>();
    public Apple(int i, float w, String c) {
        ID = i;
        this.weight = w;
        this.color = c;
    }
    Apple()
    {

    }
   public void menu(){
       System.out.println("==============MENU=============");
       System.out.println("=1=======Tao Apple==========");
       System.out.println("=2=========Them Apple===========");
       System.out.println("=3========Tim Apple===========");
       System.out.println("=4======In Apple==========");
       System.out.println("==============OUT=============");
   }
   public void input()
   {
       System.out.println("Nhap ID Apple:");
       ID = khotao.nextInt();
       System.out.println("Nhap Weight Apple:");
       weight = khotao.nextFloat();
       khotao.nextLine();
       System.out.println("Nhap Color Apple:");
       color = khotao.nextLine();
   }
   public void displayApple(){
        System.out.println("==========Apple========");
        System.out.printf("%-20d %-20.2f %-20S\n","id", "weight", "color");
   }
   public void display()
   {
       for (Apple apple : lApple) {
           apple.displayApple();
            System.out.printf("%-20d %-20.2f %-20S\n",ID, weight,color);
       }
       
   }
   public void addApple()
   {
       System.out.println("Nhap so Apple muon tao:");
       int n = khotao.nextInt();
       for(int  i = 0; i < n; i++)
       {
           Apple apple = new Apple();
           input();
           lApple.add(apple);
       }
   }
   public void find()
   {
       System.out.println("Nhap Color ban muon tim:");
       String name = khotao.nextLine();
       for (Apple apple : lApple) {
           if(name.equals(apple.color)){
               apple.displayApple();
           }
       }
   }
    
}
