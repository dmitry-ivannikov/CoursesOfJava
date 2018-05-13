import javax.print.*;
import java.awt.print.PrinterException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by dimas on 09.12.17.
 */
public class PrintPhotoOrText13 {
    public static void main(String[] args) throws FileNotFoundException, PrintException, PrinterException{
        DocFlavor flavor = DocFlavor.INPUT_STREAM.JPEG;
        javax.print.PrintService[] service = PrintServiceLookup.lookupPrintServices(flavor, null);
        InputStream inputStream = new FileInputStream("foto.jpg");
        Doc doc = new SimpleDoc(inputStream, flavor,null);
        if(service.length > 0){
            DocPrintJob job = service[0].createPrintJob();
            job.print(doc, null);
        }
    }
}
