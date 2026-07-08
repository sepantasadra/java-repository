package vehicle;

import static java.lang.System.out;

public class vehicle {
    public Boolean isItOn;
    public String model;
    public Boolean isItParked = true;

    public void toTurnOn() {
        out.println( model + " is on");
        isItOn = true;
    }

    public void toTurnOff() {
        out.println(model + " is off");
        isItOn = false;
    }
}
