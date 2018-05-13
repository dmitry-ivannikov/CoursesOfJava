import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.File;

/**
 * Created by dimas on 09.12.17.
 */
public class ImageFilter11 {
    public static void main(String[] args) throws Exception{
        File file = new File("foto.jpg");
        BufferedImage image = ImageIO.read(file);

        BufferedImage imageFiltered = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        AffineTransform affineTransform = AffineTransform.getRotateInstance(45,image.getWidth()/2, image.getHeight()/2);

        BufferedImageOp bufferedImageOp =  new AffineTransformOp(affineTransform, AffineTransformOp.TYPE_BILINEAR);
        bufferedImageOp.filter(image, imageFiltered);

        ImageIO.write(imageFiltered, "png", new File("foto.png"));
    }
}
