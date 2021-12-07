package com.company;

public class Car extends Vehicle{
 String carBrand;

    public Car(String vehicleName, String vehicleColor, int year, int price,String carBrand) {
        super(vehicleName, vehicleColor, year, price);
        this.carBrand = carBrand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleColor='" + vehicleColor + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
