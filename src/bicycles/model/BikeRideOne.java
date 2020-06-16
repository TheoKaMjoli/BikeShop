package bicycles.model;
import bicycles.Bicycle;
import bicycles.BikeRide;
public class BikeRideOne implements BikeRide{
    protected Bicycle bicycle;
    //BikeRide bikeRide = new BikeRideOne();
    //MountainBike mountainBike = new MountainBike();
    public void ride(Bicycle bicycle) {
        //bikeRide.ride(mountainBike);
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        bicycle.accelerate();
    }

}
