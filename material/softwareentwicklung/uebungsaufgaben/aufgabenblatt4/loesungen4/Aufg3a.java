class Aufg3a{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int sum = 0;
		int i = 1;
		while(i<=n){
			sum = sum + i;
			i++; // Achtung: Hochzählen nicht vergessen
		}

		System.out.println("Die Summe aller Zahlen von 1 bis " + n + " ist " + sum);
		
		int fak = 1;
		i = 1;
		while(i<=n){
			fak = fak * i;
			i++; // Achtung: Hochzählen nicht vergessen
		}
		System.out.println("Die Fakultaet der Zahl " + n + " ist " + fak);
	}
}
