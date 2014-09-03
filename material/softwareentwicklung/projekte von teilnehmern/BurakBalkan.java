import java.awt.Color;

public class BurakBalkan
{
	public static void main(final String[] args)
	{
		// Create ToolBox
		ToolBox t = new ToolBox(true);

		// Draw rectangle
		t.setColor(Color.black);
		t.setStroke (3);

		// Rows
		for(int j=0; j<5; j++) {
			// Columns
			for(int i=0; i<8; i++) {
				if (i%2==0) {
					t.fillRectangle(i*100,j*100,100,100);
				} else {
					t.drawRectangle(i*100,j*100,100,100);
				}
			}
			t.wait (1000);
		}
		t.setStroke (1);
		
		
		int counter = 0;
		while (counter<100)
		{
			t.setRandomColor();
			int x = t.nextRandomInt(400);
			int y = t.nextRandomInt(400);
			
			int a = 1;
			int b = 590;
			System.out.println("x=" + x + ",y=" + y);
			t.fillOval (45, 75, 66, 66);
			t.fillOval (120, 60, 66, 66);
			t.fillOval (80, 35, 66, 66);
			
			t.fillOval (350, 75, 50, 55);
			t.fillOval (300, 60, 55, 55);
			t.fillOval (330, 35, 55, 55);
			
			t.fillOval (550, 75, 50, 55);
			t.fillOval (500, 60, 55, 55);
			t.fillOval (530, 35, 55, 55);
			
			t.fillOval (750, 175, 50, 55);
			t.fillOval (700, 160, 55, 55);
			t.fillOval (730, 135, 55, 55);
			
			
			
			t.drawLine (400, 600, 550, 155);
			t.drawLine (400, 500, 550, 155);
			t.drawLine (300, 600, 550, 155);
			t.drawLine (300, 500, 550, 155);
			
			t.drawLine (700, 600, 120, 155);
			t.drawLine (700, 500, 120, 155);
			
			t.drawLine (700, 200, 120, 155);
			t.drawLine (700, 300, 120, 155);
			
			t.drawLine (700, 600, 120, 155);
			t.drawLine (700, 500, 120, 155);
			
			
			t.fillRectangle (0, 500, 800, 520);
			
			
			
			t.wait(200);
			//counter = counter + 10;
		}
		
		
		
		
		
		// Documentation for the GUI project: http://fs07.de/vorkurs/
	}
}
