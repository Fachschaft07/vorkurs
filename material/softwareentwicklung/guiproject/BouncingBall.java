import java.awt.Color;

public class BouncingBall
{
	public static void main(final String[] args)
	{
		// Create ToolBox
		ToolBox t = new ToolBox(true);

		// get the screensize
		int xMax = t.getFrameWidth();
		int yMax = t.getFrameHeight();

		// the fly direction
		Boolean xDir = true;
		Boolean yDir = true;

		System.out.println(xMax + " "+ yMax);
		
		// start at position (0,0)
		int x = 0;
		int y = 0;

		while (true)
		{
			// Every 10ms repaint the picture
			t.wait(10);

			// draw over the old position 
			t.setColor(Color.white);
			t.fillOval(x, y, 20, 20);

			// Collision detection
			// If the coordinates reach the screen border, change direction
			if (x >= xMax - 20 || x < 0)
			{
				xDir = !xDir;
			}
			if (y >= yMax - 20 || y < 0)
			{
				yDir = !yDir;
			}

			// calculate the new coordinates 
			// if direction==true, add 10 to the old coordinates
			// if direction==false, sub 10 from the old coordinates
			x = xDir ? x + 10 : x - 10;
			y = yDir ? y + 10 : y - 10;

			// draw at new coordinates
			t.setColor(Color.black);
			t.fillOval(x, y, 20, 20);
		}
	}
}
