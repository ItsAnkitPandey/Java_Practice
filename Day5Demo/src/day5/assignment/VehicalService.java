package day5.assignment;

public class VehicalService {
    public Car createCar(String name, String modelName, String type) {
        return new Car(name, modelName, type);
    }

    public Bike createBike(String name, String modelName, String type) {
        return new Bike(name, modelName, type);
    }

    public int compareMaxSpeed(Vehicle first, Vehicle second) {
        if (first.getType().equalsIgnoreCase("sports") && second.getType().equalsIgnoreCase("sports")) {
            return Integer.compare(first.maxSpeed(first.getType()), second.maxSpeed(second.getType()));
        }
        return -1;
    }
}
