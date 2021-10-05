package com.baolt2005110012.tuan02;

public class CowTestDrive {

    public static void main(String[] args) {
        Cow cow;
        //cow = new Cow();
        cow = new Cow(15);
        System.out.println("weight: " + cow.weight);


        cow = new Cow(5);
        System.out.println("weight: " + cow.weight);
        

        cow = new Cow(25.5, "Tay Ban Nha", "Đen");
        System.out.println("weight: " + cow.weight + "Breed: " + cow.breed + "Color: " + cow.color);




    }

}