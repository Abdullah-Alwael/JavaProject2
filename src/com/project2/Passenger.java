package com.project2;

public abstract class Passenger {
    private String name;
    private String iD;
    private Car reservedCar;
    private double tripCost;

    public Passenger(String name, String iD) {
        setName(name);
        setID(iD);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()){
            throw new IllegalArgumentException("Name can not be empty");
        }
        this.name = name;
    }

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        if (iD.isBlank()){
            throw new IllegalArgumentException("ID can not be empty");
        }
        this.iD = iD;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        if (tripCost <0){
            throw new IllegalArgumentException("The trip cost can not be negative, but it can be free!" +
                    " are you willing to give a ride to the passengers for free, and give them money too?");
        }
        this.tripCost = tripCost;
    }

    public void setReservedCar(Car reservedCar) {
        if (reservedCar == null){
            throw new IllegalArgumentException("Car can not be empty, there can not be a trip without a car!");
        }
        this.reservedCar = reservedCar;
    }

    public abstract void reserveCar(Car car) throws IllegalArgumentException ;


    public abstract void displayPassengerInformation();
}
