public class Aufg5a
{
	public static void main(String[] args)
	{
		double d = 0.1e-23;
		
		double result = d * d * d * d * d * d * d * d * d * d * d * d * d;
		System.out.println(result);
		
		result = result * d;
		
		System.out.println(result); // 14 mal
		
		/*
		 * Das Ergebnis ist mathematisch falsch aber hier ist das Ende 
		 * der Speicherkapazität erreicht. Es ist doch erstaunlich, das 
		 * ein Rechner eben noch keinen Mathematiker ersetzen kann, das sieht
		 * man schon in diesem kleinen Beispiel.
		 */
	}
}
