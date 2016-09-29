class Aufg1f{
	public static void main(String[] args){
		/*
		 * Überprüfung der minimalen Paramateranzahl
		 */
		int x1 = Integer.parseInt(args[0]);
		int x2 = Integer.parseInt(args[1]);
		int x3 = Integer.parseInt(args[2]);
		
		/*
		 * oder alternativ initialisieren sie einfach Beispielwerte
		 * int x1 = 1
		 * int x2 = 10
		 * int x3 = 6
		 */

		int median = 0;

		/*
		 * Abfrage der noch 3 übrigen Möglichkeiten
		 */
		if (x1 > x2){
			if (x1 < x3){
				median = x1;
			}
			else{
				if (x2 > x3){
					median = x2;
				}
				else{
					median = x3;
				}
			}
		}
		else{
			if (x1 < x3){
				if (x3 < x2){
					median = x3;
				}
				else{
					median = x2;
				}
			}
			else{
				median = x1;
			}
		}
		System.out.println("Median(" + x1 + "," + x2 + "," + x3 + ") = "
				+ median);
	}
}
