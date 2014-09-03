import java.awt.Color;

public class Spiral
{
	public static void main(final String[] args)
	{
		// Create ToolBox
		final ToolBox t = new ToolBox(false);

		// get the screensize
		final int xMax = t.getFrameWidth();
		final int yMax = t.getFrameHeight();

		t.setColor(Color.black);

		// Length, angle, startpoint of the first line
		int length = 300;
		float angle = -90;
		int x1 = 1000;
		int y1 = 550;

		// do 300 times
		for (int i = 0; i < 300; i++)
		{
			// calculate endpoint for the line
			int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * length);
			int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * length);
			
			// draw line
			t.drawLine(x1, y1, x2, y2);
			
			// decrement the angle and length
			// and set startpoint for next line to endpoint of last line
			angle-=51;
			length-=1;
			x1 = x2;
			y1 = y2;
		}

	}
}
