package bicycles;

import bicycles.model.BikeRideOne;
import bicycles.model.MountainBike;
public class LetUsRide {
    public static void main(String[] args){

        BikeRideOne bikeRideOne = new BikeRideOne();
        MountainBike mountainBike = new MountainBike();
        bikeRideOne.ride(mountainBike);
    }

}
