class Aufg2f{
	public static void main(String[] args){
		int size;
		size = Integer.parseInt(args[0]);
		if (size >= 1) {
			for (int i = 1; i <= size; ++i){
				for (int j = 1; j <= size; ++j){
					if (j == 1 || j == size || i == 1 || i == size){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}
