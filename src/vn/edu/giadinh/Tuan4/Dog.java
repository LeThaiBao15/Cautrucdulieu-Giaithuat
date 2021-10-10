package vn.edu.giadinh.Tuan4;

public class Dog {
    String name;
    int size;
    String color;
    public Dog(){}
    public Dog(int s){
        size = s;
    }
    public Dog(int s, String c, String n){
        size = s;
        color = c;
        name = n;
    }
    void inThongtin(){
        System.out.println("Kich thuoc = " + size + "Mau sac = " + color + "Ten = " + name);
    }
    
}
