public class Aufg2a
{
	public static void main(String[] args)
	{
		double einZehntel = 0.1;
		double eins = 0.0;

		System.out.println(einZehntel);

		eins += einZehntel;
		eins += einZehntel;
		eins += einZehntel;
		eins += einZehntel;
		eins += einZehntel;
		eins += einZehntel;
		eins += einZehntel;
		eins += einZehntel;
		eins += einZehntel;
		eins += einZehntel;

		System.out.println(eins == 1.0);
		
		/*
		 *  Der Ausdruck ist false, da 0,1 nicht genau als Gleitkommazahl
		 *  im Speicher repräsentiert werden kann und auf diesen
		 *  Wert beruhende Berechnungen falsch werden können.
		 */

		if (eins == 1.0)
		{
			System.out.println("Eins ist 1");
		}
		else
		{
			System.out.println("Eins ist nicht 1, sondern " + eins);
		}

		/*
		 * Gleitkommazahlen dürfen nie mit der Identität verglichen werden
		 * Stattdessen den Abstand der Zahlen daraufhin überprüfen,
		 * ob er sehr klein ist. Der sehr kleine Wert hängt von der Anwendung ab.
		 * Bei Bankanwendungen reicht 5-8 Stellen Genauigkeit hinter dem Komma.
		 * 
		 * Der Vollständigkeit halber zeigen wir die Lösung, die Sie aber nicht 
		 * verstehen müssen, das würde jetzt zu weit gehen.
		 */
		if (Math.abs(eins - 1.0) < 1E20)
		{
			System.out.println("Eins ist 1");
		}

		/*
		 * Runden ist übrigens keine befriedigende Lösung,
		 * da im Fall 1,49999 oder 1,500001 (statt 1,5)
		 * in vielen Fälle falsch gerundet wird.
		 */
	}
}
