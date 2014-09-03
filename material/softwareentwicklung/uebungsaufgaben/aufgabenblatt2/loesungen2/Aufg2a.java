public class Aufg2a
{
	public static void main(String[] args)
	{
		/*
		 * Auswertungsreihenfolge von links nach rechts,
		 * allerdings bindet ein && (UND) stärker als ein || Oder.
		 * Im Fall (true || ....) wird nach dem ersten true die
		 * Auswertung schon beendet da alles weitere nichts mehr
		 * verändert!
		 */
		System.out.println(true && false);				// false
		System.out.println(true && true);				// true
		System.out.println(false && false);				// false
		System.out.println(true || false);				// true
		System.out.println(true || true);				// true
		System.out.println(false || false);				// false
		
		System.out.println(true && false || true);		// true
		System.out.println(true || true && false);		// true
		System.out.println((true || true) && false);	// false
		System.out.println(true ^ false);				// true
		System.out.println(true ^ true);				// false
		System.out.println(false ^ false);				// false
	}
}
