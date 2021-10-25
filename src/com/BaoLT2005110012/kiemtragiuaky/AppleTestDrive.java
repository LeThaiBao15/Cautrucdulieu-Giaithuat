package com.baolt2005110012.kiemtragiuaky;
import java.util.Scanner;
public class AppleTestDrive {
    static Apple apple = new Apple();
    static Scanner khotao = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            apple.menu();
            System.out.println("Input Your Selection:");
            int n = khotao.nextInt();
            switch(n)
            {
                case 0:
                break;
                case 1:
                apple.input();
                break;
                case 2:
                apple.addApple();
                break;
                case 3:
                apple.find();
                break;
                case 4:
                apple.display();
                break;
                default: System.out.println("Error Selection!!!!");
            }
        }while(true);
    }
    
}
