import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Usuario {
    private String nombre;
    private int hp = 1000;
    private int mana = 200;
    private ManoCartas manoCartas;
    private Deck deck;
    private String ip;
    private ServerClient serverPlayer;
    private boolean partidaCreada = false;

    private final int maxHP = 1000;
    private final int maxMana = 1000;
    private int regenMana = 25;

    private boolean poderSupremo=false;
    private boolean maldicionActiva=false;
    private boolean congelado=false;
    private boolean envenenado=false;
    private boolean quemado=false;
    private boolean regeneracionHP=false;
    private boolean robandoCartas=false;
    private boolean escudoActivo=false;



    private Usuario enemigo = null;

    private Cartas cartaSeleccionada = null;
    private int puerto;

    public Usuario(){}

    public Usuario(String nombre) throws IOException {
        this.nombre = nombre;
        this.deck = new Deck();
        this.manoCartas = new ManoCartas(deck);
        this.ip = InetAddress.getLocalHost().getHostAddress();

    }

    public void CrearPartida(int puerto) {
        setPuerto(puerto);
        serverPlayer = new ServerClient(this, ip, puerto);
        partidaCreada=true;

        Thread t1 = new Thread(serverPlayer);
        t1.start();
    }



    public void UnirsePartida(int puerto) {
        //Se guarda el valor del puerto especificado en un int
        String enemigoIP = "127.0.0.1";
        if (!partidaCreada) {
            CrearPartida(puerto + 1);
        }
        //int puerto = Integer.parseInt(puerto.getText());
        //String enemigoIP = puerto.getText();

        try {
            //Se crea un nuevo socket para enviar la información
            Socket socket = new Socket(enemigoIP, puerto);

            String usuarioEnvio = Serializacion.serializarUsuario(this);

            //Se crea un flujo de datos de salida para enviar los datos recibidos
            DataOutputStream informacionSalida = new DataOutputStream(socket.getOutputStream());
            informacionSalida.writeUTF(usuarioEnvio);
            System.out.println("Conectandose al servidor");
            socket.close();

        } catch (UnknownHostException unknownHostException) {
            unknownHostException.printStackTrace();
            System.out.println("UnknownHostException cliente");
        } catch (IOException ioException) {
            System.out.println("IOException cliente");

        }
    }


    public void enviarSocket(int puerto) {
        //Se guarda el valor del puerto especificado en un int


        String enemigoIP = "127.0.0.1";

        //int puerto = Integer.parseInt(puerto.getText());
        //String enemigoIP = puerto.getText();

        try {
            //Se crea un nuevo socket para enviar la información
            Socket socket = new Socket(enemigoIP, puerto);

            String cartaUsada = Serializacion.serializarCarta(cartaSeleccionada);

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
        System.out.printf("El usuario %s ha utilizado una carta de %s contra %s", nombre, manoCartas.getNodo(puertoEnemigo).getValor().getNombre(), enemigo.getNombre());
        //cartaSeleccionada.UsarCarta(this, enemigo);

        manoCartas.usarCarta(puertoEnemigo, this, enemigo);

        //enviarSocket(puertoEnemigo);

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

    public ManoCartas getManoCartas() {
        return manoCartas;
    }

    public void setManoCartas(ManoCartas manoCartas) {
        this.manoCartas = manoCartas;
    }

    public boolean isPartidaCreada() {
        return partidaCreada;
    }

    public void setPartidaCreada(boolean partidaCreada) {
        this.partidaCreada = partidaCreada;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public int getRegenMana() {
        return regenMana;
    }

    public void setRegenMana(int regenMana) {
        this.regenMana = regenMana;
    }

    public boolean isPoderSupremo() {
        return poderSupremo;
    }

    public void setPoderSupremo(boolean poderSupremo) {
        this.poderSupremo = poderSupremo;
    }

    public boolean isMaldicionActiva() {
        return maldicionActiva;
    }

    public void setMaldicionActiva(boolean maldicionActiva) {
        this.maldicionActiva = maldicionActiva;
    }

    public boolean isCongelado() {
        return congelado;
    }

    public void setCongelado(boolean congelado) {
        this.congelado = congelado;
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public void setEnvenenado(boolean envenenado) {
        this.envenenado = envenenado;
    }

    public boolean isQuemado() {
        return quemado;
    }

    public void setQuemado(boolean quemado) {
        this.quemado = quemado;
    }

    public boolean isRegeneracionHP() {
        return regeneracionHP;
    }

    public void setRegeneracionHP(boolean regeneracionHP) {
        this.regeneracionHP = regeneracionHP;
    }

    public boolean isRobandoCartas() {
        return robandoCartas;
    }

    public void setRobandoCartas(boolean robandoCartas) {
        this.robandoCartas = robandoCartas;
    }

    public boolean isEscudoActivo() {
        return escudoActivo;
    }

    public void setEscudoActivo(boolean escudoActivo) {
        this.escudoActivo = escudoActivo;
    }
}
