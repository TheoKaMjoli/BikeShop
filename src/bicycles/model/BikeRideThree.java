package bicycles.model;

import bicycles.Bicycle;
import bicycles.BikeRide;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideThree implements BikeRide {
    protected Bicycle bicycle;
    public void ride(Bicycle bicycle) {
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
    }
}
