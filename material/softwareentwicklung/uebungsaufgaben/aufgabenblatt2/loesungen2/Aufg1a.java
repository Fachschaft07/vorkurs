public class Aufg1a
{
	public static void main(String args[])
	{
		int a = 1234;
		byte c = 20;
		/*
		 * In der nächsten Zeile wird eine Typumwandlung von int nach byte durchgeführt.
		 * Diese muss explizit erzwungen werden, da es hier zu Informationsverlust kommen
		 * kann, da eigentlich kein Platz für ein int ist. Das int wird einfach ab einer
		 * bestimmten Stelle abgeschnitten, der Rest fällt einfach weg. Das kann mal gut gehen
		 * (bei kleinen Zahlen) und mal schief gehen (wie hier)! Die 1234 passt nicht in ein
		 * byte und somit geht uns hier Information verloren, wie erhalten unerwartete Ergebnisse!
		 */
		byte b = (byte)a;
		
		/*
		 * Ein int kann in jedem Fall ein byte aufnehmen. Wir haben in keinem Fall einen 
		 * Informationsverlust und somit muss keine explizite Typumwandlung durchgeführt
		 * werden. Es wäre aber auch kein Fehler!
		 */
		a = c;
	}
}
