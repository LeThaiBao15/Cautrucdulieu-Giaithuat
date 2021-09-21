package vn.edu.giadinh.Tuan2;

public class CowTestDrive {

    public static void main(String[] args) {
        Cow cow;
        //cow = new Cow();
        cow = new Cow(15);
        System.out.println("weight: " + cow.weight);


        cow = new Cow(5);
        System.out.println("weight: " + cow.weight);

        cow.weight = 15;


    }

}