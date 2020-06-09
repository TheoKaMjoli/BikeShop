package bicycles.model;
import bicycles.Bicycle;
import bicycles.BicycleClass1;
import bicycles.BikeRide;
public class BikeRideOne implements BikeRide{
    protected Bicycle bicycle;
    public void ride(Bicycle bicycle) {
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.currentSpeed();

    }

}
