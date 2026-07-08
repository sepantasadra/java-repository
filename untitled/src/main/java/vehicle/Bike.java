package vehicle;

import static java.lang.System.*;

public class Bike {

    public Boolean bikeIsOn;
    public String Model;
    public Boolean bikeIsParked = true;

    public Bike(String Model) {
        this.Model = Model;
    }

    public void toTurnOn() {
        out.println(Model + " is on");
        bikeIsOn = true;
    }

    public void toTurnOff() {
        out.println(Model + " is off");
        bikeIsOn = false;
    }

    public void toRide() {
        if (bikeIsOn) {
            out.println(Model + " is on the road!");
            bikeIsParked = false;

        } else {
            out.println("Please turn on the " + Model);
        }
    }
}
