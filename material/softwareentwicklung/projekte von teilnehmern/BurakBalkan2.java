import java.awt.Color;

public class BurakBalkan2
{
	public static void main(final String[] args)
	{
		// Create ToolBox
		ToolBox t = new ToolBox(true);

		// Draw rectangle
		
		
		
			
		

		
		int counter = 0;
		while (counter<100)
		{
			t.setRandomColor();
			int x = t.nextRandomInt(800);
			int y = t.nextRandomInt(600);
			System.out.println("x=" + x + ",y=" + y);
			t.fillOval (x, y, 155, 155);
			t.fillOval (x, y, 155, 155);
			t.fillOval (x, y, 155, 155);
			
			t.fillOval (x, y, 155, 155);
			t.fillOval (x, y, 155, 155);
			t.fillOval (x, y, 155, 155);
			
			
			
			
			t.wait(154);
			//counter = counter + 10;
		}
		
		
		// Documentation for the GUI project: http://fs07.de/vorkurs/
	}
}
