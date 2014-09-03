import java.awt.Color;

public class Grid
{
	public static void main(final String[] args)
	{
		// Create ToolBox
		ToolBox t = new ToolBox(true);

		// get the screensize
		int xMax = t.getFrameWidth();
		int yMax = t.getFrameHeight();

		for (int i = 0; i < xMax; i++)
		{
			if (i % 50 == 0)
			{
				t.setColor(Color.BLUE);
				t.drawString(i, 10, "" + i);
				t.drawLine(i, 20, i, yMax);
			}
		}
		for (int i = 0; i < yMax; i++)
		{
			if (i % 50 == 0)
			{
				t.setColor(Color.RED);
				t.drawString(0, i, "" + i);
				t.drawLine(20, i, xMax, i);
			}
		}
	}
}
