import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static java.lang.Integer.parseInt;

/**
 * The type Server client.
 */
public class ServerClient implements Runnable {
    private int puerto;
    private String ip;
    private Usuario user;
    private int puertoEnemigo;
    private int usuariosRegistrados=0;

    /**
     * Instantiates a new Server client.
     *
     * @param user   the user
     * @param ip     the ip
     * @param puerto the puerto
     */
    public ServerClient(Usuario user, String ip, int puerto){
        this.puerto= puerto;
        this.user=user;
        this.ip=ip;
    }

    @Override
    public void run() {
        boolean flag = true;

        while (flag) {
            try {

                ServerSocket host = new ServerSocket(puerto, 1);
                flag = false;

                while (true) {
                    //System.out.println("Servidor creado");
                    Socket socket = host.accept();
                    //System.out.println(socket.getPort());

                    DataInputStream informacionEntrada = new DataInputStream(socket.getInputStream());
                    String info = informacionEntrada.readUTF();
                    //System.out.println(info);
                    if(info.contains("Usuario") && usuariosRegistrados<1) {

                        //String usuarioSerializado = info.substring(1);
                        Usuario usuarioEnemigo = Serializacion.deserializarUsuario(info);
                        usuarioEnemigo.setEnemy(true);
<<<<<<< HEAD
                        usuarioEnemigo.obtencionDeCartas();

                        //System.out.println(info);
=======

                        System.out.println(info);
>>>>>>> dbe698bd061d136474904406b50333b21319a92c
                        user.UnirsePartida(usuarioEnemigo.getIp(),usuarioEnemigo.getPuerto());

                        user.setEnemigo(usuarioEnemigo);
                        user.getEnemigo().setEnemigo(user);
                        //System.out.println("Un jugador se ha unido a la partida");
                        usuariosRegistrados++;
                        user.setConectado(true);

                    }else if (info.equals("0")||info.equals("1")||info.equals("2")||info.equals("3")){
                        //System.out.println(info);

<<<<<<< HEAD
                        int valorCarta = parseInt(info);
                        user.getEnemigo().setPosicionCartaSeleccinada(valorCarta);
                        user.getEnemigo().UsarCarta();
                        user.getEnemigo().setTurno(false);
                        user.setTurno(true);
=======
                        int valorCarta = parseInt(info.substring(0,0));
                        user.getEnemigo().setPosicionCarataSeleccinada(valorCarta);
                        String cartaJson = info.substring(1);
                        Cartas cartaUsada = Serializacion.deserializarCartas(cartaJson);
                        user.getEnemigo().UsarCarta(50001);
                        cartaUsada.UsarCarta(user.getEnemigo(), user);
                        //System.out.printf("El usuario %s ha recibido una carta de %s de parte de %s%n", user.getNombre(), user.getCartaSeleccionada().getNombre(), user.getEnemigo().getNombre());
>>>>>>> dbe698bd061d136474904406b50333b21319a92c
                    }

                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            puerto++;
        }
    }

    /**
     * Gets puerto.
     *
     * @return the puerto
     */
    public int getPuerto() {
        return puerto;
    }

    /**
     * Sets puerto.
     *
     * @param puerto the puerto
     */
    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    /**
     * Gets ip.
     *
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets ip.
     *
     * @param ip the ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public Usuario getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(Usuario user) {
        this.user = user;
    }
}
