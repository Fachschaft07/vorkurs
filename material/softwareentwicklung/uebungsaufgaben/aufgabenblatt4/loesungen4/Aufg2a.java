public class Aufg2a
{
	public static void main(String[] args)
	{
		int indices[] = new int[11];
		/*
		 * Vorsicht: ein beliebter Anfängerfehler ist, dass man über das Array
		 * hinaus wandert. Wichtig: index < indices.length, denn wir wissen,
		 * das der letzte index um eins kleiner ist als die Größe (length = Länge)
		 * des Arrays!
		 */
		for(int index = 0; index < indices.length; index++)
		{
			indices[index] = index;
		}
		
		/*
		 * Wichtig index = indices.length-1, denn wir wissen,
		 * das der letzte index um eins kleiner ist als die Größe (length = Länge)
		 * des Arrays! Wir wissen außerdem das der erste Index immer 0 ist, deshalb gehen
		 * wir bis einschließlich 0.
		 */
		for(int index = indices.length-1; index > 0; index--)
		{
			indices[index] = index;
		}
	}
}
