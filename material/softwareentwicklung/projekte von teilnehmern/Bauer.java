import java.awt.Color;

public class Bauer
{
	public static void main(final String[] args)
	{
		// Create ToolBox
		ToolBox t = new ToolBox(true);
		
		// Create Circle
		while(true)
		{
			int counter=0;
			int ab=0;
			while(counter<110)
			{	
				if(counter%2==0)
				{
					t.setColor(Color.WHITE);
				}
				
				else
				{
					t.setColor(Color.BLACK);
					t.fillOval(400-ab, 270-ab, 10*counter, 10*counter);
				}
			
				t.wait(50);
				counter = counter + 5;
				ab = ab + 25;
			}
			
			counter=0;
			ab=0;
			while(counter<110)
			{
				if(counter%2==0)
				{
					t.setColor(Color.BLACK);
				}
				
				else
				{
					t.setColor(Color.WHITE);
					t.fillOval(400-ab, 270-ab, 10*counter, 10*counter);
				}
				
				t.wait(50);
				counter = counter + 5;
				ab = ab + 25;	
			}
		}	
			
		

		// Documentation for the GUI project: http://fs07.de/vorkurs/
	}
}
