package vehicle;

import static java.lang.System.*;

public class Bike extends vehicle {


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
}
