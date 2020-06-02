import bicycles.Bicycle;
import bicycles.BicycleClass1;
import bicycles.BikeRide;
import bicycles.model.BikeRideOne;
import bicycles.model.MountainBike;
import bicycles.model.RoadBike;
import bicycles.model.Tandem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

       /* public class BicycleTest{
            /*................................Bike Ride...................................................*/

class BikeRideTest{
    @Test
public void bikeRidTest(){
            MountainBike mountainBike = new MountainBike();
            BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
            bikeRideOne.ride();
            assertEquals(14, mountainBike.currentSpeed());
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
        assertEquals(4,mountainBike.currentSpeed(),"current speed should decrease with 3, when brake is applied");
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
        Bicycle tandem=new Tandem();
        tandem.accelerate();
        tandem.brake();
        tandem.stop();
        assertEquals(0,tandem.currentSpeed());
        }
        }

