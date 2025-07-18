package com.project2;

public class NonSubscribersPassengers extends Passenger {
    private boolean discountCoupon; // (10/100)

    public NonSubscribersPassengers(String name, String iD, boolean discountCoupon) {
        super(name, iD);
        setDiscountCoupon(discountCoupon);
    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon; // how to check for a boolean that is not set?, by using the Boolean class
        // due to it being a checked exception, it is better not to change it to Boolean. It will not compile anyway.
    }

    @Override
    public void reserveCar(Car car) throws IllegalArgumentException {
        if (car.getMaxCapacity() <=0){
            throw new IllegalArgumentException("Car max capacity of passengers can not be zero or less, " +
                    "where are the passengers going to sit?");
        }

        super.setReservedCar(car);

        if (discountCoupon) {
            super.setTripCost(car.getFixedRout().getTripPrice() - (car.getFixedRout().getTripPrice() * 10 / 100));
        } else {
            super.setTripCost(car.getFixedRout().getTripPrice());
        }

    }

    @Override
    public void displayPassengerInformation() {
        System.out.println("Non-Subscribed Passenger: "+super.getName()+" with ID: "+super.getID()+"," +
                " has reserved a car with code: "+super.getReservedCar().getCode()+" " +
                "with a max capacity of "+super.getReservedCar().getMaxCapacity()+" passengers");

        if (discountCoupon){
            System.out.println("He has a discount coupon of 10%");
        } else {
            System.out.println("He has no discount coupon");
        }
        System.out.println("With a total trip price of "+super.getTripCost());

        System.out.println("The trip will start from: "+super.getReservedCar().getFixedRout().getStartAddress());
        System.out.println("And will end at: "+super.getReservedCar().getFixedRout().getDestinationAddress());
        System.out.println("The original trip price: "+super.getReservedCar().getFixedRout().getTripPrice());
        System.out.println();
    }
}
