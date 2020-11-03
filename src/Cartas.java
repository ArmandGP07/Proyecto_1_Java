import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Cartas{
    private String nombre;
    private int costoMana;
    ///private BufferedImage imagen;



    public Cartas(String nombre, int costoMana){ //throws IOException {
        this.nombre=nombre;
        this.costoMana=costoMana;
        //this.imagen= ImageIO.read(new File(imagen));
    }

    public Cartas() {}

    public void UsarCarta(Usuario usuario, Usuario enemigo){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCostoMana() {
        return costoMana;
    }

    public void setCostoMana(int costoMana) {
        this.costoMana = costoMana;

    }
}
