/**
 * The type Nodo.
 */
public class Nodo {
    private Cartas valor;
    private Nodo next;
    private Nodo prev;

    /**
     * Nodo.
     */
    public void Nodo(){
        //this.valor = "";
        this.next = null;
        this.prev = null;
    }

    /**
     * Nodo.
     *
     * @param valor the valor
     */
    public void Nodo(Cartas valor){
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
    public Nodo getPrev() {
        return prev;
    }

    /**
     * Sets prev.
     *
     * @param prev the prev
     */
    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

    /**
     * Gets valor.
     *
     * @return the valor
     */
    public Cartas getValor() {
        return valor;
    }

    /**
     * Sets valor.
     *
     * @param valor the valor
     */
    public void setValor(Cartas valor) {
        this.valor = valor;
    }

    /**
     * Gets next.
     *
     * @return the next
     */
    public Nodo getNext() {
        return next;
    }

    /**
     * Sets next.
     *
     * @param next the next
     */
    public void setNext(Nodo next) {
        this.next = next;
    }
}
