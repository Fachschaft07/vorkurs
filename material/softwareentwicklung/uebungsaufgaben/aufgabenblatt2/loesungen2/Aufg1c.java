class Aufg1c{
	public static void main(String args[]){
		/*
		 * Ein byte kann nur 256 Werte annehmen (von -128 bis 127) da es nur 8 "Codierungsplätzte" hat
		 * Ein int hingegen besistzt ganze 32 Codierungsplätze und kann somit 2^32 Werte annehmen 
		 * 
		 * Hier ein Beispiel-Programm:
		 */
		int a = 55;
		System.out.println("int-Wert: " + a);
		/*
		 *  Eine Typecast ist nötig, da die Typen nicht kompatibel sind.
		 *  Beim Typcast kann es dann zu dem Informationsverlust kommen, da
		 *  hier das int quasi in das byte gepresst wird.
		 */
		byte b = (byte)a; 	
		System.out.println("byte-Wert: " + b);
		
		a = 4242;
		System.out.println("int-Wert: " + a);
		b = (byte)a;
		System.out.println("byte-Wert: " + b + " Fehler!");
	}
	
}
