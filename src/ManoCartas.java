import java.io.IOException;
import java.util.ArrayList;

/**
 * The type Mano cartas.
 */
public class ManoCartas {

    private Nodo inicio;
    private int tamagno;

    public void setTamagno(int tamagno) {
        this.tamagno = tamagno;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    private Deck deck;

    /**
     * Instantiates a new Mano cartas.
     *
     * @param deck the deck
     * @throws IOException the io exception
     */
    public ManoCartas(Deck deck) throws IOException {
        int n = 4;

        for (int i = 0; i < n; i++) {
            agregarAlFinal(deck.getCarta());
        }
    }


    public ManoCartas(){}

    /**
     * Usar carta.
     *
     * @param posicion the posicion
     * @param player   the player
     * @param enemigo  the enemigo
     */
    public void usarCarta(int posicion, Usuario player, Usuario enemigo){
        Nodo aux = getNodo(posicion);
        aux.getValor().UsarCarta(player, enemigo);
        eliminar(posicion);

        agregarPosicion(posicion);

    }

    /**
     * Gets tamagno.
     *
     * @return the tamagno
     */
    public int getTamagno() {
        return tamagno;
    }

    /**
     * Es vacia boolean.
     *
     * @return the boolean
     */
    public boolean esVacia() {
        return inicio == null;
    }


    /**
     * Agregar al final.
     *
     * @param valor the valor
     */
    public void agregarAlFinal(Cartas valor) {

        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);

        if (esVacia()) {
            inicio = nuevo;

        } else if (tamagno == 1) {
            inicio.setNext(nuevo);
            inicio.setPrev(nuevo);
            nuevo.setNext(inicio);
            nuevo.setPrev(inicio);
        } else {
            Nodo aux = inicio;

            while (aux.getNext() != inicio) {
                aux = aux.getNext();
            }
            aux.setNext(nuevo);
            nuevo.setPrev(aux);
            nuevo.setNext(inicio);
            inicio.setPrev(nuevo);
        }
        tamagno++;
    }

    /**
     * Listar.
     */
    public void listar() {
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            System.out.println("\nLas cartas de la mano son ");

            while (aux != null && i < tamagno) {
                System.out.printf("[ %s ]", aux.getValor().getNombre());

                if (i != tamagno - 1) {
                    System.out.print(" <-> ");
                }

                aux = aux.getNext();
                i++;
            }
            System.out.println("");
        }
    }

    /**
     * Eliminar nodo.
     *
     * @param carta the carta
     */
    public void eliminarNodo(Cartas carta) {
        Nodo aux = inicio;
        boolean indicador = true;

        while (indicador) {
            aux = aux.getNext();

            if (aux.getNext().getValor() == carta) {
                Nodo nuevoSiguiente = aux.getNext().getNext();

                aux.setNext(nuevoSiguiente);
                nuevoSiguiente.setPrev(aux);

                indicador = false;
                tamagno--;
                break;
            }

        }
    }

    /**
     * Eliminar.
     *
     * @param n the n
     */
    public void eliminar(int n) {
        Nodo aux = getNodo(n - 1);
        Nodo nuevoSiguiente = aux.getNext().getNext();

        aux.setNext(nuevoSiguiente);
        nuevoSiguiente.setPrev(aux);

        tamagno--;
    }

    /**
     * Gets nodo.
     *
     * @param posicion the posicion
     * @return the nodo
     */
    public Nodo getNodo(int posicion) {
        Nodo aux = inicio;


        if (posicion==0){
            return aux;
        }


        int residuo = posicion % getTamagno();
        //System.out.println(residuo);

        if (residuo == 0) {
            return aux;
        } else {
            for (int i = 0; i < residuo; i++) {
                aux = aux.getNext();
            }
        }
        return aux;
    }

    /**
     * Agregar posicion.
     *
     * @param posicion the posicion
     */
    public void agregarPosicion(int posicion){
        Nodo nuevo = new Nodo();

        Cartas carta = deck.getCarta();
        nuevo.setValor(carta);


        Nodo aux = inicio;
        int i = 0;

        if (posicion==0){


            Nodo finale = inicio.getPrev();

            finale.setNext(nuevo);
            nuevo.setPrev(finale);

            nuevo.setNext(inicio);
            inicio.setPrev(nuevo);

            inicio = nuevo;
            tamagno++;
        }
        else if (posicion==1 ||  posicion==2) {

            while (i < posicion) {
                aux = aux.getNext();
                Nodo auxAnterior = aux.getPrev();

                aux.setPrev(nuevo);
                nuevo.setNext(aux);

                auxAnterior.setNext(nuevo);
                nuevo.setPrev(auxAnterior);

                i++;

                if (i==posicion){
                    tamagno++;
                }
            }
        }

        else{
            agregarAlFinal(nuevo.getValor());
        }

    }

}