public class Aufg1d
{
	public static void main(String args[])
	{
		double d = 1.7976931348623157E308;
		System.out.println("Rechnung gegen Unendlich:");
		System.out.println("d = " + d);
		d = d * 0.1E100;
		System.out.println("d * 0.1E100 = " + d);
		
		System.out.println("\nRechnung gegen 0:");
		d = 0.1E-300;
		System.out.println("d = " + d);
		d = d * d;
		System.out.println("d * d = " + d);
	}
}
