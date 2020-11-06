import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageReader{
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

    public static void main(String[] args) {
        new ImageReader();
    }
}

