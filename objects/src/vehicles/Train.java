package vehicles;

public class Train extends Vehicle{

	
	public boolean socket;
	public boolean bistro;
	
	
	
	public Train(int yearBuild, String brand) {
		super(); // Aufruf des Superkonstruktors
		this.yearBuild = yearBuild;
		this.brand = brand;
		
	}
	public boolean isSocket() {
		return socket;
	}
	public void setSocket(boolean socket) {
		this.socket = socket;
	}
	public boolean isBistro() {
		return bistro;
	}
	public void setBistro(boolean bistro) {
		this.bistro = bistro;
	}
	
}
