package vehicle;

import Options.Engine;
import Options.GearBox;

import static java.lang.System.out;

public class Car extends Vehicle implements GearBox, Engine {


    public boolean doorIsClosed;


    public Car(String model, String Engine, String GearBox) {
        this.model = model;
        this.Engine = Engine;
        this.GearBox = GearBox;
    }


    public void toOpenDoor() {
        out.println(model + "'s Door is open");
        doorIsClosed = false;
    }

    public void toCloseDoor() {
        out.println(model + "'s Door is close");
        doorIsClosed = true;
    }

    public void toMove() {
        if (doorIsClosed && isItOn) {
            out.println(model + " is on the road!");
            isItParked = false;

        } else if (!doorIsClosed && !isItOn) {
            out.println("Please close the " + model + "'s door and turn on the " + model);
        } else if (!doorIsClosed) {
            out.println("Please close the " + model + "'s door");
        } else {
            out.println("Please turn on the " + model);
        }
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String gearBoxType() {
        return "5g";
    }

    @Override
    public String engineType() {
        return "v6";
    }
}
