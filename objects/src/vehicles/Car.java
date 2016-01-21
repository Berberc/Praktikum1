package vehicles;

public class Car extends Vehicle{

	
	public boolean navigation;
	public int seats;
	
	public Car(int yearBuild, String brand) {
		super(); // Aufruf des Superkonstruktors
		this.yearBuild = yearBuild;
		this.brand = brand;
	}
		
	public boolean isNavigation() {
		return navigation;
	}
	public void setNavigation(boolean navigation) {
		this.navigation = navigation;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
}
