package cellphone;

public class CellPhone {

	String brand;
	String model;
	int year;
	String serialNumber;
	
	 public CellPhone(){    //muss nicht sein, damit new CellPhone(); läuft sonst muss mann in die klammer alle variablen angeben
	super(); 
	 }
	CellPhone(String brand, String model, int year, String serialNumber){
		
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.serialNumber = serialNumber;
	}
	
	public void setBrand(String brand){
		 this.brand = brand;
	 	}
	 public String getBrand(){
		 return brand;
	 }
	 public void setModel(String model){
		 this.model = model;
	 }
	 public String getModel(){
		 return model;
	 }
	 public void setYear(int year){
		 this.year = year;
	 }
	 public int getYear(){
		 return year;
	 }
	 public void setSerialNumber(String serialNumber){
		 this.serialNumber = serialNumber;
	 }
	 public String getSerialNumber(){
		 return serialNumber;
	 }

	public void print() {
	 
	
	}
	
	

	
}

