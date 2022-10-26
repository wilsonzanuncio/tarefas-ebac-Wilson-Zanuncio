package factory;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("B", true);
        showAvailableOption(customer1);

        Customer customer2 = new Customer("B", false);
        showAvailableOption(customer2);

        Customer customer3 = new Customer("A", true);
        showAvailableOption(customer3);

        Customer customer4 = new Customer("A", false);
        showAvailableOption(customer4);
    }

    private static void showAvailableOption(Customer customer) {
        Factory factory = getFactory(customer.getGradeRequest());
        Car car = factory.createCar(customer.isForFarmwork());
        car.showDescription();
    }

    private static Factory getFactory(String gradeRequest) {
        if ("A".equals(gradeRequest)) {
            return new ClassAFactory();
        } else {
            return new ClassBFactory();
        }
    }
}
