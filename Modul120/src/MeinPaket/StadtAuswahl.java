package MeinPaket;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class StadtAuswahl extends JFrame
{
	

	public static void main(String[] args) 
	{

		//JFrame fenster erstellen
		 JFrame fenster = new JFrame();
		 fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	

		
		 //JPanel erstellen
		 JPanel stadtauswahl = new JPanel();
		 stadtauswahl.setLayout(new GridBagLayout());
		 stadtauswahl.setBorder(new TitledBorder(new EmptyBorder(5,5,5,5), "Stadtauswahl"));
		 stadtauswahl.setSize(400,200);
		 stadtauswahl.setBackground(Color.yellow);
		 fenster.add(stadtauswahl);
		
		 //JCombobox erstellen
		 JComboBox comboBox = new JComboBox();
		 String staedte[]= {"Bern","Basel","Chur","Genf","St.Gallen","Zürich"};
	
		 for(int i = 0; i < staedte.length;i++)
		 {
			 comboBox.addItem(staedte[i]);
		 }
		 stadtauswahl.add(comboBox);

		 //Jlabel erstellen
		 JLabel labelText = new JLabel("Wählen Sie eine Stadt");
		 stadtauswahl.add(labelText);
		 
		 
		 	fenster.getContentPane().add(stadtauswahl);
			fenster.pack();
			fenster.setVisible(true);
		 
	}

}
