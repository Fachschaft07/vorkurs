public class Aufg2e
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		int fak = 1;
		for(int i = 1; i <= n; i++)
		{
			fak *= i;
		}
		System.out.println("Die Fakultät der Zahl " + n + " ist " + fak);
	}
}
