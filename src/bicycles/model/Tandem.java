package bicycles.model;
import bicycles.Bicycle;
import bicycles.BicycleBase;

public class Tandem extends BicycleBase {
    @Override
    public void accelerate() {
        changeSpeed(12);
    }

    @Override
    public void brake() {
        changeSpeed(-7);
    }

   /*@Override
    public void getBicycleType() {

    }*/
}
