package vn.edu.giadinh.Tuan2;

import java.util.Scanner; //#include<stdio.h>



public class CTMinhHoa {


     public static void main(String[] args) {
        Scanner bienNhap; //Biến tham chiếu đối tượng
        double diemMonCTDL_GT;
        diemMonCTDL_GT = 4.0;//f
        // Tạo đối tượng
        // Toán tử new
        // Hàm tạo của lớp Scanner
        bienNhap = new Scanner(System.in); //Toán tử gán biến nhập vào new scanner biến tham chiếu
        System.out.print("Nhập vào điểm môn CTDL_GT: ");
        diemMonCTDL_GT = bienNhap.nextDouble();

        System.out.println("Điểm vừa nhập là: " + diemMonCTDL_GT);

        String chuoi = new String("hello my world");
    }
    
}
