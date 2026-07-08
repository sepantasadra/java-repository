import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vehicle.Bike;

public class BikeTest {

    Bike cg = new Bike("cg");

    @Test
    void whenBikeIsOn() {
        cg.toTurnOn();
        cg.toRide();
        Assertions.assertFalse(cg.bikeIsParked);
        System.out.println("------------------------------------");
    }

    @Test
    void  whenBikeIsOff() {
        cg.toTurnOff();
        cg.toRide();
        Assertions.assertTrue(cg.bikeIsParked);
    }
}
