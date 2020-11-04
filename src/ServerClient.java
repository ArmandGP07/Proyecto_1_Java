import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClient implements Runnable {
    private int puerto;
    private String ip;
    private Usuario user;

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

                    DataInputStream informacionEntrada = new DataInputStream(socket.getInputStream());

                    Cartas cartaUsada = Serializacion.deserializar(informacionEntrada.readUTF());
                    cartaUsada.UsarCarta(user.getEnemigo(), user);
                    //System.out.printf("El usuario %s ha recibido una carta de %s de parte de %s%n", user.getNombre(), user.getCartaSeleccionada().getNombre(), user.getEnemigo().getNombre());

                    socket.close();
                }
            } catch (IOException e) {
                //e.printStackTrace();
            }
            puerto++;
        }
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
