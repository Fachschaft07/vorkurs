class Aufg1b{
	public static void main(String[] args){
		int array;
		
		//array = new int[5];
		/*
		 *  1. falscher Datentyp bei der Definition, 
		 *  richtig wäre: int[] array oder aber array = 5;
		 *  
		 */
		
		int secArray[];
		secArray = new  int   [5]; // Leerzeichen spielen keine Rolle alles richtig
		
		
		int[]a1 = new int[10];	// Leerzeichen muss nicht sein
		
		//[]int a2 = new int[10];
		/*
		 * 2. falsche Klammerung, die eckigen Klammern gehören rechts vor das int 
		 */
		int a3 [] = new int[10]; // Klammer hinter dem Namen der Variable ist auch ok!
		
		//a3[-1] = 4;
		/*
		 * 3. Index geht grundsätzlich von 0 bis x und ist niemals negativ!
		 * Hier wird auf ein Platz zugegriffen welcher nicht existiert
		 */
		
		//a3[10] = 5;
		/*
		 * 4. Das Array hat zwar 10 Plätze doch der Index geht startet bei 0!
		 * Der Index geht also von 0 bis 9 damit ist 10 ein ungültiger index
		 */
		a3[0] = 2;
		
		//a1 = new int[];
		/*
		 * 5. Es muss eine Größe angegeben werden.
		 * richtig wäre: a1 = new int[10];
		 */

		a1 = new int [] {1,2,3,4}; // alles richtig hier ergibt sich die größe aus den Elementen (4)
		
		//a2 = {1,2,3,4};
		/*
		 * 6. Ein Array muss immer mit new Speicher anfordern. Es fehlt außerdem der Datentyp
		 * und die Klammer was es als Array kennzeichnet.
		 * richtig wäre: a2 = new int[] {1,2,3,4};
		 */
		
		//a2 = new {1,2,3,4};
		/*
		 * 7. Ein wenig richtiger aber die Klammern und der Datentyp fehlen weiterhin
		 */
		
		//int [] twoDimArray1 = new int []{{1,2},{3,4},{5,6}};
		/*
		 * 8. Die Dimension muss durch die Eckigenklammern mit den geschweiften übereinstimmen
		 * richtig wäre: int [][] twoDimArray1 = new int [][] {{1,2},{3,4},{5,6}};
		 */
		
		int [][] twoDimArray2 = new int [][]{{1,2},{3,4},{5,6}};
		int [][] twoDimArray3 = new int[4][]; // alles ok da wir die 2te Dimension auch erst später füllen können
	
		//int [][] twoDimArray4 = new int[][];
		/*
		 * 9. Mindestens die erste Dimension muss erstellt werden und dazu muss eine größe
		 * angegeben werden.
		 */
		
		//int [][] twoDimArray5 = new int[][5];
		/*
		 * 10. Die erste Dimension muss erstellt werden und eine Größe muss angegeben werden.
		 * richtig wäre: int [][] towDimArray5 = new int[6][5];
		 */
		
		int a [] = new int[2];
		int b [] = new int[8];
		int c [];
		
		c = a;
		a = b;
		b = c;
		/*
		 * Alles in Ordnung, hier wird die Referenz von a und b vertauscht.
		 */
		
		int i [] = new int[55];
		double [] d = new double[33];
		short s [] = new short[44];
		
		//i = d;
		/*
		 * 11. Der Datentyp ist nicht kompatibel. Ein double Array benötigt deutlich mehr 
		 * Speicherplatzt
		 */
		
		//d = i;
		/*
		 * 12. Der Datentyp ist nicht kompatibel. Ein int Array benötigt deutlich weniger 
		 * Speicherplatz aber trotzdem ist eine solche Konvertierung nicht möglich.
		 */
		
		//i = s;
		/*
		 * 13. Wie oben.
		 */
	}
}
