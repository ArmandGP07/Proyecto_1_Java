import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * The type Cartas.
 */
public class Cartas{
    private String nombre;
    private int costoMana;

    private String pathImage;



    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String icon) {
        this.pathImage = icon;
    }


    /**
     * Instantiates a new Cartas.
     *
     * @param nombre    the nombre
     * @param costoMana the costo mana
     */
    public Cartas(String nombre, int costoMana){ //throws IOException {
        this.nombre =nombre;
        this.costoMana =costoMana;
         this.pathImage = new String(String.format("src/resources/Cartas/%s.png", nombre));
    }

    /**
     * Instantiates a new Cartas.
     */
    public Cartas(){}

    /**
     * Usar carta.
     *
     * @param usuario the usuario
     * @param enemigo the enemigo
     */
    public void UsarCarta(Usuario usuario, Usuario enemigo){}

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets costo mana.
     *
     * @return the costo mana
     */
    public int getCostoMana() {
        return costoMana;
    }

    /**
     * Sets costo mana.
     *
     * @param costoMana the costo mana
     */
    public void setCostoMana(int costoMana) {
        this.costoMana = costoMana;

    }
}
