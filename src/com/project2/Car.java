package com.project2;

public class Car {
    private String code;
    private final Route fixedRout;
    private int maxCapacity; //number of passengers

    public Car(Route fixedRout, String code, int maxCapacity) {
        this.fixedRout = fixedRout;
        this.code = code;
        this.maxCapacity = maxCapacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFixedRout() {
        return fixedRout;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
