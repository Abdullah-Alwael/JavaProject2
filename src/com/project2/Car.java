package com.project2;

public class Car {
    private String code;
    private final Route fixedRout;
    private int maxCapacity; //number of passengers

    public Car(Route fixedRout, String code, int maxCapacity) {
        if (fixedRout == null) {
            throw new IllegalArgumentException("The route can not be empty, where are the passengers going to go?");
        } else {
            this.fixedRout = fixedRout;
        }
        setCode(code);
        setMaxCapacity(maxCapacity);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code.isBlank()) {
            throw new IllegalArgumentException("Code can not be empty");
        }
        this.code = code;
    }

    public Route getFixedRout() {
        return fixedRout;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        if (maxCapacity <= 0) {
            throw new IllegalArgumentException("Car max capacity of passengers can not be zero or less, " +
                    "where are the passengers going to sit?");
        }
        this.maxCapacity = maxCapacity;
    }
}
