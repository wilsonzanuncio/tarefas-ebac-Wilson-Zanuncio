package factory;

public class ClassAFactory extends Factory{

    @Override
    Car retrieveCar(boolean isForFarmwork) {
        if (isForFarmwork) {
            return new Hilux("SRV", "Black", true);
        } else {
            return new Civic("EXL", "Black", true);
        }
    }
}
