public class Aufg5d
{
	public static void main(String[] args)
	{
		int initial = 3798;
 		
 		/*
 		 * Berechne Tage (div) und ziehe dann die Tage vom Anfangswert ab (rdiv).
 		 * Verfahre mit Stunden und Minuten genauso.
 		 */
 		int divider = 60 * 60 * 24;		// Variable zur Vermeidung von doppelten Operationen
 		int days = initial / divider;		
 		initial = initial % divider;
 		
 		divider = divider / 24;			// Kurzschreibweise für divider = divider / 24;
 		int h = initial / divider;
 		initial = initial % divider;
 		
 		divider = divider / 60;
 		int min = initial / 60;
 		int sec = initial % 60; 
 		
 		System.out.println(days + " Tage, "+h+" Stunden, " +min+" Minuten und " + sec + " Sekunden");
	}

}
