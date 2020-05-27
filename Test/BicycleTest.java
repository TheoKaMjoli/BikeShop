import bicycles.Bicycle;
import bicycles.model.MountainBike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

        public class BicycleTest{
            /*................................Mountain Bicycle Test...................................................*/
            @Test
            public void shouldBeAbleToAccelerate(){
                Bicycle mountainBike = new MountainBike();
                 mountainBike.accelerate();
                assertEquals( 5, mountainBike.currentSpeed(), "when accelerated +5.");
            }

            @Test
            public void shouldBeAbleToBrake(){
                Bicycle mountainBike = new MountainBike();
                mountainBike.accelerate();
                mountainBike.accelerate();
                mountainBike.brake();
                mountainBike.brake();
                 assertEquals(4,mountainBike.currentSpeed(), "current speed should decrease with 3, when brake is applied");
            }

            @Test
            public void shouldBeAbleToCheckCurrentSpeed(){
               Bicycle mountainBike = new MountainBike();
               mountainBike.accelerate();
                mountainBike.accelerate();
                mountainBike.accelerate();
                mountainBike.brake();
                assertEquals(12,mountainBike.currentSpeed(), "always output the correct current speed.");
            }
            @Test
            public void shouldBeAbleToMakeACompleteStop(){
              Bicycle mountainBike = new MountainBike();
                mountainBike.accelerate();
                mountainBike.stop();
                assertEquals(0,mountainBike.currentSpeed());
            }
/************************************************************************************************************************/
            /*................................Road Bicycle Test...................................................*/
            @Test
            public void shouldBeAbleToAccelerate(){
                Bicycle mountainBike = new MountainBike();
                mountainBike.accelerate();
                assertEquals( 5, mountainBike.currentSpeed(), "when accelerated +5.");
            }
            
                        @Test
                        public void shouldBeAbleToBrake(){
                            Bicycle mountainBike = new MountainBike();
                            mountainBike.accelerate();
                            mountainBike.accelerate();
                            mountainBike.brake();
                            mountainBike.brake();
                            assertEquals(4,mountainBike.currentSpeed(), "current speed should decrease with 3, when brake is applied");
                        }
            
                        @Test
                        public void shouldBeAbleToCheckCurrentSpeed(){
                            Bicycle mountainBike = new MountainBike();
                            mountainBike.accelerate();
                            mountainBike.accelerate();
                            mountainBike.accelerate();
                            mountainBike.brake();
                            assertEquals(12,mountainBike.currentSpeed(), "always output the correct current speed.");
                        }
                        @Test
                        public void shouldBeAbleToMakeACompleteStop(){
                            Bicycle mountainBike = new MountainBike();
                            mountainBike.accelerate();
                            mountainBike.stop();
                            assertEquals(0,mountainBike.currentSpeed());
                        }
                    
                   
        }
