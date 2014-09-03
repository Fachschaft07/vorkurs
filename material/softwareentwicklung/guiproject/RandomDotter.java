import java.awt.Color;

public class RandomDotter
{
	public static void main(final String[] args)
	{
		// Create ToolBox
		ToolBox t = new ToolBox(true);

		// get the screensize
		int xMax = t.getFrameWidth();
		int yMax = t.getFrameHeight();

		while (true)
		{
			// do every 5ms
			t.wait(5);

			// Screensize is divided into 10x10 fields and one is randomly selected
			int randX = t.nextRandomInt(xMax / 10 + 1);
			int randY = t.nextRandomInt(yMax / 10 + 1);

			// draw a Rectangle with random Color at this position
			t.setRandomColor();
			t.fillRectangle(randX * 10, randY * 10, 10, 10);
		}
	}
}
