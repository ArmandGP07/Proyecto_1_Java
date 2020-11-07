/**
 * The type Nodo string.
 */
public class NodoString {
    private String valor;
    private NodoString next;
    private NodoString prev;

    /**
     * Instantiates a new Nodo string.
     */
    public NodoString(){
        this.valor = null;
        this.next = null;
        this.prev = null;
    }

    /**
     * Instantiates a new Nodo string.
     *
     * @param valor the valor
     */
    public NodoString(String valor){
        this.valor = valor;
        this.next = null;
        this.prev = null;
    }

    // Métodos get y set para los atributos.

    /**
     * Gets prev.
     *
     * @return the prev
     */
    public NodoString getPrev() {
        return prev;
    }

    /**
     * Sets prev.
     *
     * @param prev the prev
     */
    public void setPrev(NodoString prev) {
        this.prev = prev;
    }

    /**
     * Gets valor.
     *
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * Sets valor.
     *
     * @param valor the valor
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * Gets next.
     *
     * @return the next
     */
    public NodoString getNext() {
        return next;
    }

    /**
     * Sets next.
     *
     * @param next the next
     */
    public void setNext(NodoString next) {
        this.next = next;
    }
}
