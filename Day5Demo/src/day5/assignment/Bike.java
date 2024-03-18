package day5.assignment;

	public class Bike extends AbstractManufacturer implements Vehicle {
	    public Bike(String name, String modelName, String bikeType) {
	        super(name, modelName, bikeType);
	    }

	    @Override
	    public int maxSpeed(String bikeType) {
	        if (bikeType.equalsIgnoreCase("sports")) {
	            return 300;
	        } else if (bikeType.equalsIgnoreCase("cruiser")) {
	            return 170;
	        }
	        return 0;
	    }

	    @Override
	    public String getManufacturerInformation() {
	        return String.format("Bike{Manufacturer name:'%s', Model Name:'%s', Type:'%s'}", getName(), getModelName(), getType());
	    }
	}
