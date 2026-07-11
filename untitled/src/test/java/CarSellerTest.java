import Seller.CarSeller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vehicle.Car;

public class CarSellerTest {

    @Test
    void Should_Find_All_Of_The_Sold_Cars(){
        CarSeller max = new CarSeller();
        CarSeller jack = new CarSeller();

        max.toSellCar();
        max.toSellCar();
        jack.toSellCar();

        Assertions.assertEquals(3 , Car.soldCars);



    }
}
