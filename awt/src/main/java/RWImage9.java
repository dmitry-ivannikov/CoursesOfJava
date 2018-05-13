import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/**
 * Created by dimas on 08.12.17.
 */
public class RWImage9 {
    public static void main(String[] args) throws IOException{
        File file = new File("foto.jpg");
        BufferedImage image = ImageIO.read(file);
        ImageIO.write(image, "png",  new File("smile.png"));

        String[] extentions = ImageIO.getReaderFileSuffixes();
        for (String str : extentions){
            System.out.println(str);
        }

        ImageReader reader = null;
        Iterator<ImageReader> iterator = ImageIO.getImageReadersByFormatName("jpg");
        if(iterator.hasNext()) reader = iterator.next();

        InputStream inputStream = new FileInputStream(new File("foto.jpg"));
        ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream);
        ImageInputStream imageInputStream1 = ImageIO.createImageInputStream(new File ("foto.jpg"));
        reader.setInput(imageInputStream, true);
        BufferedImage image1 = reader.read(reader.getNumImages(true));

        int count = reader.getNumThumbnails(0);
        BufferedImage image2 = reader.readThumbnail(0, count);
        System.out.println(reader.getHeight(0));
        reader.getWidth(0);

        ImageWriter writer = null;
        Iterator<ImageWriter> iterator1 = ImageIO.getImageWritersByFormatName("jpg");
        if(iterator1.hasNext()) writer = iterator1.next();

        ImageOutputStream imageOutputStream = ImageIO.createImageOutputStream(new File("foto.jpg"));
        writer.setOutput(imageOutputStream);




    }
}
