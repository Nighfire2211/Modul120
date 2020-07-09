package MeinPaket;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


 class WindDemo extends JFrame
{
	 static GeneralPath makeRect( int x, int y, int width, int height)
	 {
		 GeneralPath p = new GeneralPath();
		 p.moveTo(x+width/2, y-height/2);
		 p.lineTo(x+width/2, y+height/2);
		 p.lineTo(x-width/2, y+height/2);
		 p.lineTo(x-width/2, y-height/2);
		 p.closePath();
		 p.moveTo(x+width/4, y-height/4);
		 p.lineTo(x+width/4, y+height/4);
		 p.lineTo(x-width/4, y+height/4);
		 p.lineTo(x-width/4, y-height/4);
		 
		 return p;
	 }
	 
	 
	 public void paint (Graphics g)
	 {
		 Graphics2D g2 = (Graphics2D) g;
		 g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		 
		 g2.clearRect(0, 0, getSize().width-1, getSize().height-1);
		 
		 g2.setColor(Color.YELLOW);
		 g2.fill(new Rectangle(70,70, 130,50));
		 
		 GeneralPath p;
		 
		 p = makeRect(100,80,50,50);
		 p.setWindingRule(GeneralPath.WIND_NON_ZERO);
		 g2.setColor(Color.BLUE);
		 g2.fill(p);
		 
		 
		 p = makeRect(200,80,50,50);
		 p.setWindingRule(GeneralPath.WIND_EVEN_ODD);
		 g2.setColor(Color.RED);
		 g2.fill(p);
	 }
	 
	 @SuppressWarnings("deprecation")
	public static void main(String args[])
	 {
		 JFrame f = new JFrame();
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 f.setSize(300,150);
		 f.show();
	 }
}
