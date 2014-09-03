public class Aufg2c
{
	public static void main(String[] args)
	{
		// optional
		/*
		 *  int year = Integer.parseInt(args[0]);
		 *  System.out.println(year%4==0 && (year%100!=0 || year%400==0));
		 */
		
		/*
		 * Alternativ
		 */
		int year = 1700;
		System.out.println(year%4==0 && (!(year%100==0) || year%400==0));
		// oder
		// System.out.println(year%4==0 && (year%100!=0 || year%400==0));
		/*
		 * Erklärung:
		 * Ein Schaltjahr muss durch 4 teilbar sein, darf nicht durch 100 teilbar sein.
		 * Wenn es aber durch 400 teilbar ist, ist es wieder ein Schaltjahr.
		 */
	}
}
