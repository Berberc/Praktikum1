package vehicles;



public class Vehicle {

	public String brand;
	public int yearBuild;

	
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYearBuild() {
		return yearBuild;
	}
	public void setYearBuild(int yearBuild) {
		this.yearBuild = yearBuild;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + yearBuild;
		result = prime * result
				+ ((brand == null) ? 0 : brand.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (yearBuild != other.yearBuild)
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		return true;
	}


}
	
