import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Usuario {
    private String nombre;
    private int hp = 1000;
    private int mana = 200;
    private Deck deck;
    private String ip;
    private ServerClient serverPlayer;

    private Usuario enemigo = null;

    private Cartas cartaSeleccionada = null;
    private int puerto = 50001;

    public Usuario(String nombre) throws IOException {
        this.nombre = nombre;
        this.deck = new Deck();
        this.ip = InetAddress.getLocalHost().getHostAddress();

    }

    public void CrearPartida(int puerto) {
        setPuerto(puerto);
        serverPlayer = new ServerClient(this, ip, puerto);


        Thread t1 = new Thread(serverPlayer);
        t1.start();



    }



    public void UnirsePartida() {

    }


    public void enviarSocket(int puerto) {
        //Se guarda el valor del puerto especificado en un int


        String enemigoIP = "127.0.0.1";

        //int puerto = Integer.parseInt(puerto.getText());
        //String enemigoIP = puerto.getText();

        try {
            //Se crea un nuevo socket para enviar la información
            Socket socket = new Socket(enemigoIP, puerto);

            String cartaUsada = Serializacion.serializar(cartaSeleccionada);

            //Se crea un flujo de datos de salida para enviar los datos recibidos
            DataOutputStream informacionSalida = new DataOutputStream(socket.getOutputStream());
            informacionSalida.writeUTF(cartaUsada);
            socket.close();

        } catch (UnknownHostException unknownHostException) {
            unknownHostException.printStackTrace();
            System.out.println("UnknownHostException cliente");
        } catch (IOException ioException) {
            System.out.println("IOException cliente");

        }

    }

    public void SalirsePartida() {
    }

    public void SeleccionarCarta() {
    }

    public void UsarCarta(int puertoEnemigo) {
        System.out.printf("El usuario %s ha utilizado una carta de %s contra %s%n", nombre, cartaSeleccionada.getNombre(), enemigo.getNombre());
        cartaSeleccionada.UsarCarta(this, enemigo);
        enviarSocket(puertoEnemigo);

    }

    public void EsperarTurno() {
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Usuario getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Usuario enemigo) {
        this.enemigo = enemigo;
    }

    public Cartas getCartaSeleccionada() {
        return cartaSeleccionada;
    }

    public void setCartaSeleccionada(Cartas cartaSeleccionada) {
        this.cartaSeleccionada = cartaSeleccionada;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

}
