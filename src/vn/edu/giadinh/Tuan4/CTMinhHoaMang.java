package vn.edu.giadinh.Tuan4;
import java.util.Arrays;
public class CTMinhHoaMang {
    public static void main(String[] args) {
        
    
    int[] mangSoNguyen;//chưa chỉ định số phần tử
    mangSoNguyen = new int[5];//=> mảng trong java là 1 kiểu tham chiếu đối tượng
    
    double mangSoThuc[] = new double[10];
    //trước khi dùng thì phải xác định số phần tử của mảng
    mangSoNguyen[0] = 2;
    //KHAI BÁO CÓ KHỞI TẠO GIÁ TRỊ CHO MẢNG
    double diemMonHoc[] = new double[]{10.5, 5.5, 3.0, 4.5};
    System.out.println("Mảng điểm môn học: " + Arrays.toString(diemMonHoc));
    diemMonHoc[0] = diemMonHoc[1];
    //5.5, 5.5, 3.0, 4.5

    System.out.println("Mảng điểm môn học: " + Arrays.toString(diemMonHoc));

    System.out.println("Số phần tử của mảng điểm môn học: "+ diemMonHoc.length);


    //CÁCH 2
    String dsTenSinhVien[] = {"Tèo", "Tý", "Tửng"};
           
            //dùng vòng lặp để duyệt mảng
            System.out.println("********** DUYỆT MẢNG **********");

            for(int i = 0; i < diemMonHoc.length; i++){
                System.out.println(diemMonHoc[i]);
            }
    
            System.out.println("==================For each ==========================");
            //FOR-EACH
            for(double diem : diemMonHoc){
    
                System.out.println(diem);
    
            }
            System.out.println("********** DS Sinh Vien **********");
            //for-each
            for(String DS : dsTenSinhVien){
                System.out.println(DS);
            }
            Dog[] danhSachDog = new Dog[7];

            Dog dog0 = new Dog(10 , "Đen", "Fido");
            Dog dog1 = new Dog(20 , "Trang", "Aido");
            Dog dog2 = new Dog(30 , "Tim", "KUDO");
            Dog dog3 = new Dog(40 , "Xanh", "Hela");
            Dog dog4 = new Dog(50 , "Do", "Toshiba");
            Dog dog5 = new Dog(60 , "Vang", "Aki");
            Dog dog6 = new Dog(70 , "Cam", "Ruto");
            danhSachDog[0] = dog0;
            danhSachDog[1] = dog1;
            danhSachDog[2] = dog2;
            danhSachDog[3] = dog3;    
            danhSachDog[4] = dog4;
            danhSachDog[5] = dog5;
            danhSachDog[6] = dog6;
            for(Dog dog : danhSachDog){
                dog.inThongtin();
            }
           
}
}