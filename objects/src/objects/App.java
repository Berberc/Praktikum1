package objects;

public class App {

	public static void main(String[] args) {
	
		Student s1= new Student();
		s1.matrikelNummer = 5430712;
		s1.name ="Candan Berber";
		s1.faecher = new String[] { "Philosophie"};
		s1.gastHoerer = false;
		s1.alter = 28;
		System.out.println(s1.getMatrikelNummer() + " " + s1.getFaecher()[0] + " "  + s1.getName());
		System.out.println(s1.getGastHoerer() + " " + s1.getAlter());
		
		
		
		

	}

}
