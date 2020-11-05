import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Cartas> cartas = Serializacion.getListaCartas();

        //ManoCartas manoCartas = new ManoCartas();
        //manoCartas.listar();

        Usuario player1 = new Usuario("Joel");
        Usuario player2 = new Usuario("Armando");

        player1.setEnemigo(player2);
        player2.setEnemigo(player1);

        player1.getManoCartas().listar();
        player1.getManoCartas().getNodo(1).getValor().UsarCarta(player1,player2);

        //player1.UsarCarta(1);

        //manoCartas.eliminarNodo(manoCartas.getNodo(1).getValor());

        //Usuario player1 = new Usuario("Joel");
        //Usuario player2 = new Usuario("Armando");

        //Scanner m = new Scanner(System.in);
        //System.out.println("Escribe el valor del puerto del player 1");
        //int puerto = Integer.parseInt(m.nextLine());

        //player1.CrearPartida(puerto);
        //player1.UnirsePartida(puerto);

        //System.out.println(player1.getPuerto());

        //m = new Scanner(System.in);
        //System.out.println("Escribe el valor del puerto del player 2");
        //puerto = Integer.parseInt(m.nextLine());
        //player2.UnirsePartida(puerto);

        //player2.CrearPartida(puerto);
    }
}