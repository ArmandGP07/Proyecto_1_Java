import java.io.IOException;

public class Usuario {
    private String nombre;
    private int hp = 1000;
    private int mana = 200;
    private Deck deck;
    private String ip;


    public Usuario(String nombre) throws IOException {
        this.nombre=nombre;
        this.deck= new Deck();
    }

    public void CrearPartida(){}
    public void SalirsePartida(){}
    public void UnirsePartida(){}
    public void SeleccionarCarta(){}
    public void UsarCarta(){}

    public void EsperarTurno(){}

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
}
