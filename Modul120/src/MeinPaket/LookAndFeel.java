package MeinPaket;

import javax.swing.*;

public class LookAndFeel 
{
	JFrame f = new JFrame();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	f.getContentPane().add(new JButton("Ask Dr.Bob"));
	f.pack();
	f.setVisible(true);

}
