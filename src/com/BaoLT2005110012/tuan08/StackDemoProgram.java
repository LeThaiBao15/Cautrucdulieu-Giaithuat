package com.baolt2005110012.tuan08;

import java.util.Stack;

import vn.edu.giadinh.Tuan4.Student;

public class StackDemoProgram {
    public static void main(String[] args) {
        Stack<String> stack;
        stack = new Stack<>();

        //thêm phần tử vào Stack
        stack.push("Welcome");
        stack.push("To");
        stack.push("Data Structure");

        System.out.println(stack);

        //Lấy ra 1 phần tử đỉnh Stack (Xóa bỏ khỏi Stack)
        String poped = stack.pop();
        System.out.println("Da lay ra tu danh sach Stack" + poped);
        System.out.println("Phan tu con lai cua Stack");
        System.out.println(stack);

        //Thăm nút đỉnh // Không loại khỏi ds
        String phanTuduoctham = stack.peek();
        System.out.println("Tham phan tu dinh: " + phanTuduoctham);

        // Sau khi thăm
        System.out.println(stack);


        Stack<Student> stack2;  
    }
    
}
