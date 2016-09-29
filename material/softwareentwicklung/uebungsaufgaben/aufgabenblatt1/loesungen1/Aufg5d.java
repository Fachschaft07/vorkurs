public class Aufg5d{
	public static void main(String[] args){
		int initial = 3798;
 		int secsPerMin = 60; //Anzahl der Sekunden pro Minute
		int minsPerHour = secsPerMin; //Anzahl der Minuten pro Stunde
		int hoursPerDay = 24; // Anzahl der Stunden pro Tag
 		/*
 		 * Berechne Tage (days) und ziehe dann die Tage vom Anfangswert ab.
 		 * Verfahre mit Stunden und Minuten genauso.
 		 */
 		int divider = secsPerMin * minsPerHour * hoursPerDay;		// Variable zur Vermeidung von doppelten Operationen
 		int days = initial / divider;		
 		initial = initial - (days * divider);
 		
 		divider = divider / hoursPerDay;	
 		int h = initial / divider;
 		initial = initial - (h*divider);
 		
 		int min = initial / minsPerHour;
 		int sec = initial - (secsPerMin*min); 
 		
 		System.out.println(days + " Tage, "+h+" Stunden, " +min+" Minuten und " + sec + " Sekunden");
	}

}
