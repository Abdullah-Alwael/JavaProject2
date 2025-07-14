package com.project2;

public abstract class Passenger {
    private String name;
    private String iD;
    private Car reservedCar;
    private double tripCost;

    public Passenger(String name, String iD) {
        this.name = name;
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public abstract double reserveCar(Car car);


    public abstract void displayPassengerInformation();
}
