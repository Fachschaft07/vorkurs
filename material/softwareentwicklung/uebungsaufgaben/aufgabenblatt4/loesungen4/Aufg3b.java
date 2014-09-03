public class Aufg3b
{
	public static void main(String[] args)
	{
		int n = 2;
		// n wird niemals gerade somit generieren wir hier gerade eine Endlosschleife
		while(n%2==0)
		{
			n = n + 2;
			System.out.println(n);
		}
	}
}
