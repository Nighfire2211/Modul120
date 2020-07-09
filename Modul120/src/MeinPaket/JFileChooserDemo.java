package MeinPaket;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UIManager;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

public class JFileChooserDemo
{
	public static void main( String args[] )
	{
		UIManager.put( "FileChooser.lookInLabelText" ,"Worin'e suchen tust:" );
		JFileChooser fc = new JFileChooser();fc.setFileFilter( new FileFilter()
		{
			public boolean accept( File f ) 
			{
				return f.isDirectory() ||f.getName().toLowerCase().endsWith( ".txt" );
			}
			
			public String getDescription() 
			{
				return "Texte";	
			}
		});
		
		int returnVal = fc.showOpenDialog( null );
		if ( returnVal == JFileChooser.APPROVE_OPTION )
		{
			File file = fc.getSelectedFile();System.out.println( file.getName() );
			}
		else
			{
			System.out.println( "Auswahl abgebrochen" );
			System.exit( 0 );}
		}
	
}