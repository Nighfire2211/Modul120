package MeinPaket;

import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Bedienelemente extends JFrame
{

	public static void main(String[] args) 
	{
		//JFrame fenster erstellen
		 JFrame fenster = new JFrame();
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	
		
		//JPanel Bedienelemente erstellen
		JPanel bedienelemente = new JPanel();
		bedienelemente.setLayout(new GridBagLayout());
		bedienelemente.setBorder(new TitledBorder(new EmptyBorder(5,5,5,5), "Bedienelemente"));
		bedienelemente.setSize(800,500);
		
	
		
		//JButton erstellen
		JButton start = new JButton();
		start.setSize(100, 50);
		start.setText("start");
		start.setLocation(10,10);
		bedienelemente.add(start);
		
		//JLabel erstellen
		JLabel label = new JLabel();
		label.setText("home is my new Castle");
		label.setHorizontalAlignment(JLabel.CENTER);
		bedienelemente.add(label);
		
		//JTextfield erstellen
		JTextField text = new JTextField("GUI-Programmierung mit JAVA ist super!",70);
		text.setBounds(10,30,200,20);
		text.setLocation(25, 75);;
		bedienelemente.add(text);
		
		
		//JTextArea erstellen
		JTextArea textarea = new JTextArea(6,25);
	
		textarea.setText("Lorem ipsum dolor sit amet,"
				+ " consetetur sadipscing elitr,"
				+ " sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, "
				+ "sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum."
				);
		
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setLocation(10, 200);
		bedienelemente.add(textarea);
		
		fenster.getContentPane().add(bedienelemente);
		fenster.pack();
		fenster.setVisible(true);
	}

}
