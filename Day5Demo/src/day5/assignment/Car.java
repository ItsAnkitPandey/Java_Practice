package day5.assignment;

public class Car extends AbstractManufacturer implements Vehicle {
    public Car(String name, String modelName, String carType) {
        super(name, modelName, carType);
    }

    @Override
    public int maxSpeed(String carType) {
        if (carType.equalsIgnoreCase("sports")) {
            return 250;
        } else if (carType.equalsIgnoreCase("sedan")) {
            return 190;
        }
        return 0;
    }

    @Override
    public String getManufacturerInformation() {
        return String.format("Car{Manufacturer name:'%s', Model Name:'%s', Type:'%s'}", getName(), getModelName(), getType());
    }
}
