import vehicle.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class CarTest {

    Car Benz = new Car("Benz");

    @Test
    void When_Door_Is_Close_and_Car_Is_On() {

        Benz.toTurnOn();
        Benz.toCloseDoor();
        Benz.toDrive();

        Assertions.assertFalse(Benz.carIsParked);

        out.println("-----------------------------------------");
    }

    @Test
    void When_Door_Is_Open_and_Car_Is_Off() {

        Benz.toTurnOff();
        Benz.toOpenDoor();
        Benz.toDrive();

        Assertions.assertTrue(Benz.carIsParked);

        out.println("-----------------------------------------");
    }

    @Test
    void When_Door_Is_Open_and_Car_Is_On() {

        Benz.toTurnOn();
        Benz.toOpenDoor();
        Benz.toDrive();

        Assertions.assertTrue(Benz.carIsParked);

        out.println("-----------------------------------------");
    }

    @Test
    void When_Door_Is_Close_and_Car_Is_Off() {

        Benz.toTurnOff();
        Benz.toCloseDoor();
        Benz.toDrive();

        Assertions.assertTrue(Benz.carIsParked);

    }
}