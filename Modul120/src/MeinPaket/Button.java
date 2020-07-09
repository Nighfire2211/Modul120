package MeinPaket;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Button extends JFrame
{

	public static void main(String[] args)
	{
		//JFrame fenster erstellen
		JFrame fenster = new JFrame();
		 fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		 
		 //JPanel erstellen
		 JPanel panel = new JPanel();
		 panel.setSize(400, 200);
		 
		 //JButtons blau 
		 JButton blau = new JButton("Blau");
		 blau.addActionListener(new ActionListener() 
		 {
			 public void actionPerformed(ActionEvent e) 
			 {
				 panel.setBackground(Color.blue);
			 }
			 
		 });
		 
		 //gelb
		 JButton gelb = new JButton("Gelb");
		 gelb.addActionListener(new ActionListener() 
		 {
			 public void actionPerformed(ActionEvent e) 
			 {
				 panel.setBackground(Color.yellow);
			 }
			 
		 });
		 
		 //grün
		 JButton gruen = new JButton("Grün");
		 gruen.addActionListener(new ActionListener() 
		 {
			 public void actionPerformed(ActionEvent e) 
			 {
				 panel.setBackground(Color.green);
			 }
			 
		 });
		 
		 panel.add(blau);
		 panel.add(gelb);
		 panel.add(gruen);
		 
		 fenster.getContentPane().add(panel);
		 fenster.pack();
		 fenster.setVisible(true);

	}

}
