import bicycles.Bicycle;
import bicycles.BikeRide;
import bicycles.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

       /* public class BicycleTest{
            /*................................Bike Ride...................................................*/

class BikeRideTest{
    @Test
public void bikeRidTest(){
            BikeRideOne bikeRideOne = new BikeRideOne();
            RoadBike roadBike = new RoadBike();
            bikeRideOne.ride(roadBike);
            assertEquals(36, roadBike.currentSpeed());
        }

        @Test
        public void bikeRidTest2(){
                BikeRideTwo bikeRideTwo = new BikeRideTwo();
                RoadBike roadBike = new RoadBike();
                bikeRideTwo.ride(roadBike);
                assertEquals(29, roadBike.currentSpeed());
        }
        @Test
        public void BikeRide3(){
            BikeRideThree bikeRide3 = new BikeRideThree();
                MountainBike mountainBike = new MountainBike();
                bikeRide3.ride(mountainBike);
                assertEquals(12, mountainBike.currentSpeed());
        }

/*................................Mountain Bicycle Test...................................................*/
@Test
public void roadBikeAccelerate(){
        Bicycle roadBike = new RoadBike();
        roadBike.accelerate();
        assertEquals(11,roadBike.currentSpeed(),"when accelerated +11.");
        }

@Test
public void roadBikeBrake(){
        Bicycle roadBike=new RoadBike();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.brake();
        roadBike.brake();
        assertEquals(14,roadBike.currentSpeed(),"current speed should decrease with 4, when brake is applied");
        }

@Test
public void roadBikeCurrentSpeed(){
        Bicycle roadBike=new RoadBike();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.brake();
        assertEquals(29,roadBike.currentSpeed(),"always output the correct current speed.");
        }
@Test
public void roadBikeCompleteStop(){
        Bicycle roadBike=new RoadBike();
        roadBike.accelerate();
        roadBike.stop();
        assertEquals(0,roadBike.currentSpeed());
        }
/************************************************************************************************************************/
/*................................Mountain Bicycle Test...................................................*/
@Test
public void mountainBikeAccelerate(){
        Bicycle mountainBike=new MountainBike();
        mountainBike.accelerate();
        assertEquals(5,mountainBike.currentSpeed(),"when accelerated +5.");
        }

@Test
public void mountainBikeBrake(){
        Bicycle mountainBike=new MountainBike();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.brake();
        assertEquals(7,mountainBike.currentSpeed(),"current speed should decrease with 3, when brake is applied");
        }

@Test
public void mountainBikeCurrentSpeed(){
        Bicycle mountainBike = new MountainBike();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.brake();
        assertEquals(12,mountainBike.currentSpeed(),"always output the correct current speed.");
        }
@Test
public void mountainBikeStop(){
        Bicycle mountainBike=new MountainBike();
        mountainBike.accelerate();
        mountainBike.stop();
        assertEquals(0,mountainBike.currentSpeed());
        }
/*****************************************************************************************************************************************/
/*................................Tandem Bicycle Test...................................................*/

@Test
public void tandemBikeTest(){
        //I have decided to test all methods in one testMethod
        Bicycle tandem = new Tandem();
        tandem.accelerate();
        tandem.brake();
        tandem.stop();
        assertEquals(0,tandem.currentSpeed());
        }

/*******************************************BikeRide Test****************************************************************************/

        @Test
        public void bikeRideOneTest(){
                BikeRideOne bikeRideOne = new BikeRideOne();
                MountainBike mountainBike = new MountainBike();
                bikeRideOne.ride(mountainBike);
                bikeRideOne.ride(mountainBike);
                assertEquals(28, mountainBike.currentSpeed());
        }
        @Test
        public void bikeRideTwoTest(){
                BikeRideOne bikeRideOne = new BikeRideOne();
                RoadBike roadBike = new RoadBike();
                bikeRideOne.ride(roadBike);
                bikeRideOne.ride(roadBike);
                assertEquals(72, roadBike.currentSpeed());
        }
        @Test
        public void bikeRideThreeTest(){
               Tandem tandem = new Tandem();
                BikeRideThree bikeRideThree = new BikeRideThree();
                bikeRideThree.ride(tandem);
                bikeRideThree.ride(tandem);
                assertEquals(58, tandem.currentSpeed());
        }
        /*************************************************Bicycle Specification******************************************/
        @Test
        public void bikeSpecTest(){
                MountainBike mountainBike = new MountainBike();
                BikeRideOne bikeRideOne = new BikeRideOne();
                BicycleSpecification bikeSpec = new BicycleSpecification(5, 3, );
               // bikeSpec.mountai();
                assertEquals(5,bikeSpec.getBrakeSpeed());
        }


}