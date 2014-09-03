public class Aufg1d
{
	public static void main(String[] args)
	{
		String[] texte = new String[7];
		
		texte[0] = "Das ist Ihre Glückszahl";
		texte[1] = "Heute ist ein guter Tag";
		texte[2] = "Sie habens einfach drauf";
		texte[3] = "Liebe im Bett bleiben";
		texte[4] = "Heute mal in die Sonne";
		texte[5] = "Sie sind genau der Informatiktyp";
		texte[6] = "Java ist ein Kinderspiel";
		
		int number = Integer.parseInt(args[0]);
		System.out.println(texte[number%7]);
		
		/*
		 * Eine sehr interessante Lösung.
		 */
	}
}
