import java.awt.Color;

public class OmerOzel
{
	public static void main(final String[] args)
	{
		// Create ToolBox
		ToolBox t = new ToolBox(true);
		
		while (true)
		{
		
			t.setColor(Color.BLACK);
			for (int i=-250; i<=800; i+=10)
			{
				t.setColor(Color.WHITE);
				t.fillRectangle(0 , 0, 800, 600);
				t.setColor(Color.YELLOW);
				t.fillOval( i, 100, 250, 300);
				t.setColor(Color.BLACK);
				t.drawOval( i, 100, 250, 300);
				t.wait(100);
			}
		}
	}
}