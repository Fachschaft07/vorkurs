public class Aufg2b {
	public static void main(String[] args){
		int[] array = new int[10];
		
		System.out.println("Ausgabe 1:");
		for(int i = 0; i <= 10; i++){
			array[i] = i;
			System.out.print(array[i]+ " ");
		}
		
		System.out.println("\nAusgabe 2:");
		for(int i = 0; i < 10; i = i + 1){
			array[i] = i;
			System.out.print(array[i]+ " ");
		}
		
		System.out.println("\nAusgabe 3:");
		for(int i = 0; i > array.length; i++){
			array[i] = i + 3;
			System.out.println(array[i]+ " ");
		}
		
		System.out.println("\nAusgabe 4:");
		for(int i = 0; i <= 10; i++){
			i = i + 3;
			array[i] = i;
			System.out.println(array[i] + " ");
		}
	}
}