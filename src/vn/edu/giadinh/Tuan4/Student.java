package vn.edu.giadinh.Tuan4;

public class Student {
    int MSSV;
    String HoTen;
    int tuoi;
    String quequan;
    public Student(){}
    public Student(int ms, String HT, int t, String que){
        MSSV = ms;
        HoTen = HT;
        tuoi = t;
        quequan = que;
    }
    void inThongtin(){
        System.out.println("Ma so sinh vien: " + MSSV + "Ho Ten: " + HoTen + "Tuoi: " +tuoi +"Que quan: " + quequan);
    }
    
}
