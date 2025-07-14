package com.project2;

public class Route {

    private String startAddress; // where the rout starts
    private String destinationAddress;
    private double tripPrice;

    public Route(String startAddress, String destinationAddress, double tripPrice) {
        setStartAddress(startAddress);
        setDestinationAddress(destinationAddress);
        setTripPrice(tripPrice);
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        if (startAddress.isBlank()){
            throw new IllegalArgumentException("Start address can not be empty, where are the passengers going to wait" +
                    "for the car to pick them up?");
        }
        this.startAddress = startAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        if (destinationAddress.isBlank()){
            throw new IllegalArgumentException("The destination address can not be empty, where are the passengers" +
                    " going?, is the trip forever going to nowhere?");
        }
        this.destinationAddress = destinationAddress;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        if (tripPrice <0){
            throw new IllegalArgumentException("The trip price can not be negative, but it can be free!" +
                    " are you willing to give a ride to the passengers for free, and give them money too?");
        }
        this.tripPrice = tripPrice;
    }
}
