/**
 * The type Historial.
 */
public class Historial {

    private NodoString inicio;
    private int tamagno;
    private NodoString auxNodoString;

<<<<<<< HEAD
    public NodoString getInicio() {
        return inicio;
    }

    public void setInicio(NodoString inicio) {
        this.inicio = inicio;
    }

    public void setTamagno(int tamagno) {
        this.tamagno = tamagno;
    }

    public NodoString getAuxNodoString() {
        return auxNodoString;
    }

    public void setAuxNodoString(NodoString auxNodoString) {
        this.auxNodoString = auxNodoString;
    }

=======
    /**
     * Instantiates a new Historial.
     */
>>>>>>> dbe698bd061d136474904406b50333b21319a92c
    public Historial() {
        inicio = null;
        auxNodoString = inicio;

    }

    /**
     * Siguiente.
     */
    public void siguiente() {
        if (auxNodoString.getNext() == null) {
        } else {
            auxNodoString = auxNodoString.getNext();
            System.out.println(auxNodoString.getValor());
        }
    }

    /**
     * Anterior.
     */
    public void anterior(){

        if (auxNodoString.getPrev() == null) {
        } else{
            auxNodoString = auxNodoString.getPrev();
            System.out.println(auxNodoString.getValor());
        }
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

    /**
     * Listar.
     */
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

    /**
     * Gets nodo.
     *
     * @param posicion the posicion
     * @return the nodo
     */
    public NodoString getNodo(int posicion) {
        NodoString aux = inicio;
        if (posicion>tamagno) {
            for (int i = 0; i < posicion; i++) {
                aux = aux.getNext();
            }
            return aux;
        }
        return null;
    }
}