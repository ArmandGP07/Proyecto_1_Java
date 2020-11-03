import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Serialización {
    public static Cartas deserializar(String path){
        try {
        ObjectMapper mapper = new ObjectMapper();
        Cartas carta = mapper.readValue(new File(path), Cartas.class);
        return carta;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void serializar(Object objeto){
        //JSON_MAPPER.writeValue(new File("mijson.json"), objeto);
    }

    public static ArrayList<Cartas> getListaCartas() throws IOException {
        String path = new File(".").getAbsolutePath() + "\\src\\cartas.json";

        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);

        ArrayList<Cartas> cartas = mapper.readValue(new File(path), mapper.getTypeFactory().constructCollectionType(ArrayList.class, Cartas.class));

        return cartas;
    }

}
