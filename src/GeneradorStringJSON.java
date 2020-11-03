import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class GeneradorStringJSON {
    ArrayList<Cartas> cartasTotales = new ArrayList<Cartas>();
    public GeneradorStringJSON() throws JsonProcessingException {

        cartasTotales.add(new Esbirros("Slime", 30, 50));
        cartasTotales.add(new Esbirros("Minotauro", 275, 150));
        cartasTotales.add(new Esbirros("Mago", 90, 90));
        cartasTotales.add(new Esbirros("Bruja", 70, 85));
        cartasTotales.add(new Esbirros("Caballero", 110, 100));
        cartasTotales.add(new Esbirros("Valkiria", 140, 170));
        cartasTotales.add(new Esbirros("Dragón", 300, 300));
        cartasTotales.add(new Esbirros("Horda de duendes", 30,70));
        cartasTotales.add(new Esbirros("Esqueletos", 120, 90));
        cartasTotales.add(new Esbirros("Cerbero", 900, 666));

        cartasTotales.add(new Hechizos("Congelar", 400));
        cartasTotales.add(new Hechizos("Curar", 300));
        cartasTotales.add(new Hechizos("Poder Supremo", 400));
        cartasTotales.add(new Hechizos("Robar Carta", 250));
        cartasTotales.add(new Hechizos("Quemar", 100));
        cartasTotales.add(new Hechizos("Veneno", 100));
        cartasTotales.add(new Hechizos("Aumentar regeneración de maná", 200));
        cartasTotales.add(new Hechizos("Aumentar regeneración de vida", 500));
        cartasTotales.add(new Hechizos("Trueno", 600));
        cartasTotales.add(new Hechizos("Escudo", 300));

        cartasTotales.add(new Secretos("Robar vida", 400));                  //Si el jugador pierde más de la mitad del hp
        cartasTotales.add(new Secretos("Maldición", 600));                   //Si el enemigo usa un Cerbero recibe su propio ataque
        cartasTotales.add(new Secretos("Intercambio de vida", 300));         //Si el enemigo supera en 300 el hp del jugador
        cartasTotales.add(new Secretos("Drenar maná", 300));                 //Si el jugador tiene menos de 50 en maná
        cartasTotales.add(new Secretos("Eliminar hechizos", 350));           //Si el jugador tiene hechizos
        cartasTotales.add(new Secretos("Inmunidad total de hechizos", 300)); //Si el enemigo utiliza un hechizo
        cartasTotales.add(new Secretos("Inmunidad total de esbirros", 300)); //Si el enemigo utiliza un hechizo
        cartasTotales.add(new Secretos("Aumentar daño", 450));               //Si el jugador tiene menos 300 de hp
        cartasTotales.add(new Secretos("Resurrección", 750));                //Si el usuario muere
        cartasTotales.add(new Secretos("Intercambio de cartas", 400));       //Si el jugador tiene duendes y un slime al mismo tiempo

        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        String theJsonText = mapper.writeValueAsString(cartasTotales);

        System.out.println(theJsonText);

        //ArrayList<Cartas> cartasReconstruidas = mapper.readValue(theJsonText, new TypeReference<ArrayList<Cartas>>() {});

        /*for (Cartas carta: cartasReconstruidas){
            System.out.println(carta.getClass().getName());
            }*/
    }
}

