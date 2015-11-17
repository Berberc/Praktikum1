package cellphone;

public class Application {

	public static void main(String[] args) {
		

		
		 CellPhone c1 = new CellPhone("Iphone", "6s", 2015, "ie38383jijei");
		 CellPhone c2 = new CellPhone("SamsungGalaxy", "S6", 2015, "fjirtj8589999");
		 CellPhone c3 = new CellPhone("Sony", "12xy", 2016, "ifirjifj77");
		
		
		 c1.print();
		 c2.print();
		 c3.print();
		 
		 

		  System.out.println("Brand:\t"+ this.brand);
		  System.out.println("Model:\t"+ this.model);
		  System.out.println("Year:\t"+ this.year);
		  System.out.println("SerialNumber:\t"+ this.serialNumber);
		  System.out.println("\n");

		

	}

}
