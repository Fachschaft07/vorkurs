import java.awt.Color;

public class DigitClock {
	static ToolBox tb = new ToolBox(true);

	static boolean[] segment0 = { true, true, true, false, true, true, true };
	static boolean[] segment1 = { false, false, true, false, false, true, false };
	static boolean[] segment2 = { false, true, true, true, true, false, true };
	static boolean[] segment3 = { false, true, true, true, false, true, true };
	static boolean[] segment4 = { true, false, true, true, false, true, false };
	static boolean[] segment5 = { true, true, false, true, false, true, true };
	static boolean[] segment6 = { true, true, false, true, true, true, true };
	static boolean[] segment7 = { false, true, true, false, false, true, false };
	static boolean[] segment8 = { true, true, true, true, true, true, true };
	static boolean[] segment9 = { true, true, true, true, false, true, true };
	static boolean[][] a = { segment0, segment1, segment2, segment3, segment4, segment5, segment6, segment7, segment8, segment9 };
	static boolean showDots = true;

	public static void main(String[] args) throws InterruptedException {
		int xMax = tb.getFrameWidth();
		int yMax = tb.getFrameHeight();
		// get the screensize

		tb.setColor(Color.BLACK);
		tb.setStroke(5);
		while (true) {
			printDots();
			long t = java.lang.System.currentTimeMillis();
			long sek = (t / 1000) % 60;
			long min = (t / 60000) % 60;
			long std = ((t / 3600000) + 2) % 24;
			int one = (int) (std / 10);
			int two = (int) (std % 10);
			int three = (int) (min / 10);
			int four = (int) (min % 10);
			int five = (int) (sek / 10);
			int six = (int) (sek % 10);
			// 30 drauf
			drawNumber(a[one], 0, 0);
			drawNumber(a[two], 1, 0);
			drawNumber(a[three], 2, 30);
			drawNumber(a[four], 3, 30);
			drawNumber(a[five], 4, 60);
			drawNumber(a[six], 5, 60);
			Thread.sleep(1000);
			tb.setColor(Color.WHITE);
			tb.fillRectangle(0, 0, xMax, yMax);
			tb.setColor(Color.BLACK);
		}
	}

	static void printDots() {
		if (!showDots) {
			tb.setColor(Color.WHITE);
		}
		tb.fillOval(255, 155, 10, 10);
		tb.fillOval(255, 255, 10, 10);
		tb.fillOval(525, 155, 10, 10);
		tb.fillOval(525, 255, 10, 10);
		showDots = !showDots;
		tb.setColor(Color.BLACK);

	}

	static void drawNumber(boolean[] segment, int pos, int dots) {

		int offset = 120;
		for (int i = 0; i < segment.length; i++) {
			int start = 15;
			if (segment[i]) {
				print(start + dots + offset * pos, i); // 1
				// print(start + offset, i);// 2
				// // dp
				// start = start + 30;
				// print(start + 2 * offset, i);
				// print(start + 3 * offset, i);
				// // dp
				// start = start + 30;
				// print(start + 4 * offset, i);
				// print(start + 5 * offset, i);
			}
		}
	}

	static void print(int start, int seg) {
		switch (seg) {
		case 0:
			tb.drawLine(start - 5, 105, start - 5, 205);
			break;
		case 1:
			tb.drawLine(start, 100, start + 100, 100);
			break;
		case 2:
			tb.drawLine(start + 105, 105, start + 105, 205);
			break;
		case 3:
			tb.drawLine(start, 210, start + 100, 210);
			break;
		case 4:
			tb.drawLine(start - 5, 215, start - 5, 315);
			break;
		case 5:
			tb.drawLine(start + 105, 215, start + 105, 315);
			break;
		case 6:
			tb.drawLine(start, 320, start + 100, 320);
			break;
		default:
			break;
		}
	}

}
