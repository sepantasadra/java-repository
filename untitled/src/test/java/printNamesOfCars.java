import Services.PrintNamesOfCars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vehicle.Car;
import vehicle.Ship;
import vehicle.Vehicle;
import vehicle.Bike;

public class printNamesOfCars {

    @Test
    void should_print_names_of_cars() {
        Vehicle Benz = new Car("Benz", "v6", "5");
        Vehicle Volvo = new Car("Volvo", "v4", "Automatic");
        Vehicle Kawasaki = new Bike("Kawasaki", "i3", "Automatic");
        Vehicle Titanic = new Ship("Titanic");
        Vehicle[] vehicles = {Benz, Volvo, Kawasaki, Titanic};
        PrintNamesOfCars printNamesOfCars = new PrintNamesOfCars(vehicles);

        String listOfNamesOfVehicles = printNamesOfCars.execute();

        System.out.println(listOfNamesOfVehicles);

        Assertions.assertEquals("Benz-Volvo-Kawasaki-Titanic", listOfNamesOfVehicles);
    }
}
