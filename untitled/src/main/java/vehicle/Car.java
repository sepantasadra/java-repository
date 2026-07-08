package vehicle;

import static java.lang.System.out;

 public class Car {

     public boolean carIsOn;
     public boolean doorIsClose;
     public boolean carIsParked = true;
     public String model;

     public Car(String model) {
        this.model = model;
    }

     public void toTurnOn() {
        out.println( model + " is on");
        carIsOn = true;
    }

     public void toTurnOff() {
        out.println(model +" is off");
        carIsOn = false;
    }

     public void toOpenDoor() {
        out.println(model +"'s Door is open");
        doorIsClose = false;
    }

     public void toCloseDoor() {
        out.println(model +"'s Door is close");
        doorIsClose = true;
    }

     public void toDrive() {
        if (doorIsClose && carIsOn) {
            out.println(model +" is on the road!");
            carIsParked = false;

        } else if (!doorIsClose && !carIsOn) {
            out.println("Please close the " + model + "'s door and turn on the " + model);
        } else if (!doorIsClose) {
            out.println("Please close the " + model +"'s door");
        } else {
            out.println("Please turn on the " + model);
        }
    }
}
