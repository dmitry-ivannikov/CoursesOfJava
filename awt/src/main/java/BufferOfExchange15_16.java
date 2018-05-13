import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by dimas on 09.12.17.
 */
public class BufferOfExchange15_16 {
    public static void main(String[] args) throws IOException, UnsupportedFlavorException, InterruptedException {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

        Image image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.getGraphics();
        g.fillOval(0, 0, 100, 100);

        //StringSelection stringSelection = new StringSelection("asdasd");
        ImageTransferable stringSelection = new ImageTransferable(image);
        clipboard.setContents(stringSelection,null);


       // Thread.sleep(100000);
//        DataFlavor flavor = DataFlavor.stringFlavor;
//        clipboard.getData(flavor);
//        if (clipboard.isDataFlavorAvailable(flavor));
//        System.out.println(clipboard.getData(flavor)) ;

        DataFlavor flavor = DataFlavor.imageFlavor;

        if (clipboard.isDataFlavorAvailable(flavor));
            Image img = (Image) clipboard.getData(flavor);
    }
}

class ImageTransferable implements Transferable{
    private Image theImage;
    public ImageTransferable(Image image)
    {
        theImage = image;
    }
    public DataFlavor[] getTransferDataFlavors(){
        return new DataFlavor[] {DataFlavor.imageFlavor};
    }
    public boolean isDataFlavorSupported(DataFlavor flavor){
        return flavor.equals(DataFlavor.imageFlavor);
    }
    public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException{
        if (flavor.equals(DataFlavor.imageFlavor)){
            return theImage;
        }else{
            throw new UnsupportedFlavorException(flavor);
        }
    }
}
