package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

       System.out.println("input vehicle type: (CAR/BIKE) ");
       String vehicleType = scanner.nextLine().toUpperCase(Locale.ROOT);

        switch (vehicleType){
            case "CAR":
                System.out.println("this car is electric ? ");
                Boolean a = scanner.nextBoolean();

                if (a) {
                    Electric_Car v = new Electric_Car("MAZDA", "white", 2001, 20000, "tg");
                    System.out.println(v);
                    System.out.println(v.electric());
                    break;
                }
                else {
                    Car v = new Car("HYUNDI", "BLACK", 2001, 20000, "tg");
                    System.out.println(v);
                    break;
                }



            case "BIKE" :
                Bike b = new Bike("CROSS","BLACK",2003,2000);
                System.out.println(b);
                break;

            default :
                System.out.println("this is not vehicle");
        }
    }




}
