package com.project2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            Route r1 = new Route("Princes norah university gate 9", "SAB bank", 25.9);
            Route r2 = new Route("SAB bank", "KAFD king abdullah financial district"
                    , 36.8);

            Car DodgeChallenger = new Car(r1, "1000", 0); // MaxCapacity = 0 as requested
//            Car DodgeChallenger = new Car(r1, "1000", 4);

            Car NisanS2000 = new Car(r2, "1001", 7);

            List<Passenger> passengers = new ArrayList<>();
            passengers.add(new SubscribersPassengers("Abdullah", "9001"));
            passengers.add(new NonSubscribersPassengers("Ahmed", "8001", true));

            passengers.getFirst().reserveCar(NisanS2000);
            passengers.get(1).reserveCar(DodgeChallenger); // will throw an exception due to capacity <= 0

            passengers.getFirst().displayPassengerInformation();
            passengers.get(1).displayPassengerInformation();

        } catch (IllegalArgumentException e) {
            System.out.println("Argument error");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred");
            System.out.println(e.getMessage());
        }

    }
}
