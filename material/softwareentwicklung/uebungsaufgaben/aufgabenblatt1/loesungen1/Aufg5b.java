public class Aufg5b
{
	public static void main(String[] args)
	{
		double number = 9e100;
		double result = number * number * number;
		System.out.println(number);
		result = result * number;
		System.out.println(result); // 4 mal	
		/*
		 * Das Ergebnis ist natürlich mathematisch falsch, da es sich nur um eine
		 * sehr sehr sehr große Zahl handelt nicht aber um Unendlich!
		 */
		
		
		/*
		 * Wie Sie wahrscheinlich herausgefunden haben ist es nicht möglich
		 * infinity über int zu erreichen. Das liegt daran, dass int nicht wie
		 * double aufgebaut ist. int geht immer im Kreis und sobald der Maximalwert
		 * erreicht wurd geht es wieder vom Minimalenwert los. Heißt Maximalwert+1 = Minimalwert
		 * Es kommt zu keinem Fehler! Dies kann natürlich zu unangehmen Effekten in Programmen führen!
		 * long, short sind wie int aufgebaut.
		 */
		int intNumber = 90000000;
		System.out.println(intNumber);
		int intResult = intNumber * intNumber * intNumber;
		System.out.println(intResult); // Wir springen ins negative
		intResult = intNumber * intNumber ;
		System.out.println(intResult); // Wir springen wieder ins positive
		/*
		 * Mathematisch ist das Ergebnis natürlich, sobald wir einmal über die Maximalgrenze
		 * springen, falsch!
		 */
	}
}
