package day02;

import day02.abstraction.*;

public class Polymorphism {

    public static void main(String[] args) {

        LuxuryCar luxuryCar1 = new BMW();
        luxuryCar1.massage();
       // luxuryCar1.drive();
      //  luxuryCar1.stop();
      //  luxuryCar1.start();

        LuxuryCar luxuryCar2 = new Mercedes();

      //  LuxuryCar luxuryCar3 = new Tesla();

      //  LuxuryCar luxuryCar4 = new Honda();

        System.out.println("----------------------------");

        Car car = new Mercedes();
        car.drive();
        car.start();
        car.stop();
        ((Mercedes) car).massage();


    }

}
