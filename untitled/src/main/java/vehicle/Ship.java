package vehicle;

public class Ship extends Vehicle {

    public Ship(String model){
        this.model = model;
    }

    @Override
    public void toMove() {

    }

    @Override
    public String getModel() {
        return model;
    }
}
