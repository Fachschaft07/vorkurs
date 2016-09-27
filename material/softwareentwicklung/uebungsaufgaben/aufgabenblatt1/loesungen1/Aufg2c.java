/*
 Das Programm enthält eine erstaunliche Anzahl an Fehlern:

	class hello                              // 1. hello statt Hello
	{
	   public void main{String *args[]};     // 2. static fehlt
	                                         // 3. { statt (
	                                         // 4. * falsch
	                                         // 5. } statt )
	                                         // 6. Semikolon falsch
	   (                                     // 7. ( statt {
	      System.out.PrintLn('Hello, world') // 8. PrintLn statt println
	                                         // 9. ' statt "
	                                         //10. ' statt "
	                                         //11. Semikolon fehlt
	   )                                     //12. ) statt }
	}

	Es folgt eine korrigierte Version (die Klasse heißt hier
	allerdings "Aufg2c" statt "hello")
 */
class Aufg2c
{
	public static void main(String args[])
	{
		System.out.println("Hello, world");
	}
}