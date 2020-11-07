import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * The type Image reader.
 */
public class ImageReader{
    /**
     * Instantiates a new Image reader.
     */
    public ImageReader() {
        try {
            BufferedImage imageSad = ImageIO.read(new File("src/resources/sad.png"));
            var imageSadSource = imageSad.getSource();

            if (!imageSadSource.equals(imageSad)) {
            } else {
                ;
            }
            System.out.println("xd");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        new ImageReader();
    }
}

