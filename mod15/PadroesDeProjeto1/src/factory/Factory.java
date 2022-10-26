package factory;

public abstract class Factory {

    public Car createCar(boolean isForFarmwork) {
        Car car = retrieveCar(isForFarmwork);
        return car;
    }

    abstract Car retrieveCar(boolean isForFarmwork);
}
