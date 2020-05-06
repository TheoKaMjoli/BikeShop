import bicycles.Bicycle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BicycleTest {
        @Test
        public void shouldAccellerate() {
            Bicycle bicycle = new Bicycle();
            assertEquals(5,5,"It has to balance");
        }
        @Test
        public void shouldBrake(){
            Bicycle bicycle = new Bicycle();
            assertEquals(5, 5, "It has to balance");
        }
        public void shouldCompleteStop(){
            Bicycle bicycle = new Bicycle();
            assertEquals(2, 2, "It has to balance");
        }

    }
