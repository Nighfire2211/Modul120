package MeinPaket;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Menu extends JFrame
{

	public static void main(String[] args)
	{
		//JFrame fenster erstellen
				JFrame fenster = new JFrame();
				 fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
				 
		
		//Jpanel erstellen
				 JPanel bearbeiten = new JPanel();
				 bearbeiten.setLayout(new GridBagLayout());
				 bearbeiten.setBorder(new TitledBorder(new EmptyBorder(5,5,5,5), "Bearbeiten"));
				 bearbeiten.setSize(400,300);
				 fenster.add(bearbeiten);
				 
				 
				 //JMenubar erstellen
				 JMenuBar menubar = new JMenuBar();
				 
				 //Jmenu ausschneiden
				JMenu ausschneiden = new  JMenu("Ausschneiden");
				 ActionListener al1 =new ActionListener() 
				 {
					 public void actionPerformed(ActionEvent e) 
					 {
						 JLabel ausschnitt = new JLabel("Ausscheiden wurde gewählt");
						 bearbeiten.add(ausschnitt);
					 }
					 
				 };
				ausschneiden.addActionListener(al1); 
				 
				 //Jmenu kopieren
					JMenu kopieren = new  JMenu("Kopieren");
					 ActionListener al2 = new ActionListener()
					 {
				 		public void actionPerformed(ActionEvent e) 
				 		{
				 			JLabel kopie = new JLabel("Kopieren wurde gewählt");
				 			bearbeiten.add(kopie);
				 		}
				 
				 };
				 kopieren.addActionListener(al2);
					 
					 //Jmenu ausschneiden
						JMenu einfügen = new  JMenu("Einfügen");
						ActionListener al3 = new ActionListener()
						{
					 		public void actionPerformed(ActionEvent e) 
					 		{
					 			JLabel einfug = new JLabel("Einfügen wurde gewählt");
					 			bearbeiten.add(einfug);
					 		}
						};
						einfügen.addActionListener(al3);
						
						 
				 menubar.add(ausschneiden);
				 menubar.add(kopieren);
				 menubar.add(einfügen);
				 bearbeiten.add(menubar);
				 
				 
				 fenster.getContentPane().add(bearbeiten);
				 fenster.pack();
				 fenster.setVisible(true);

	}

}
