import java.io.IOException;
import java.util.ArrayList;

public class Deck {

    private Nodo inicio;
    private int tamagno;

    public Deck() throws IOException {

        int n = 16;
        ArrayList<Cartas> cartas = Serializacion.getListaCartas();
        int totalCartas = cartas.size();

        for (int i = 0; i < n; i++) {
            int numero = (int) (Math.random() * (totalCartas-1)) + 1;

            Agregar(cartas.get(numero));
        }
    }

    public Cartas getCarta(){
        Cartas aux = inicio.getValor();
        EliminarElemento();
        return aux;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public void Agregar(Cartas carta){
        Nodo nuevo = new Nodo();
        nuevo.setValor(carta);

        if (esVacia()) {
            inicio = nuevo;

        } else {
            nuevo.setNext(inicio);
            inicio.setPrev(nuevo);
            inicio = nuevo;
        }

        tamagno++;
    }

    public void EliminarElemento(){

        if (!esVacia()){
            inicio = inicio.getNext();
            inicio.setPrev(null);
        }
    }

    public void listar() {

        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            System.out.println("\nLas cartas del Deck son ");

            while (aux != null && i < tamagno) {
                System.out.printf("[ %s ]", aux.getValor().getNombre());

                if (i != tamagno - 1) {
                    System.out.print(" <-> ");
                }

                aux = aux.getNext();
                i++;
            }
        }
    }

}
