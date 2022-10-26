package factory;

public abstract class Car {
    private String model;
    private String color;
    private boolean automaticTransmission;

    public Car(String model, String color, boolean automaticTransmission) {
        this.model = model;
        this.color = color;
        this.automaticTransmission = automaticTransmission;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }

    public void showDescription() {
        String transmission = isAutomaticTransmission() ? "automatic" : "manual";

        System.out.println("The option available is: " + getColor() + " " + getClass().getSimpleName()
                + " " + getModel() + " with " + transmission + " transmission.");
    }
}
