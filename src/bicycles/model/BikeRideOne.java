package bicycles.model;
import bicycles.Bicycle;
import bicycles.BicycleClass1;
import bicycles.BikeRide;
public abstract class BikeRideOne implements BikeRide{
    protected Bicycle bicycle;
    public BikeRideOne(Bicycle bicycle){
                this.bicycle = bicycle;
            }
    public void ride() {
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        bicycle.accelerate();
    }
}
