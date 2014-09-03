import java.awt.Color;

public class StephanBrosza
{
	public static void main(final String[] args)
	{
		// Create ToolBox
		ToolBox t = new ToolBox(true);

		// Draw rectangle
		t.setColor(Color.BLACK);
		int l = 0;
		while (l<100){
			t.drawLine(200, 300, 200, 300-l);
			l = l +1;
			t.wait(25);
		}
		int o = 0;
		while (o<100){
			t.drawLine(200, 200, 200+o, 200);
			o = o +1;
			t.wait(25);
		}
		int q1 = 0;
		while (q1<100){
			t.drawLine(300, 200, 300-q1, 200+q1);
			q1 = q1 +1;
			t.wait(25);
		}
		int u = 0;
		while (u<100){
			t.drawLine(200, 300, 200+u, 300);
			u = u +1;
			t.wait(25);
		}
		int r = 0;
		while (r<100){
			t.drawLine(300, 300, 300, 300-r);
			r = r +1;
			t.wait(25);
		}
		int or = 0;
		while (or<50){
			t.drawLine(300, 200, 300-or, 200-or);
			or = or +1;
			t.wait(25);
		}
		int ol = 0;
		while (ol<50){
			t.drawLine(250, 150, 250-ol, 150+ol);
			ol = ol +1;
			t.wait(25);
		}
		int q2 = 0;
		while (q2<100){
			t.drawLine(200, 200, 200+q2, 200+q2);
			q2 = q2 +1;
			t.wait(25);
		}
		t.wait(5000);
		int counter = 0;
		int bouncer = 0;
		int breit = 50;
		int hoch = 50;
		boolean nR=true;
		boolean nO=true;
		boolean nb=true;
		boolean nh=true;
		while (true){
			t.setColor(Color.WHITE);
			t.fillRectangle(0, 0, 800, 800);
			t.setColor(Color.RED);
			t.fillOval(counter, bouncer, hoch, breit);
			if (nR==true){
				counter = counter + 2;
				if (counter==790-hoch){
					nR=false;
				}
			}
			else {
				counter = counter - 2;
				if (counter==0){
					nR=true;
				}
			}
			if (nO==true){
				bouncer = bouncer + 2;
				if (bouncer==590-hoch){
					nO=false;
				}
			}
			else {
				bouncer = bouncer - 2;
				if (bouncer==0){
					nO=true;
				}
			}
			if (nb==true){
				breit = breit +2;
				if (breit==90){
					nb=false;
				}
			}
			else {
				breit = breit -2;
				if (breit==10){
					nb=true;
				}
			}
			if (nh==true){
				hoch = hoch + 2;
				if (hoch==90){
					nh=false;
				}
			}
			else {
				hoch = hoch - 2;
				if (hoch==10){
					nh=true;
				}
			}
			t.wait(15);
		
		}
		

		// Documentation for the GUI project: http://fs07.de/vorkurs/
	}
}
