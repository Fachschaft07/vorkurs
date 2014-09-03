/*
 Das Programm enthält eine erstaunliche Anzahl an Fehlern:

	class hello                              // 1. public fehlt
	                                         // 2. hello statt Hello
	{
	   public void main{String *args[]};     // 3. static fehlt
	                                         // 4. { statt (
	                                         // 5. * falsch
	                                         // 6. } statt )
	                                         // 7. Semikolon falsch
	   (                                     // 8. ( statt {
	      System.out.PrintLn('Hello, world') // 9. PrintLn statt println
	                                         //10. ' statt "
	                                         //11. ' statt "
	                                         //12. Semikolon fehlt
	   )                                     //13. ) statt }
	}

	Es folgt eine korrigierte Version (die Klasse heißt hier
	allerdings "Aufg2c" statt "hello")
 */
public class Aufg2c
{
	public static void main(String args[])
	{
		System.out.println("Hello, world");
	}
}