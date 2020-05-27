package bicycles.model;
import bicycles.Bicycle;
public class RoadBike implements Bicycle {

    private int speed = 0;

    @Override
    public void accelerate() {
        this.speed += 11;
    }

    @Override
    public void brake() {
        this.speed -= 4;
    }

    @Override
    public int currentSpeed() {
        return this.speed;
    }

    @Override
    public void stop() {
        this.speed = 0;
    }
}
