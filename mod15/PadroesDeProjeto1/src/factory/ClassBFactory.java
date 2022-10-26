package factory;

public class ClassBFactory extends Factory{
    @Override
    Car retrieveCar(boolean isForFarmwork) {
        if (isForFarmwork) {
            return new Pampa("GL", "Grey", false);
        } else {
            return new Uno("Way", "White", false);
        }
    }
}
