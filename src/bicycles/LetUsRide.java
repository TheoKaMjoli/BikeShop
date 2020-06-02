package bicycles;

import bicycles.model.BikeRideOne;
import bicycles.model.MountainBike;

public class LetUsRide {


    public static void main(String[] args){
        BicycleClass1 bicycleClass1 = new BicycleClass1();
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
        bikeRideOne.ride();
        System.out.println(mountainBike.currentSpeed());
    }

}
