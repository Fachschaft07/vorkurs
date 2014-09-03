/*
Das Programm enthält eine erstaunliche Anzahl an Fehlern:
public class Aufg4b
{
	public static void main(String args[])
	{
		int a,b = 4;
		System.out.println(a);				
		 													1. a wurde nicht initalisiert
		System.out.println(b);								// 4
		int a = 5;
															2. a wird hier zum zweiten mal definiert
		a = 6;
		int c = d;
															3. d wurde weder definiert noch initialisiert
		
		int i = 5; short s = 4;
		boolean b = 1;
															4. b ist vom Typ boolean und kann nur mit
															   true oder false initialisiert werden
															5. der variablenname b ist bereits reserviert
		boolean bool1 = true, boolean bool2 = false;
															6. Semikolon statt Komma
		double d1 = 1.3;
		double d2 = d1 = 1.5;
		System.out.println(d1);								// 1.5
		System.out.println(d2);								// 1.5
		long l = 131231341313;
															7. da das Literal größer als ein int ist muss
															   dies mit einem großen L am ende für long
															   gekennzeichnet werden
		float f = 1.3;
															8. fehlendes f am ende der Zahl, wird als
															   double interpretiert
	}
}

	class hello                              // 1. public fehlt
	                                         // 2. hello statt Hello
	{
	   public void main{String *args[]};     // 3. static fehlt
	                                         // 4. { statt (
	                                         // 5. * unnötig
	                                         // 6. } statt )
	                                         // 7. Semikolon überflüssig
	   (                                     // 8. ( statt {
	      System.out.PrintLn('Hello, world') // 9. PrintLn statt println
	                                         //10. ' statt "
	                                         //11. ' statt "
	                                         //12. Semikolon fehlt
	   )                                     //13. ) statt }
	}

	Es folgt eine korrigierte Version:
*/
public class Aufg4b
{
	public static void main(String args[])
	{
		int a = 4;
		int b = 4;
		System.out.println(a);				
		System.out.println(b);
		a = 5;
		a = 6;
		int c = 10;
		
		int i = 5; short s = 4;
		boolean bool = true;
		boolean bool1 = true; boolean bool2 = false;
		double d1 = 1.3;
		double d2 = d1 = 1.5;
		System.out.println(d1);					
		System.out.println(d2);
		long l = 131231341313L;
		float f = 1.3f;
	}
}
