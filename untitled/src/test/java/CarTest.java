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
        Benz.toMove();

        Assertions.assertFalse(Benz.isItParked);

        out.println("-----------------------------------------");
    }

    @Test
    void When_Door_Is_Open_and_Car_Is_Off() {

        Benz.toTurnOff();
        Benz.toOpenDoor();
        Benz.toMove();

        Assertions.assertTrue(Benz.isItParked);

        out.println("-----------------------------------------");
    }

    @Test
    void When_Door_Is_Open_and_Car_Is_On() {

        Benz.toTurnOn();
        Benz.toOpenDoor();
        Benz.toMove();

        Assertions.assertTrue(Benz.isItParked);

        out.println("-----------------------------------------");
    }

    @Test
    void When_Door_Is_Close_and_Car_Is_Off() {

        Benz.toTurnOff();
        Benz.toCloseDoor();
        Benz.toMove();

        Assertions.assertTrue(Benz.isItParked);

    }
}