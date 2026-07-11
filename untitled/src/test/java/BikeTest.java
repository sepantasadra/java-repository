import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vehicle.Bike;
import vehicle.Vehicle;

public class BikeTest {

    Vehicle cg = new Bike("cg", "", "");

    @Test
    void whenBikeIsOn() {
        cg.toTurnOn();
        cg.toMove();
        Assertions.assertFalse(cg.isItParked);
        System.out.println("------------------------------------");
    }

    @Test
    void whenBikeIsOff() {
        cg.toTurnOff();
        cg.toMove();
        Assertions.assertTrue(cg.isItParked);
    }
}
