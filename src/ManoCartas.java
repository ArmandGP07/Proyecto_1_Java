import java.io.IOException;
import java.util.ArrayList;

public class ManoCartas {

    private Nodo inicio;
    private int tamagno;

    private Deck deck;

    public ManoCartas(Deck deck) throws IOException {
        int n = 4;

        for (int i = 0; i < n; i++) {
            agregarAlFinal(deck.getCarta());
        }
    }

    public void usarCarta(int posición, Usuario player, Usuario enemigo){
        Nodo aux = getNodo(posición);
        aux.getValor().UsarCarta(player, enemigo);
        eliminar(posición);
        agregarAlFinal(deck.getCarta());
    }

    public int getTamagno() {
        return tamagno;
    }

    public boolean esVacia() {
        return inicio == null;
    }


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

    public void eliminar(int n) {
        Nodo aux = getNodo(n - 1);
        Nodo nuevoSiguiente = aux.getNext().getNext();

        aux.setNext(nuevoSiguiente);
        nuevoSiguiente.setPrev(aux);

        tamagno--;
    }

    public Nodo getNodo(int posición) {
        Nodo aux = inicio;

        int residuo = posición % getTamagno();
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

    public void agregarPosicion(int posicion){
        Nodo nuevo = new Nodo();
        nuevo.setValor(deck.getCarta());

        Nodo aux = inicio;
        int i = 0;

        if (posicion==0){
            Nodo anterior = inicio.getPrev();
            anterior.setNext(nuevo);
            nuevo.setPrev(anterior);
            nuevo.setNext(inicio);
            inicio.setPrev(nuevo);
            nuevo.setNext(inicio);
            inicio = nuevo;
        }
        else {
            while (i < posicion) {
                aux = aux.getNext();

                if (i == 0) {
                    i++;
                }
            }
        }
    }

}