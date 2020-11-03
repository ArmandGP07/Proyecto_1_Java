import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Cartas> cartas = Serialización.getListaCartas();

        Usuario joel = new Usuario("Joel");
        Usuario armando = new Usuario("Armando");

        //cartas.get(0).UsarCarta(joel, armando);

        for (int i = 0; i < 16; i++) {
            System.out.println(joel.getDeck().getNodo(i).getValor().getNombre());
        }
        System.out.println("");
        for (int i = 0; i < 16; i++) {
            System.out.println(armando.getDeck().getNodo(i).getValor().getNombre());
        }
    }
}