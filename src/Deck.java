import java.io.IOException;
import java.util.ArrayList;

public class Deck {

    private Nodo inicio;
    private int tamagno;

    public Deck() throws IOException {
        int n = 16;
        ArrayList<Cartas> cartas = Serializacion.getListaCartas();

        for(int i = 0; i<16;i++) {
            int numero = (int) (Math.random() * n) + 1;
            agregarAlFinal(cartas.get(numero));
        }
    }

    public int getTamagno() {
        return tamagno;
    }

    public boolean esVacia(){
        return inicio == null;
    }


    public void agregarAlFinal(Cartas valor) {

        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);

        if (esVacia()) {
            inicio = nuevo;

        } else if(tamagno==1){
            inicio.setNext(nuevo);
            inicio.setPrev(nuevo);
            nuevo.setNext(inicio);
            nuevo.setPrev(inicio);
        }
        else {
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

    public void listar(){
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            System.out.println("Las cartas del deck son ");

            while(aux != null && i<tamagno){
                System.out.print(String.format("[ %s ]", aux.getValor().getNombre()));

                if (i!=tamagno-1) {
                    System.out.print(" <-> ");
                }
                if((i+1)%2==0){
                    System.out.println("");
                }
                aux = aux.getNext();
                i++;
            }
        }
    }

    public Nodo getNodo(int posición){
        Nodo aux = inicio;

        int residuo = posición % getTamagno();
        //System.out.println(residuo);

        if (residuo == 0){
            return aux;
        } else {
            for (int i = 0; i < residuo; i++) {
                aux = aux.getNext();
            }
        }
        return aux;
    }


}