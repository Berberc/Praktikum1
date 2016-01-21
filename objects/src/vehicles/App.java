package vehicles;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Vehicle-Infos...");

		Vehicle vehicle = new Vehicle();
		vehicle.setYearBuild(1950);
		vehicle.setBrand("Audi");

		System.out.println("Brand: " + vehicle.getBrand());
		System.out.println("YearBuild: " + vehicle.getYearBuild());

		System.out.println();
		System.out.println("Bicycle-Infos...");

		Bicycle bicycle = new Bicycle();
		bicycle.setYearBuild(2015);
		bicycle.setBrand("Votec");
		bicycle.setWeight(13);
		bicycle.setShiftingSystem("derailleur gear");

		System.out.println("Brand: " + bicycle.getBrand());
		System.out.println("Year Build: " + bicycle.getYearBuild());
		System.out.println("Weight: " + bicycle.getWeight());
		System.out.println("Shifting System: " + bicycle.getShiftingSystem());
		System.out.println();
		Car car = new Car(2015, "Audi A8");
		car.setNavigation(true);
		car.setSeats(5);

		System.out.println(car.getYearBuild() + " , " + car.getBrand());
		System.out.println("Navigation: " + car.isNavigation());
		System.out.println("Seats: " + car.getSeats());
	
		/*
		 * Hier erzeugen wir eine Liste, die beliebige Objekte speichern kann.
		 */
		ObjectArrayL list = new ObjectArrayL();
		list.add(bicycle);
		list.add(new Car(2015, "Audi A8"));
		list.add(new Train(2000, "ICE 4747"));
		list.add("I want an Audi!!");

		// Die gespeicherten Objekte in ObjectArrayList sind vom Typ Object...
		Object object = list.get(0);
		// Wenn man auf den Datentyp Auto zugreifen möchte muss man mittels
		// 'Typecasting' das Objekt in den
		// ursprünglichen Datentypen zurückwandeln, wobei auf die Reihenfolge
		// der Objekte geachtet werden muss...
		Bicycle bicycle2 = (Bicycle) object;
		// ... bei falscher Klassenuwandlung wird folgender Laufzeitfehler
		// geschmissen -> ClassCastException
		// Zur Veranschaulichung folgendes Beispiel:
		// Object x = new Integer(0);
		// String y = (String) x; // ClassCastException: java.lang.Integer
		// cannot be cast to java.lang.String

		/*
		 * Mit Hilfe von 'instanceof' kann die Klassenzugehörigkeit zur Laufzeit
		 * des Programms überprüft werden.
		 */
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if (obj instanceof Bicycle) { // Prüft ob 'obj' eine Instanz von Typ 'Auto' ist
				// ...ist die Bedingung erfüllt, kann in den ensprechenden Datentyp gecastet werden
				// eine ClassCastException ist innerhalb dieses Blocks ausgeschlossen
				System.out.println(((Bicycle) obj).getBrand());
				System.out.println(((Bicycle) obj).getYearBuild());
				System.out.println(((Bicycle) obj).getWeight());
				System.out.println(((Bicycle) obj).getShiftingSystem());
			}
			if (obj instanceof Car) {
				System.out.println(((Car) obj).getBrand());
				System.out.println(((Car) obj).getYearBuild());
				System.out.println(((Car) obj).isNavigation());
			}
			System.out.println();
		}

	}




	}


