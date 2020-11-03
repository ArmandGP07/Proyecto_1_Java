public class Secretos extends Cartas{

    public Secretos(String nombre, int costoMana){
        super(nombre, costoMana);
    }

    public Secretos(){}

    @Override
    public void UsarCarta(Usuario usuario, Usuario enemigo){
        switch(getNombre()){
            case "Robar vida":
            {
                System.out.println("Robe vida del enemigo");
                break;
            }
            case "Maldición":
            {
                System.out.println("Se puso una maldición en el enemigo");
                break;
            }
            case "Intercambio de vida":
            {
                System.out.println("Se intercambió la vida");
                break;
            }
            case "Drenar maná":
            {
                System.out.println("Se ha drenado mana del enemigo");
                break;
            }
            case "Eliminar hechizos":
            {
                System.out.println("Se han eliminado los hechizos");
                break;
            }
            case "Inmunidad total de hechizos":
            {
                System.out.println("Ahora eres inmune a los hechizos");
                break;
            }
            case "Inmunidad total de esbirros":
            {
                System.out.println("Ahora eres inmune a los ataques de los esbirros");
                break;
            }
            case "Aumentar daño":
            {
                System.out.println("Se aumentó el daño en un 50%");
                break;
            }
            case "Resurrección":
            {
                System.out.println("Has resucitado");
                break;
            }
            case "Intercambio de cartas":
            {
                System.out.println("He intercambiado una carta con el enemigo");
                break;
            }
        }
    }
}