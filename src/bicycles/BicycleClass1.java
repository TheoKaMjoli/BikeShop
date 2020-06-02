package bicycles;
public class BicycleClass1 {
    private int speed = 0;
    public void accelerate() {
        this.speed += 5;
    }
    public void brake(){
        this.speed -= 3;
    }
    public int currentSpeed(){
        return this.speed;
    }
    public int stop(){
        return speed = 0;
    }
}