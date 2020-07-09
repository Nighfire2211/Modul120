package MeinPaket;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.undo.*;

public class JComeUndone {

	public static void main(String[] args) 
	{
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final UndoManager undomanager = new UndoManager();
		
		final JTextArea textarea = new JTextArea(20,40);
		textarea.setText("Hier Zurück");
		f.getContentPane().add(new JScrollPane(textarea));
		textarea.getDocument().addUndoableEditListener(undomanager);
		
		undomanager.setLimit(1000);
		
		JButton undoB= new JButton("Undo");
		
		undoB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				undomanager.end();
				if(undomanager.canUndo())
					undomanager.undo();
				
				textarea.requestFocus();
			}
		});
		
		f.getContentPane().add(undoB,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);

	}

}
