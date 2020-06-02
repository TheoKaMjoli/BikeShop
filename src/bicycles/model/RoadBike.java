package bicycles.model;
import bicycles.BicycleBase;

public class RoadBike extends BicycleBase {
    public void accelerate(){
        changeSpeed(11);
    }
    public void brake(){
       changeSpeed(-4);
    }
}