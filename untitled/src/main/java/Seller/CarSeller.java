package Seller;

import vehicle.Car;

public class CarSeller {

    public static String [] nameOfSellers = new String[10];

        static {
            nameOfSellers[0] = "max";
            nameOfSellers[1]= "jack";
        }

    public void toSellCar() {

        Car.soldCars++;

    }
}
