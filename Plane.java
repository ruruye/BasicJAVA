package homework;

public class Plane {
	private String manufacturer;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;
	
	public Plane() {
		numberOfPlanes++;
	}
	
	public Plane(String manufacturer, String model, int maxNumberOfPassengers) {
		this();
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		
	}
	//alt + shift + s => get,set
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}

	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}

	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	
}
