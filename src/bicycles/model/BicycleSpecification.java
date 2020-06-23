package bicycles.model;

import bicycles.Bicycle;

public class BicycleSpecification {
private int accelerationSpeed;
private int brakeSpeed;
private BicycleType bicycleType;
public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;
        }
        public BicycleType getBicycleType() {
                return bicycleType;
        }
        public int getAccelerationSpeed(){
                return accelerationSpeed;
        }
        public int getBrakeSpeed(){
                return brakeSpeed;
        }
}
