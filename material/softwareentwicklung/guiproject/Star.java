import java.awt.Color;

public class Star
{
	public static void main(final String[] args)
	{
		// Create ToolBox
		ToolBox t = new ToolBox(false);

		int n = 5;
		int radius = 300;

		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;
		
		double step = ((double)360 / n) * Math.floor(n / 2);

		t.setStroke(12);
		t.setColor(Color.RED);

		for (int i = 0; i < n; i++)
		{
			x1 = Math.cos(Math.toRadians(i * step)) * radius;
			y1 = Math.sin(Math.toRadians(i * step)) * radius;

			x2 = Math.cos(Math.toRadians((i + 1) * step)) * radius;
			y2 = Math.sin(Math.toRadians((i + 1) * step)) * radius;

			t.drawLine((int) x1 + t.getFrameWidth()/2, (int) y1 + t.getFrameHeight()/2, (int) x2 + t.getFrameWidth()/2, (int) y2 + t.getFrameHeight()/2);
		}
	}
}
