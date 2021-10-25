package com.baolt2005110012.tuan08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoProgram {
    public static void main(String[] args) {
        Queue<Integer> queue;

        queue = new LinkedList<>();
        
        queue.add(8);
        queue.add(10);
        queue.add(2);

        // Lấy ra 1 phần tử - trong queue - lấy đầu
        System.out.println(queue);
        int phanTuduoclayra = queue.remove();
        System.out.println("Phan tu duoc lay ra tu Queue: " +phanTuduoclayra);
        System.out.println("Phan tu con lai: ");
        System.out.println(queue);
        // Thăm 1 phần tử của Queue - không lấy ra
        int phanduocTham = queue.peek();
        System.out.println("Phan tu duoc tham: " +phanduocTham);
        System.out.println("Phan tu con lai sau khi tham: ");
        System.out.println(queue);

        // Cài đặt Linked List
           // thêm 1 phần tử vào cuối
           // láy 1 phần tử đầu
           // xóa 1 phần tử ở đầu

        // Dùng Linked List để cài đặt cấu trúc Stack
         // thêm 1 phần tử vào cuối
           // láy 1 phần tử cuối
           // xóa 1 phần tử ở cuối



    }
    
}
