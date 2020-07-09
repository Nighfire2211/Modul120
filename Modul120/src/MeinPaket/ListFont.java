package MeinPaket;
import java.awt.*;

class ListFont 
{
	public static void main( String args [] )
	{
		for ( String fonts: GraphicsEnvironment.getLocalGraphicsEnvironment().
				getAvailableFontFamilyNames() )
			System.out.println(fonts);
			
	}
}
