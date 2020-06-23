package bicycles.model;
import bicycles.Bicycle;
import bicycles.BicycleBase;

public class BicycleFromSpec extends BicycleBase implements Bicycle {
    private BicycleSpecification bicycleSpecification;
    BicycleFromSpec(BicycleSpecification bicycleSpecification) {
        this.bicycleSpecification = bicycleSpecification;
    }

    @Override
    public void accelerate() {
        changeSpeed(bicycleSpecification.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        changeSpeed(bicycleSpecification.getBrakeSpeed());
    }
    public BicycleType getBicycleType() {
        return getBicycleType();
    }
}
