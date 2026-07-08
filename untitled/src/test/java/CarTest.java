import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class CarTest {

    Car Benz = new Car();

    @Test
    void When_Door_Is_Close_and_Car_Is_On() {

        Benz.toTurnOn();
        Benz.toCloseDoor();
        Benz.toDrive();

        out.println("-----------------------------------------");
    }

    @Test
    void When_Door_Is_Open_and_Car_Is_Off() {

        Benz.toTurnOff();
        Benz.toOpenDoor();
        Benz.toDrive();

        out.println("-----------------------------------------");
    }

    @Test
    void When_Door_Is_Open_and_Car_Is_On() {

        Benz.toTurnOn();
        Benz.toOpenDoor();
        Benz.toDrive();

        out.println("-----------------------------------------");
    }

    @Test
    void When_Door_Is_Close_and_Car_Is_Off() {

        Benz.toTurnOff();
        Benz.toCloseDoor();
        Benz.toDrive();
    }

    class Car {

        boolean carIsOn;
        boolean doorIsClose;
        String Model;

        void toTurnOn() {
            out.println("Car is on");
            carIsOn = true;
        }

        void toTurnOff() {
            out.println("Car is off");
            carIsOn = false;
        }

        void toOpenDoor() {
            out.println("Door is open");
            doorIsClose = false;
        }

        void toCloseDoor() {
            out.println("Door is close");
            doorIsClose = true;
        }

        void toDrive() {
            if (doorIsClose && carIsOn) {
                out.println("We are on the road!");
            } else if (!doorIsClose && !carIsOn) {
                out.println("Please close the door and turn on the car");
            } else if (!doorIsClose) {
                out.println("Please close the door");
            } else {
                out.println("Please turn on the car");
            }
        }
    }
}