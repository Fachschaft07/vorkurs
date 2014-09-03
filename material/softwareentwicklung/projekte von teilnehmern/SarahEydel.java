import java.awt.Color;

public class SarahEydel
{
	public static void main(final String[] args)
	{
		// Create ToolBox
		ToolBox t = new ToolBox(true);
		
		while(true)
		{
			// Draw rectangle
			t.setColor(Color.BLACK);
			t.drawRectangle(50, 200, 200, 200);
			t.drawLine(50, 200, 150, 100);
			t.drawLine(250,200, 150,100);
			t.drawLine(50,200,250,400);
			t.drawLine(250,200,50,400);
			t.wait(500);

			t.setColor(Color.WHITE);
			t.fillRectangle(0, 0,800, 600);
  			t.wait(500);
		}



		// Documentation for the GUI project: http://fs07.de/vorkurs/
	}
}
