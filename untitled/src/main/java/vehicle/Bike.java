package vehicle;

import Options.Engine;
import Options.GearBox;

import static java.lang.System.*;

public class Bike extends vehicle implements GearBox, Engine {


    public Bike(String model) {
        this.model = model;
    }


    public void toMove() {
        if (isItOn) {
            out.println(model + " is on the road!");
            isItParked = false;

        } else {
            out.println("Please turn on the " + model);
        }
    }

    @Override
    public String engineType() {
        return "i3";
    }

    @Override
    public String gearBoxType() {
        return "auto";
    }
}
