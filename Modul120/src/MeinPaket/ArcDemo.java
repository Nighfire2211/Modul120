package MeinPaket;

import java.awt.*;
import java.awt.geom.Arc2D;
import javax.swing.*;

public class PanelWithArc extends JPanel
{	
	
	
	protected void paintComponent(Graphics g)
{
	Shape arc = new Arc2D.Double(100, 100, 60, 60, 30, 120, Arc2D.PIE);
	
	((Graphics2D)g).draw(arc);
	
}


	public static void main(String[] args) 
	{
		JFrame f =new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,300);
		f.add(new PanelWithArc());
		f.setVisible(true);
	}

}
