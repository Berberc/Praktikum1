package vehicles;

	/**
	 * Eine Klasse zur Verwaltung von Listen.
	 * Sie nutzt intern ein Array, auf dem die Objekte gespeichert werden,
	 * sowie die Variable "nextInsertPosition", um die L�nge des gef�llten
	 * Bereichs der Liste zu verwalten.
	 * 
	 * Die Variablen sind durch den Sichtbarkeits-Modifizierer "private"
	 * vor dem Zugriff aus anderen Klassen gesch�tzt, so dass verhindert werden kann,
	 * dass die Klasse "falsch" benutzt wird. Nicht verhindert werden kann
	 * allerdings, dass "unsinnige" Werte benutzt werden (z.B. die Initialisierung
	 * mit negativen Zahlen o.�.)
	 * 
	 * Drei Konstruktoren erm�glichen es zudem, je nach Anwendungsfall auf 
	 * unterschiedliche Art und Weise neue Instanzen der Klasse anzulegen.
	 * 
	 *
	 */
	public class ObjectArrayL {
		
		private Object[] array;
		private int nextInsertPosition = 0;
		private int inc;
		
		/**
		 * Konstruktor: Erwartet wird die initiale Gr��e der Liste
		 * sowie die Anzahl von Elementen, um die das Array erweitert
		 * werden soll, wenn umkopiert werden muss.
		 * @param initialSize
		 * @param increment
		 */
		public ObjectArrayL(int initialSize, int increment) {
			array = new Object[initialSize];
			inc = increment;
		}
		
		/**
		 * Konstruktor: Erwartet wird die initiale Gr��e der Liste.
		 * @param initialSize
		 */
		public ObjectArrayL(int initialSize ) {
			array = new Object[initialSize];
			inc = 10;
		}
		
		/**
		 * Default-Konstruktor: Liste und Increment werden mit
		 * Standard-Werten initialisiert.
		 */
		public ObjectArrayL() {
			array = new Object[32];
			inc =10;
		}
		
		/**
		 * Vergr��ert die Liste durch umkopieren auf ein neues Array
		 */
		private void resize() {
			Object[] neuesArray = new Object[array.length+inc];
			for(int i = 0; i < array.length; i++) {
				neuesArray[i] = array[i];
			}
			array = neuesArray;
		}
		
		
		/**
		 * F�gt ein Element am Ende der Liste ein.
		 */
		public void add(Object obj) {
			if(nextInsertPosition == array.length) {
				resize();
			}
			array[nextInsertPosition] = obj;
			nextInsertPosition++;
		}
		
		/**
		 * Gibt die Gr��e der Liste zur�ck
		 * @return
		 */
		public int size() {
			return nextInsertPosition;
		}
		
		/**
		 * Gibt das Element an position "position" zur�ck.
		 * @param position
		 * @return
		 */
		public Object get(int position) {
			return array[position];
		}
		

	
}
