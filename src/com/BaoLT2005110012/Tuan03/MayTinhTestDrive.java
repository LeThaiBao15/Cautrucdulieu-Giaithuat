package com.baolt2005110012.tuan03;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh maytinh;
        maytinh = new MayTinh("Le Thai Bao", 2002, "Window SP", "16Gb", "GiGaByte", 5000000, 2);
        System.out.println("Nha san xuat: " + maytinh.Nhasanxuat + "Nam san xuat: " + maytinh.Namsanxuat + "He dieu hanh: "+ maytinh.Hedieuhanh + "RAM: " + maytinh.Ram + "CPU: " + maytinh.CPU + "Gia: " + maytinh.Gia + "Nam bao hanh: " + maytinh.nambaohanh);
    }
    
}
