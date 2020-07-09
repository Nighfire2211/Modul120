package MeinPaket;
import java.awt.*;
import java.io.*;
import java.net.*;

public class giftest 
{
	public static void main(String[] args) throws Exception
	{
		if (args.length != 2)
		{
			System.out.println("giftest [url to load] [output file] ");
			return;
		}

	
	
	Frame f = new Frame("GIFTest");
	Image image = f.getToolkit().getImage(new URL(args [0]));
	
	MediaTracker tracker = new MediaTracker(f);
	tracker.addimage(image, 0);
	try
		tracker.waitForID(0);
	catch(InterruptedException e);
	if (tracker.statusID(0,true) != MediaTracker.COMPLETE)
		throw new AWTException("Could not load: "+args[0]+" "+tracker.statusID(0,true));
			
	GIFEncoder encode = new GIFEncoder(image);
	OutputStream output = new BufferedOutputStream(
			new FileOutStream(args[1]));
			
	encode.Write(output);
			System.exit(0);

			
	}
}
