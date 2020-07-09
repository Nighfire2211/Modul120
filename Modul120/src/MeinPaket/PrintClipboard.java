package MeinPaket;
import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.io.IOException;

public class PrintClipboard {

	public static void main(String[] args) throws UnsupportedFlavorException, IOException 
	{
		Clipboard systemClipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
		
		Transferable transferData= systemClipboard.getContents(null);
		
		DataFlavor dataFlavor[]=transferData.getTransferDataFlavors();
		
		Object content = transferData.getTransferData(dataFlavor[1]);
		System.out.println(content);
	}

}
