public class Secretos extends Cartas implements Runnable{

    public Secretos(String nombre, int costoMana){
        super(nombre, costoMana);
    }

    public void EsperarEvento(){
        if(true){
            this.RealizarEvento();
        } else{

        }
    }

    private void RealizarEvento(){
    }

    @Override
    public void run() {

    }
}