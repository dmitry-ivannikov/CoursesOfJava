import javax.print.PrintException;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.FileNotFoundException;

/**
 * Created by dimas on 09.12.17.
 */
public class PrintGrapics2d {
    public static void main(String[] args) throws FileNotFoundException, PrintException {
        Printable printable = new Printable() {
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

                if(pageIndex == 0){
                Graphics2D graphics2D = (Graphics2D)graphics;
                Line2D line2D = new Line2D.Double(0,0,100,100);
                graphics2D.draw(line2D);
                graphics2D.draw(line2D);
                    return PAGE_EXISTS;

                }
                return NO_SUCH_PAGE;
            }
        };
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setPrintable(printable);
        if(printerJob.printDialog()){
            try {
                printerJob.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }
    }
}
