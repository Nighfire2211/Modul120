package MeinPaket;

import javax.swing.JFrame;

public class Fenster extends JFrame
{
	public static void main(String[]args)
	{
		
	
	//JFrame fenster erstellen
	 JFrame fenster = new JFrame();
	 fenster.setSize(350, 500);
	 fenster.setTitle("Das Fenster zur Welt");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		fenster.setVisible(true);
	
	}
}
