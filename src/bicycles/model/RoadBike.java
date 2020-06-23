package bicycles.model;
import bicycles.Bicycle;
import bicycles.BicycleBase;
public class RoadBike extends BicycleBase {
    @Override
    public void accelerate() {
        changeSpeed(11);
    }
    @Override
    public void brake() {
        changeSpeed(-4);
    }
   /*@Override
    public void getBicycleType() {
    }*/



}