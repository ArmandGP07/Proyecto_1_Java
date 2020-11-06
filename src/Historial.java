public class Historial {

    private NodoString inicio;
    private int tamagno;
    private NodoString auxNodoString;

    public Historial() {
        inicio = null;
        auxNodoString = inicio;

    }

    public void siguiente() {
        if (auxNodoString.getNext() == null) {
        } else {
            auxNodoString = auxNodoString.getNext();
            System.out.println(auxNodoString.getValor());
        }
    }

    public void anterior(){

        if (auxNodoString.getPrev() == null) {
        } else{
            auxNodoString = auxNodoString.getPrev();
            System.out.println(auxNodoString.getValor());
        }
    }
    public int getTamagno() {
        return tamagno;
    }

    public boolean esVacia() {
        return inicio == null;
    }


    public void agregarAlFinal(String valor) {

        NodoString nuevo = new NodoString();
        nuevo.setValor(valor);

        if (esVacia()) {
            inicio = nuevo;
        } else {

            NodoString aux = inicio;

            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(nuevo);
            nuevo.setPrev(aux);
        }
        tamagno++;
    }

    public void listar() {
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            NodoString aux = inicio;
            int i = 0;

            while (aux != null && i < tamagno) {
                System.out.printf("Jugada %d [ %s ]\n", i + 1, aux.getValor());
                aux = aux.getNext();
                i++;
            }
        }
    }

    public NodoString getNodo(int posición) {
        NodoString aux = inicio;
        if (posición>tamagno) {
            for (int i = 0; i < posición; i++) {
                aux = aux.getNext();
            }
            return aux;
        }
        return null;
    }
}