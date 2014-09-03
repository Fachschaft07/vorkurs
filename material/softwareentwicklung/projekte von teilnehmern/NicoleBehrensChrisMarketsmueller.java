import java.awt.Color;

public class NicoleBehrensChrisMarketsmueller
{
	public static void main(final String[] args)
	{
		// Create ToolBox
		ToolBox t = new ToolBox(true);
		
		//Deklaration und Wertzuweisung der Variablen
		
		double i = 0;			//Winkel der zu setzenden Vektoren
		double offset = 0;		// Setzung des Start-Winkels
		
		int startx = 400;		// x-Koordinaten des Rads
		int kreisStart = 300;	// x-Koordinaten des Kreises drumrum
		
		boolean rand = true;	// wird gebraucht um die Bewegung des Rades zu ändern
		
		// Farbzuweisung des Vector und des Kreisrandes
		t.setColor(Color.BLACK);
		
		while(true) // Anfang der Dauerschleife
		{	
			if (rand)		// Drehung des Rades nach links bzw. rechts
			{
				offset = offset + 1.2;
				
			}
			else
			{
				offset = offset - 1.2;
			}
			
			i = offset;
			
			t.setColor(Color.WHITE);			//komplett überdecken
			t.fillRectangle(0,0,800,600);
			t.setColor(Color.BLACK);			// Farbzuweisung des Vector und des Kreisrandes
			
			while(i<360+offset)					// das Rad wird erstellt solange bis i komplett ist
			{
				t.drawVector(startx, 300, 100, i);
				i = i + 8;
			}
			t.drawOval(kreisStart, 200, 200, 200);	
			
				t.wait(50);			
				i = offset;
				
				if(offset == 360)				// hier wird offset zurückgesetzt
				{
					offset = 0;
				}
			
			
			if (rand == true)					// das Rad bewegt sich nach links
			{
				startx = startx - 2;
				kreisStart = kreisStart - 2;
			}
			else
			{
				startx = startx + 2;			// das Rad bewegt sich nach rechts
				kreisStart = kreisStart + 2;
			}
			
			if (startx == 100)					// Bewegungsänderung und Neusetzung der Variable rand
			{
				rand = false;
			} else if (startx == 700)
			{
				rand = true;
			}
			
			
			System.out.println("i: "+i);
			System.out.println("offset: "+offset);
		}
		
		
		
		
		
		// Documentation for the GUI project: http://fs07.de/vorkurs/
	}
}