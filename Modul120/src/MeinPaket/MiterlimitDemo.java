package MeinPaket;
import java.awt.*;
import java.awt.geom.*;

import javax.swing.JFrame;

import javax.swing.*;

 class MiterlimitDemo extends JFrame
{
	 public void paint( Graphics g)
	 {
		 Graphics2D g2 = (Graphics2D)g;
		 g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				 			RenderingHints.VALUE_ANTIALIAS_ON);
		 
		 BasicStroke stroke = new BasicStroke(15, BasicStroke.CAP_BUTT,
				 			BasicStroke.JOIN_MITER,1);
		 
		 g2.setStroke(stroke);
		 
		 g2.draw( new Rectangle2D.Float(50,50,50,50));
		 
		 
	 }
	public static void main(String[] args) 
	{
		JFrame f = new MiterlimitDemo();
		f.setSize(250,150);
		f.setVisible(true);

	}

}
