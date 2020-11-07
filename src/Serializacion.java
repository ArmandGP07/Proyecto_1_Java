import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


/**
 * The type Serializacion.
 */
public class Serializacion {

    /**
     * Serializar carta string.
     *
     * @param carta the carta
     * @return the string
     * @throws JsonProcessingException the json processing exception
     */
    public static String serializarCarta(Cartas carta) throws JsonProcessingException {

        ArrayList<Cartas> cartas = new ArrayList<Cartas>();
        cartas.add(carta);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        String cartaSerializada = mapper.writeValueAsString(cartas);

        return cartaSerializada;
    }

    /**
     * Deserializar cartas cartas.
     *
     * @param cartaJson the carta json
     * @return the cartas
     * @throws IOException the io exception
     */
    public static Cartas deserializarCartas(String cartaJson) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        ArrayList<Cartas> cartas = mapper.readValue(cartaJson, mapper.getTypeFactory().constructCollectionType(ArrayList.class, Cartas.class));
        Cartas carta = cartas.get(0);

        return carta;
    }

    /**
     * Serializar usuario string.
     *
     * @param usuario the usuario
     * @return the string
     * @throws JsonProcessingException the json processing exception
     */
    public static String serializarUsuario(Usuario usuario) throws JsonProcessingException {

        ArrayList<Usuario> cartas = new ArrayList<Usuario>();
        cartas.add(usuario);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        String usuarioSerializada = mapper.writeValueAsString(cartas);

        return usuarioSerializada;
    }

    /**
     * Deserializar usuario usuario.
     *
     * @param cartaJson the carta json
     * @return the usuario
     * @throws IOException the io exception
     */
    public static Usuario deserializarUsuario(String cartaJson) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        ArrayList<Usuario> usuarios = mapper.readValue(cartaJson, mapper.getTypeFactory().constructCollectionType(ArrayList.class, Usuario.class));
        Usuario usuario = usuarios.get(0);

        return usuario;
    }

    /**
     * Gets lista cartas.
     *
     * @return the lista cartas
     * @throws IOException the io exception
     */
    public static ArrayList<Cartas> getListaCartas() throws IOException {
        String path = new File(".").getAbsolutePath() + "\\src\\cartas.json";

        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);

        ArrayList<Cartas> cartas = mapper.readValue(new File(path), mapper.getTypeFactory().constructCollectionType(ArrayList.class, Cartas.class));

        return cartas;
    }

}
