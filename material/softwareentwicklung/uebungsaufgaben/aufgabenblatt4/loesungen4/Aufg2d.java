public class Aufg2d
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		int sum = 0;
		for(int i = 1; i <= n; i++)
		{
			sum = sum + i;
		}
		System.out.println("Die Summe aller Zahlen von 1 bis " + n + " ist " + sum);
	}
}
