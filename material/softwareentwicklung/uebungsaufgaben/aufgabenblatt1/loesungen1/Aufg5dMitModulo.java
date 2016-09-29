class Aufg5dMitModulo{
	public static void main(String[] args){
		int initial = 3798;
 		int secsPerMin = 60; //Anzahl der Sekunden pro Minute
		int minsPerHour = secsPerMin; //Anzahl der Minuten pro Stunde
		int hoursPerDay = 24; // Anzahl der Stunden pro Tag
 		
 		/*
 		 * Verkürzung der Berechnung aus Aufg5d mithilfe des Modulo-Operators.
 		 */
 		int divider = secsPerMin * minsPerHour * hoursPerDay;		// Variable zur Vermeidung von doppelten Operationen
 		int days = initial / divider;		
 		initial = initial % divider;
 		
 		divider = divider / hoursPerDay;
 		int h = initial / divider;
 		initial = initial % divider;
 		
 		int min = initial / secsPerMin;
 		int sec = initial % secsPerMin; 
 		
 		System.out.println(days + " Tage, "+h+" Stunden, " +min+" Minuten und " + sec + " Sekunden");
	}

}
