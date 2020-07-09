package MeinPaket;
import java.io.*;
import java.awt.*;
import java.text.*;
import java.awt.image.*;
import com.sun.image.codec.jpeg.*;

 class CodecDemo 
{
	public static void main(String[] args) 
	{
		int n = 400;
		
		BufferedImage img = new BufferedImage(n,n,BufferedImage.TYPE_INT_RGB);
		
		Graphics g = img.getGraphics();
		
		g.setColor( Color.WHITE);
		g.fillRect(0,0, n-1, n-1);
		
		for ( int i=0; i< 100;i++)
		{
			g.setColor(new Color( (int) (Math.random()*256),
					(int) (Math.random()*256), (int) (Math.random()*256) ) );
			
			g.fillRect( (int) (Math.random()*n), (int) (Math.random()*n),
					(int) (Math.random()*n/2), (int) (Math.random()*n/2) );
		}
		
		g.dispose();
		
		int size = 0;
		
		for (float quality = 1f; quality >=0; quality -= 0.25)
		{
			ByteArrayOutputStream out = new ByteArrayOutputStream( 0xfff);
			JPEGImageEncoder encoder = new JPEGCodec.createJPEGEncoder( out);
			
			JPEGEncodeParam param;
			param = encoder.getDefaultJPEGEncodeParam(img);
			
			param.setQuality(quality, true);
			encoder.encode(img, param);
			
			FileOutputStream fos = new FileOutputStream( "JPG"+quality+".jpg");
			fos.write(out.toByteArray());
			fos.close();
			out.close();
			System.out.print( "Quality: "+quality+" Size: "+out.size()+"k "+"Ratio: ");
			
			size = (size==0) ? size = out.size() :size;
			
			DecimalFormat df = new DecimalFormat( "##.##%");
			float ratio = (float)out.size()/size;
			System.out.println(df.format (ratio));
		}

	}

	
}
