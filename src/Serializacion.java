import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Serializacion {

    public static String serializar(Cartas carta) throws JsonProcessingException {

        ArrayList<Cartas> cartas = new ArrayList<Cartas>();
        cartas.add(carta);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        String cartaSerializada = mapper.writeValueAsString(cartas);

        return cartaSerializada;
    }

    public static Cartas deserializar(String cartaJson) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        ArrayList<Cartas> cartas = mapper.readValue(cartaJson, mapper.getTypeFactory().constructCollectionType(ArrayList.class, Cartas.class));
        Cartas carta = cartas.get(0);
        return carta;

    }

    public static ArrayList<Cartas> getListaCartas() throws IOException {
        String path = new File(".").getAbsolutePath() + "\\src\\cartas.json";

        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);

        ArrayList<Cartas> cartas = mapper.readValue(new File(path), mapper.getTypeFactory().constructCollectionType(ArrayList.class, Cartas.class));

        return cartas;
    }

}
