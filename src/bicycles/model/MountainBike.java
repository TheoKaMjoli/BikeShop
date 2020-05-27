package bicycles.model;
import bicycles.Bicycle;
import bicycles.BicycleBase;

public class MountainBike extends BicycleBase {
    private int speed = 0;
    @Override
    public void accelerate() {
        this.speed += 5;    //accelerate increase with 5
    }

    @Override
    public void brake() {
        this.speed -= 3; //braking decrease with 5
    }

    @Override
    public int currentSpeed() {
        return this.speed; //return the current speed.
    }

    @Override
    public void stop() {
        this.speed = 0; //complete stop = 0.
    }
}
