package bicycles.model;

enum BicycleType {RoadBike, MountainBike, Tandem }
class BicycleSpecification {
private int accelerationSpeed;
private int brakeSpeed;
private BicycleType bicycleType;

public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;
        }
        public int getAccelerationSpeed(){ return accelerationSpeed;}

        public int getBrakeSpeed(){ return brakeSpeed;}
        public Enum<BicycleType> getBicycleType(){return bicycleType;} //I dont know whats Klaaping here
        /*public BicycleType getBicycleType() { return bicycleType;}*/
}
