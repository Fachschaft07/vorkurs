class Aufg1e{
	public static void main(String[] args){
		/*
		 * Die Auswertungsreihenfole ist von links nach rechts
		 */
		System.out.println(4+2+" Wert");				// 6 Wert  - String
		System.out.println("" + 4 + 2 + " Wert");		// 42 Wert - String
		System.out.println("" + (4 + 2) + " Wert");		// 6 Wert  - String
		
		System.out.println((byte)(127 + 1));			// -128    - byte //Maximale Speichergrenze überschritten
		System.out.println((127 + 1));					// 128     - int
		System.out.println(((byte)127 + (byte)1));		// 128     - int
		System.out.println('a' + 1);                    // 98      - int
		System.out.println('a' + (char)1);              // 98      - int
		System.out.println((char)('a' + 1));			// b       - char
		
		System.out.println(3/2);						// 1	   - int
		
		/*
		 * Achtung: wir wandeln erst die ganze Zahl 3 in 3.0 um und rechnen
		 * dann 3.0 / 2 was 1.5 liefert. Dabei hat double eine höhere Priorität
		 * und deshalb wird 2 in double implizit umgewandelt
		 */
		System.out.println((double)3/2);				// 1.5     - double
		
		/*
		 *  Achtung: wir rechnen erst mit ganzen Zahlen (int) 3/2 = 1 
		 *  und wandeln erst dann in double um
		 */
		System.out.println((double)(3/2));      	    // 1.0     - double
		
		/*
		 * Achtung: anders als bei double hat char nicht die höhere Priorität sondern
		 * int, darum wird hier implizit nach int gecastet.
		 */
		System.out.println((char)'a' + 1);				// 98      - int
	}
}
