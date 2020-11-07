
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * The type Usuario.
 */
public class Usuario {
    private String nombre;
    private int hp = 1000;
    private int mana = 200;
    private ManoCartas manoCartas;
    private Deck deck;
    private String ip;
    private ServerClient serverPlayer;
    private boolean partidaCreada = false;
    private int posicionCarataSeleccinada;
    private boolean conectado = false;
    private boolean turno = false;
    private boolean enemy = false;

    private final int maxHP = 1000;
    private final int maxMana = 1000;
    private int regenMana = 25;

    private boolean poderSupremo = false;
    private boolean maldicionActiva = false;
    private boolean congelado = false;
    private boolean envenenado = false;
    private boolean quemado = false;
    private boolean regeneracionHP = false;
    private boolean robandoCartas = false;
    private boolean escudoActivo = false;


    private Usuario enemigo = null;

    private Cartas cartaSeleccionada = null;
    private int puerto;

    /**
     * Instantiates a new Usuario.
     */
    public Usuario() {
    }

    /**
     * Instantiates a new Usuario.
     *
     * @param nombre the nombre
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
        try {
            this.deck = new Deck();
            this.manoCartas = new ManoCartas(deck);
            this.ip = InetAddress.getLocalHost().getHostAddress();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Crear partida.
     *
     * @param puerto the puerto
     */
    public void CrearPartida(int puerto) {
        setPuerto(puerto);
        serverPlayer = new ServerClient(this, ip, puerto);
        partidaCreada = true;

        Thread t1 = new Thread(serverPlayer);
        t1.start();
    }


    /**
     * Unirse partida.
     *
     * @param direccionIP the direccion ip
     * @param puerto      the puerto
     */
    public void UnirsePartida(String direccionIP, int puerto) {
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


    /**
     * Enviar socket.
     *
     * @param puerto the puerto
     */
    public void enviarSocket(int puerto) {
        //Se guarda el valor del puerto especificado en un int


        String enemigoIP = "127.0.0.1";

        //int puerto = Integer.parseInt(puerto.getText());
        //String enemigoIP = puerto.getText();

        try {
            //Se crea un nuevo socket para enviar la información
            Socket socket = new Socket(enemigoIP, puerto);

            String cartaUsada = Serializacion.serializarCarta(cartaSeleccionada);
            cartaUsada = String.format("%d%s", posicionCarataSeleccinada, Serializacion.serializarCarta(cartaSeleccionada));

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

    /**
     * Salirse partida.
     */
    public void SalirsePartida() {
    }

    /**
     * Seleccionar carta.
     */
    public void SeleccionarCarta() {
    }

    /**
     * Usar carta.
     *
     * @param puertoEnemigo the puerto enemigo
     */
    public void UsarCarta(int puertoEnemigo) {
        System.out.printf("El usuario %s ha utilizado una carta de %s contra %s", nombre, manoCartas.getNodo(puertoEnemigo).getValor().getNombre(), enemigo.getNombre());
        //cartaSeleccionada.UsarCarta(this, enemigo);

        manoCartas.usarCarta(posicionCarataSeleccinada, this, enemigo);
        if (turno || !enemy) {
            enviarSocket(puertoEnemigo);
        }
    }

    /**
     * Esperar turno.
     */
    public void EsperarTurno() {
    }

    /**
     * Gets ip.
     *
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets ip.
     *
     * @param ip the ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

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
     * Gets hp.
     *
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * Sets hp.
     *
     * @param hp the hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * Gets mana.
     *
     * @return the mana
     */
    public int getMana() {
        return mana;
    }

    /**
     * Sets mana.
     *
     * @param mana the mana
     */
    public void setMana(int mana) {
        this.mana = mana;
    }

    /**
     * Gets deck.
     *
     * @return the deck
     */
    public Deck getDeck() {
        return deck;
    }

    /**
     * Sets deck.
     *
     * @param deck the deck
     */
    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    /**
     * Gets enemigo.
     *
     * @return the enemigo
     */
    public Usuario getEnemigo() {
        return enemigo;
    }

    /**
     * Sets enemigo.
     *
     * @param enemigo the enemigo
     */
    public void setEnemigo(Usuario enemigo) {
        this.enemigo = enemigo;
    }

    /**
     * Gets carta seleccionada.
     *
     * @return the carta seleccionada
     */
    public Cartas getCartaSeleccionada() {
        return cartaSeleccionada;
    }

    /**
     * Sets carta seleccionada.
     *
     * @param cartaSeleccionada the carta seleccionada
     */
    public void setCartaSeleccionada(Cartas cartaSeleccionada) {
        this.cartaSeleccionada = cartaSeleccionada;
    }

    /**
     * Gets puerto.
     *
     * @return the puerto
     */
    public int getPuerto() {
        return puerto;
    }

    /**
     * Sets puerto.
     *
     * @param puerto the puerto
     */
    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    /**
     * Gets mano cartas.
     *
     * @return the mano cartas
     */
    public ManoCartas getManoCartas() {
        return manoCartas;
    }

    /**
     * Sets mano cartas.
     *
     * @param manoCartas the mano cartas
     */
    public void setManoCartas(ManoCartas manoCartas) {
        this.manoCartas = manoCartas;
    }

    /**
     * Is partida creada boolean.
     *
     * @return the boolean
     */
    public boolean isPartidaCreada() {
        return partidaCreada;
    }

    /**
     * Sets partida creada.
     *
     * @param partidaCreada the partida creada
     */
    public void setPartidaCreada(boolean partidaCreada) {
        this.partidaCreada = partidaCreada;
    }

    /**
     * Gets max hp.
     *
     * @return the max hp
     */
    public int getMaxHP() {
        return maxHP;
    }

    /**
     * Gets max mana.
     *
     * @return the max mana
     */
    public int getMaxMana() {
        return maxMana;
    }

    /**
     * Gets regen mana.
     *
     * @return the regen mana
     */
    public int getRegenMana() {
        return regenMana;
    }

    /**
     * Sets regen mana.
     *
     * @param regenMana the regen mana
     */
    public void setRegenMana(int regenMana) {
        this.regenMana = regenMana;
    }

    /**
     * Is poder supremo boolean.
     *
     * @return the boolean
     */
    public boolean isPoderSupremo() {
        return poderSupremo;
    }

    /**
     * Sets poder supremo.
     *
     * @param poderSupremo the poder supremo
     */
    public void setPoderSupremo(boolean poderSupremo) {
        this.poderSupremo = poderSupremo;
    }

    /**
     * Is maldicion activa boolean.
     *
     * @return the boolean
     */
    public boolean isMaldicionActiva() {
        return maldicionActiva;
    }

    /**
     * Sets maldicion activa.
     *
     * @param maldicionActiva the maldicion activa
     */
    public void setMaldicionActiva(boolean maldicionActiva) {
        this.maldicionActiva = maldicionActiva;
    }

    /**
     * Is congelado boolean.
     *
     * @return the boolean
     */
    public boolean isCongelado() {
        return congelado;
    }

    /**
     * Sets congelado.
     *
     * @param congelado the congelado
     */
    public void setCongelado(boolean congelado) {
        this.congelado = congelado;
    }

    /**
     * Is envenenado boolean.
     *
     * @return the boolean
     */
    public boolean isEnvenenado() {
        return envenenado;
    }

    /**
     * Sets envenenado.
     *
     * @param envenenado the envenenado
     */
    public void setEnvenenado(boolean envenenado) {
        this.envenenado = envenenado;
    }

    /**
     * Is quemado boolean.
     *
     * @return the boolean
     */
    public boolean isQuemado() {
        return quemado;
    }

    /**
     * Sets quemado.
     *
     * @param quemado the quemado
     */
    public void setQuemado(boolean quemado) {
        this.quemado = quemado;
    }

    /**
     * Is regeneracion hp boolean.
     *
     * @return the boolean
     */
    public boolean isRegeneracionHP() {
        return regeneracionHP;
    }

    /**
     * Sets regeneracion hp.
     *
     * @param regeneracionHP the regeneracion hp
     */
    public void setRegeneracionHP(boolean regeneracionHP) {
        this.regeneracionHP = regeneracionHP;
    }

    /**
     * Is robando cartas boolean.
     *
     * @return the boolean
     */
    public boolean isRobandoCartas() {
        return robandoCartas;
    }

    /**
     * Sets robando cartas.
     *
     * @param robandoCartas the robando cartas
     */
    public void setRobandoCartas(boolean robandoCartas) {
        this.robandoCartas = robandoCartas;
    }

    /**
     * Is escudo activo boolean.
     *
     * @return the boolean
     */
    public boolean isEscudoActivo() {
        return escudoActivo;
    }

    /**
     * Sets escudo activo.
     *
     * @param escudoActivo the escudo activo
     */
    public void setEscudoActivo(boolean escudoActivo) {
        this.escudoActivo = escudoActivo;
    }

    /**
     * Gets posicion carata seleccinada.
     *
     * @return the posicion carata seleccinada
     */
    public int getPosicionCarataSeleccinada() {
        return posicionCarataSeleccinada;
    }

    /**
     * Sets posicion carata seleccinada.
     *
     * @param posicionCarataSeleccinada the posicion carata seleccinada
     */
    public void setPosicionCarataSeleccinada(int posicionCarataSeleccinada) {
        this.posicionCarataSeleccinada = posicionCarataSeleccinada;
    }

    /**
     * Is conectado boolean.
     *
     * @return the boolean
     */
    public boolean isConectado() {
        return conectado;
    }

    /**
     * Sets conectado.
     *
     * @param conectado the conectado
     */
    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    /**
     * Is turno boolean.
     *
     * @return the boolean
     */
    public boolean isTurno() {
        return turno;
    }

    /**
     * Sets turno.
     *
     * @param turno the turno
     */
    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    /**
     * Is enemy boolean.
     *
     * @return the boolean
     */
    public boolean isEnemy() {
        return enemy;
    }

    /**
     * Sets enemy.
     *
     * @param enemy the enemy
     */
    public void setEnemy(boolean enemy) {
        this.enemy = enemy;
    }
}