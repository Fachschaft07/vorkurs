import java.awt.Color;
import java.io.IOException;

public class AnalogClock {

	public static void main(String[] args) throws InterruptedException, IOException {
		ToolBox tb = new ToolBox(true);

		// get the screensize
		int xMax = tb.getFrameWidth();
		int yMax = tb.getFrameHeight();
		final int xmid = xMax / 2;
		final int ymid = yMax / 2;
		tb.setColor(Color.BLACK);
		tb.setStroke(3);
		tb.drawOval(xmid - 125, ymid - 125, 250, 250);
		// 12 und 6
		tb.drawLine(xmid, ymid - 125, xmid, ymid - 100);
		tb.drawLine(xmid, ymid + 125, xmid, ymid + 100);
		// 3 und 9
		tb.drawLine(xmid - 125, ymid, xmid - 100, ymid);
		tb.drawLine(xmid + 125, ymid, xmid + 100, ymid);
		tb.fillOval(xmid - 5, ymid - 5, 10, 10);

		long oldSekondAngle = 0;
		long oldMinuteAngle = 0;
		long oldHouerAngle = 0;
		while (true) {
			long t = java.lang.System.currentTimeMillis();
			long sek = (t / 1000) % 60;
			long min = (t / 60000) % 60;
			long std = ((t / 3600000) + 2) % 24;
			tb.setColor(Color.WHITE);
			tb.drawVector(xmid, ymid, 100, oldSekondAngle);
			tb.drawVector(xmid, ymid, 75, oldMinuteAngle);
			tb.drawVector(xmid, ymid, 50, oldHouerAngle - min / 2);
			tb.setColor(Color.BLACK);
			tb.drawVector(xmid, ymid, 100, 90 - (sek * 6));
			tb.drawVector(xmid, ymid, 75, 90 - (min * 6));
			tb.drawVector(xmid, ymid, 50, 90 - (std * 30) - min / 2);
			oldSekondAngle = (90 - (sek * 6));
			oldMinuteAngle = (90 - (min * 6));
			oldHouerAngle = (90 - (std * 30) - min / 2);
			Thread.sleep(1000);

		}
	}

}
