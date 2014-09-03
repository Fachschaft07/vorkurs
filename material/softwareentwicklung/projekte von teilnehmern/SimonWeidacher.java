import java.awt.Color;

public class SimonWeidacher{

	public static void main(String[] args){
		ToolBox t = new ToolBox(true);
		
		int anzahl = Integer.parseInt(args[0]);
		int[] xCo = new int[anzahl];
		int[] yCo = new int[anzahl];
		int[] xDir = new int[anzahl];
		int[] yDir = new int[anzahl];
		
		// Kreise Initialisieren
		for(int i = 0; i <= anzahl-1; i++){
			xCo[i] = t.nextRandomInt(800);
			yCo[i] = t.nextRandomInt(600);
			t.setColor(Color.BLACK);
			t.fillOval( xCo[i], yCo[i], 40, 40);
			xDir[i] = t.nextRandomInt(2) - 1;
			if(xDir[i] == 0){
				xDir[i] = 1;
			}
			yDir[i] = t.nextRandomInt(2) -1;
			if(yDir[i] == 0){
				yDir[i] = -1;
			}
		}
		// Animation
		while(true){
			for(int i = 0; i <= anzahl-1; i++ ){
				t.setColor(Color.WHITE);
				t.fillOval(xCo[i], yCo[i], 40, 40);
				if(xCo[i] == 760){
					xDir[i] = -1;
				}
				if(xCo[i] == 0){
					xDir[i] = 1;
				}
				if(yCo[i] == 560){
					yDir[i] = -1;
				}
				if(yCo[i] == 0){
					yDir[i] = 1;
				}
				xCo[i] = xCo[i] + xDir[i];
				yCo[i] = yCo[i] + yDir[i];
				
				t.setColor(Color.BLACK);
				t.fillOval( xCo[i], yCo[i], 40, 40);
			} 
			t.wait(2);
			
			
		} 
	}
	

	
}