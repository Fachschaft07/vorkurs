class Aufg2g{
	public static void main(String[] args){
		for (int i = 1; i <= 7; ++i){
			for (int j = 1; j <= i; ++j){
				System.out.print(j);
		    }
		    System.out.print(" ");
			for (char c = 'a'; c <= 'h' - i; ++c){
		    	System.out.print(c);
		    }
		    System.out.println();
		}
	}
}
