import java.awt.Color;

public class iCancer
{
	public static void main(final String[] args)
	{
		// Create ToolBox
		final ToolBox t = new ToolBox(true);

		// get the screensize
		final int xMax = t.getFrameWidth();
		final int yMax = t.getFrameHeight();

		t.setColor(Color.black);
		t.setStroke(2);

		// Length, angle, startpoint of the first line
		int length1 = yMax;
		int length2 = xMax - 2;
		float angle = 90;
		int x1 = 1;
		int y1 = -1;

		// do until screen is full
		// always draw two lines per iteration
		for (int i = 0; i < yMax / 4; i++)
		{
			// calculate endpoint for the first line
			int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * length1);
			int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * length1);

			// draw line
			t.drawLine(x1, y1, x2, y2);

			// decrement the angle and length
			// and set startpoint for next line to endpoint of last line
			angle -= 90;
			length1 -= 4;
			x1 = x2;
			y1 = y2;

			// calculate endpoint for the next line
			x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * length2);
			y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * length2);

			// draw line
			t.drawLine(x1, y1, x2, y2);

			// decrement the angle and length
			// and set startpoint for next line to endpoint of last line
			angle -= 90;
			length2 -= 4;
			x1 = x2;
			y1 = y2;
		}

	}
}
