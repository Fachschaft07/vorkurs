public class Aufg5c
{
	public static void main(String[] args)
	{
		System.out.println(3/2);		
		/*
		 * Erwartete Ausgabe: 1.5 
		 * Tatsächliche Ausgabe: 1 (Fehler!)
		 * Grund: Automatischer Typ bei beiden Zahlen int,
		 * also auch beim Ergebnis int, Nachkommastellen
		 * werden nicht beachtet.
		 */
	}
}
