import java.awt.Color;

public class OmerOzel2
{
	public static void main(final String[] args)
	{
		// Create ToolBox
		ToolBox t = new ToolBox(true);
		while(true)
		{
			//Draw Oval
			t.setColor(Color.BLACK);
			
			for(int i=90; i>=-270; i-=6)
			{
				t.setColor(Color.WHITE);
				t.fillRectangle(0 , 0, 800, 600);
				t.setColor(Color.BLACK);
				t.drawOval( 100, 100, 400, 400);
				t.setStroke(1);
				t.drawVector(300, 300, 200, i);
				t.wait(1000);
								
			}
						
		}
		
	}
	
}