import javax.print.*;
import java.awt.print.PrinterException;
import java.io.*;

/**
 * Created by dimas on 09.12.17.
 */
public class PrintPostScript14 {
    public static void main(String[] args) throws FileNotFoundException, PrintException, PrinterException{
        DocFlavor flavor = DocFlavor.SERVICE_FORMATTED.PAGEABLE;
        String mimeType = "application/postscript";
        StreamPrintServiceFactory[] factories = StreamPrintServiceFactory.lookupStreamPrintServiceFactories(flavor, mimeType);
        OutputStream outputStream = new FileOutputStream("PostService.odd");
        StreamPrintService streamPrintService = factories[0].getPrintService(outputStream);

        InputStream inputStream = new FileInputStream("foto.jpg");
        DocPrintJob job = streamPrintService.createPrintJob();
        Doc doc = new SimpleDoc(inputStream, DocFlavor.INPUT_STREAM.JPEG, null);
        job.print(doc,null);
    }
}
