package bicycles;
import bicycles.Bicycle;

public abstract class BicycleBase implements Bicycle {
    private int speed = 0;
    //protected changeSpeed method variable that takes an int and
    protected void changeSpeed(int speeder){
        this.speed += speeder;
    }
    //implementing the currentSpeed Method
    public int currentSpeed(){
        return this.speed;
    }
    public void stop(){
        this.speed = 0;
    }
}
