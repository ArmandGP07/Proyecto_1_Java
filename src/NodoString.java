public class NodoString {
    private String valor;
    private NodoString next;
    private NodoString prev;

    public NodoString(){
        this.valor = null;
        this.next = null;
        this.prev = null;
    }

    public NodoString(String valor){
        this.valor = valor;
        this.next = null;
        this.prev = null;
    }

    // Métodos get y set para los atributos.

    public NodoString getPrev() {
        return prev;
    }

    public void setPrev(NodoString prev) {
        this.prev = prev;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public NodoString getNext() {
        return next;
    }

    public void setNext(NodoString next) {
        this.next = next;
    }
}
