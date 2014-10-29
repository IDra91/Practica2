import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


public class dibujo extends Canvas {
	public dibujo(){	 
	}
	@Override
	public void paint(Graphics d){
		//vagón de tercera clase
		
		d.setColor(Color.green);
		d.fillRect(10,100,50,30);
		
		d.setColor(Color.BLACK);
		d.drawArc(40, 130, 10, 10, 0, 360);
		
		d.setColor(Color.BLACK);
		d.drawArc(10, 130, 10, 10, 0, 360);
		
		//vagón de tercera clase
		
		d.setColor(Color.green);
		d.fillRect(70,100,50,30);
		
		d.setColor(Color.BLACK);
		d.drawArc(100, 130, 10, 10, 0, 360);
		
		d.setColor(Color.BLACK);
		d.drawArc(70, 130, 10, 10, 0, 360);
		
		//vagón de primera clase
		d.setColor(Color.BLUE);
		d.fillRect(130,100,50,30);
		
		d.setColor(Color.BLACK);
		d.drawArc(160, 130, 10, 10, 0, 360);
		
		d.setColor(Color.BLACK);
		d.drawArc(130, 130, 10, 10, 0, 360);
		
		//vagón de carbón
		d.setColor(Color.ORANGE);
		d.fillRect(190,100,50,30);
				
		d.setColor(Color.BLACK);
		d.drawArc(220, 130, 10, 10, 0, 360);
				
		d.setColor(Color.BLACK);
		d.drawArc(190, 130, 10, 10, 0, 360);
		
		//Locomotora 
		d.setColor(Color.red);
		d.fillRect(260,100,50,30);
		
		d.setColor(Color.red);
		d.drawLine(310, 130, 320, 130);
		
		d.setColor(Color.red);
		d.drawLine(310, 120, 320, 130);
				
		d.setColor(Color.BLACK);
		d.drawArc(275, 130, 10, 10, 0, 360);
				
		d.setColor(Color.BLACK);
		d.drawArc(260, 130, 10, 10, 0, 360);
		
		d.setColor(Color.BLACK);
		d.drawArc(295, 130, 10, 10, 0, 360);
		
				
		
	}

}
