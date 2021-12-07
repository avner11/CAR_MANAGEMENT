package com.company;

public class Electric_Car extends Car{

    public Electric_Car(String vehicleName, String vehicleColor, int year, int price,String carBrand){
        super(vehicleName, vehicleColor, year, price,carBrand);
    }

    public String electric(){
        return "electric car";
    }
}
