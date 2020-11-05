import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Cartas> cartas = Serializacion.getListaCartas();

        Usuario player1 = new Usuario("Joel");
        //Usuario player2 = new Usuario("Armando");

        //Thread t1 = new Thread(player1);
        //t1.start();

        //Thread t2 = new Thread(player2);
        //t2.start();

        Scanner m = new Scanner(System.in);
        System.out.println("Escribe el valor del puerto del player 1");
        int puerto = Integer.parseInt(m.nextLine());

        //player1.CrearPartida(puerto);
        player1.UnirsePartida(puerto);

        //System.out.println(player1.getPuerto());

        //m = new Scanner(System.in);
        //System.out.println("Escribe el valor del puerto del player 2");
        //puerto = Integer.parseInt(m.nextLine());
        //player2.UnirsePartida(puerto);

        //player2.CrearPartida(puerto);

        //player1.setEnemigo(player2);
        //player2.setEnemigo(player1);

        //m = new Scanner(System.in);
        //System.out.println("Escribe el valor del puerto del jugador 2");
        //puerto = Integer.parseInt(m.nextLine());

        //player1.setCartaSeleccionada(player1.getDeck().getNodo(3).getValor());
        //player1.UsarCarta(puerto);

        //m = new Scanner(System.in);
        //System.out.println("Escribe el valor del puerto del jugador 1");
        //puerto = Integer.parseInt(m.nextLine());

        //player2.setCartaSeleccionada(player2.getDeck().getNodo(5).getValor());
        //player2.UsarCarta(puerto);

        //String cartaUsada = Serialización.serializar(cartas.get(0));
        //Cartas cart = Serialización.deserializar(cartaUsada);
        //cart.UsarCarta(player1,player2);



    }
}