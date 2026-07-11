package Services;

import vehicle.Vehicle;

public class PrintNamesOfCars {

    Vehicle[] vehicles;

    public PrintNamesOfCars(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public String execute() {

        String nameOfVehicles = "";

        for (int i = 0; i < vehicles.length; i++) {


            Vehicle vehicle = vehicles[i];
            nameOfVehicles += vehicle.getModel();
            if (i < vehicles.length - 1) {
                nameOfVehicles += "-";
            }

        }
        return nameOfVehicles;
    }
}
