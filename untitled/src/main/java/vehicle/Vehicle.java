package vehicle;

import static java.lang.System.out;

public abstract class Vehicle {
    public Boolean isItOn;
    public String model;
    public Boolean isItParked = true;
    public String Engine;
    public String GearBox;

    public void toTurnOn() {
        out.println(model + " is on");
        isItOn = true;
    }

    public void toTurnOff() {
        out.println(model + " is off");
        isItOn = false;
    }

    public abstract void toMove();

    public abstract String getModel();
}
