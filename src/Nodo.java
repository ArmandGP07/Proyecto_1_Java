public class Nodo {
    private Cartas valor;
    private Nodo next;
    private Nodo prev;

    public void Nodo(){
        //this.valor = "";
        this.next = null;
        this.prev = null;
    }

    public void Nodo(Cartas valor){
        this.valor = valor;
        this.next = null;
        this.prev = null;
    }

    // Métodos get y set para los atributos.

    public Nodo getPrev() {
        return prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

    public Cartas getValor() {
        return valor;
    }

    public void setValor(Cartas valor) {
        this.valor = valor;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
