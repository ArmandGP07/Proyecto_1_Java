public class Hechizos extends Cartas {
    public Hechizos (String nombre, int costoMana){
        super(nombre, costoMana);
    }

    public Hechizos (){}

    @Override
    public void UsarCarta(Usuario usuario, Usuario enemigo){
        switch (getNombre()){
            case "Congelar":
            {
                System.out.println("Congelé al enemigo");
                break;
            }
            case "Curar":
            {
                System.out.println("Se curaron 400 de HP");
                break;
            }
            case "Poder Supremo":
            {
                System.out.println("Se realizó un ataque con el poder supremo");
                break;
            }
            case "Robar Carta":
            {
                System.out.println("Robé una carta del enemigo");
                break;
            }
            case "Quemar":
            {
                System.out.println("Quemé al enemigo");
                break;
            }
            case "Veneno":
            {
                System.out.println("Envenené al enemigo");
                break;
            }
            case "Aumentar regeneración de maná":
            {
                System.out.println("Se aumentó la regeneración de mana");
                break;
            }
            case "Aumentar regeneración de vida":
            {
                System.out.println("Se aumentó la regeneración de vida");
                break;
            }
            case "Trueno":
            {
                System.out.println("Se invocó un trueno");
                break;
            }
            case "Escudo":
            {
                System.out.println("Se bloquea el 50% del daño recibido");
                break;
            }

        }
    }

}
