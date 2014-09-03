public class Aufg1b
{
	public static void main(String agrs[])
	{
		/* 
		 * Daten werden im Rechner immer im Binärsystem gespeichert.
		 * Uns stehen also nur die 0 und die 1 zur Speicherung von Daten zur Verfügung.
		 * Zahlen und andere Datentypen werden deshalb codiert.
		 * 
		 * Die Zahl 5 wird im Binärsystem mit 101 dargestellt.
		 * Die Zahl 10 mit 1010 und so weiter. Wir sehen hier schon, dass wir für die Zahl 5, 3 
		 * "Plätze" und für die Zahl 10 schon 4 brauchen.
		 */
		
		// Beispiel byte: Ein byte geht von -128 bis 127 da es nur 8 "Plätze" zur Verfügung hat
		byte x = 5;
		System.out.println(x); 		 // 5
		x = (byte)(x + 5);
		System.out.println(x);		 // 10
		x = (byte)(x + 125);
		System.out.println((x)); 	 // -121
	}
}
