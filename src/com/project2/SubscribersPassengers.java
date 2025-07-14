package com.project2;

public class SubscribersPassengers extends Passenger {
    private final double discount = 50 / 100f;

    public SubscribersPassengers(String name, String iD) {
        super(name, iD);
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public void reserveCar(Car car) throws IllegalArgumentException {
        if (car.getMaxCapacity() <=0){
            throw new IllegalArgumentException("Car max capacity of passengers can not be zero or less, " +
                    "where are the passengers going to sit?");
        }

        super.setReservedCar(car);

        super.setTripCost(car.getFixedRout().getTripPrice() - (car.getFixedRout().getTripPrice() * discount));

    }

    @Override
    public void displayPassengerInformation() {
        System.out.println("Subscribed Passenger: "+super.getName()+" with ID: "+super.getID()+"," +
                " has reserved a car with code: "+super.getReservedCar().getCode()+" " +
                "with a max capacity of "+super.getReservedCar().getMaxCapacity()+" passengers");


        System.out.println("He has a subscriber discount of 50%");

        System.out.println("With a total trip price of "+super.getTripCost());

        System.out.println("The trip will start from: "+super.getReservedCar().getFixedRout().getStartAddress());
        System.out.println("And will end at: "+super.getReservedCar().getFixedRout().getDestinationAddress());
        System.out.println("The original trip price: "+super.getReservedCar().getFixedRout().getTripPrice());
        System.out.println();
    }
}
