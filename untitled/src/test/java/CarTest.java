import static java.lang.System.*;

public class CarTest {

    class Car {

        boolean carIsOn;
        boolean doorIsClose;
        String Model;

        void On() {
            out.println("Car is on");
            carIsOn = true;
        }

        void Off() {
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
            if (doorIsClose && carIsOn){
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
