public class Aufg1a
{
	public static void main(String[] args)
	{
		int year = Integer.parseInt(args[0]);

		if(year%4 == 0 && (!(year%100==0) || year%400==0))
		{
			System.out.println(year + " ist ein Schaltjahr!");
		}
		else
		{
			System.out.println(year + " ist kein Schaltjahr!");
		}
	}
}
