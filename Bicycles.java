package com.company;

public class Bicycles extends Vehicle{

    public Bicycles(String vehicleName, String vehicleColor, int year, int price) {
        super(vehicleName,vehicleColor,year,price);
    }

    @Override
    public String toString() {
        return "Bicycles{" +
                "vehicleName='" + vehicleName + '\'' +
                ", vehicleColor='" + vehicleColor + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
