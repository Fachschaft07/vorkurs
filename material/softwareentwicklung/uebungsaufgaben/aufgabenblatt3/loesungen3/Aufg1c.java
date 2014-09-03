public class Aufg1c
{
	public static void main(String[] args)
	{
		int number = Integer.parseInt(args[0]);
		number = number%7;
		
		if(number == 0)
		{
			System.out.println("Das ist Ihre Glückszahl");
		}
		else if(number == 1)
		{
			System.out.println("Heute ist ein guter Tag");
		}
		else if(number == 2)
		{
			System.out.println("Sie habens einfach drauf");
		}
		else if(number == 3)
		{
			System.out.println("Lieber im Bett bleiben");
		}
		else if(number == 4)
		{
			System.out.println("Heute mal in die Sonne");
		}
		else if(number == 5)
		{
			System.out.println("Sie sind genau der Informatiktyp");
		}
		else if(number == 6)
		{
			System.out.println("Java ist ein Kinderspiel");
		}
	}

}
