package MeinPaket;
import java.awt.*;
import javax.swing.*;

public class ClipDemo extends JPanel 
{
	protected void paintComponent( Graphics g)
	{
		super.paintComponent(g);
		Graphics gcopy = g.create();
		
		//Clipping auf
		
		g.clipRect(100,100,100,100);
		g.setColor(Color.ORANGE);
		g.fillRect(0, 0, 500, 500);
		g.setColor(Color.BLACK);
		g.drawOval(150, 100, 100, 100);
		
		//Zweiter Clipping-Bereich
		
		g.clipRect(250, 250, 50, 50);
		g.setColor(Color.BLUE);
		g.fillRect(0,0,5000,5000);
		
		//Die ursprüngliche Grösse zurücksetzen
		
		gcopy.setColor( Color.YELLOW);
		gcopy.fillRect(50, 50, 20, 50);
	}

	public static void main(String[] args) 
	{
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.add(new ClipDemo());
		f.setVisible(true);

	}

}
