class Aufg1e{
	public static void main(String[] args){
		boolean istHaupstadt = true;
		int anzahlEinwohner = 150000;
		double steuernProEinwohner = 430.0;

		if (istHaupstadt && anzahlEinwohner >= 100000 || anzahlEinwohner >= 200000
				&& steuernProEinwohner * 12 * anzahlEinwohner > 720000000){
			System.out.println("Stadt ist eine Metropole");
		}
		else{
			System.out.println("Stadt ist keine Metropole");
		}
	}
}
