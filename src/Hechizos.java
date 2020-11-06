public class Hechizos extends Cartas {
    public Hechizos(String nombre, int costoMana) {
        super(nombre, costoMana);
    }

    public Hechizos() {
    }

    @Override
    public void UsarCarta(Usuario usuario, Usuario enemigo) {
        if (usuario.getMana() > getCostoMana()) {
            switch (getNombre()) {
                case "Congelar": {
                    enemigo.setCongelado(true);
                    System.out.println("Congelé al enemigo");
                    break;
                }
                case "Curar": {
                    int porcentaje = 45/100;
                    int actualHP = usuario.getHp();
                    int curacion = usuario.getMaxHP() *porcentaje;

                    usuario.setHp(actualHP+curacion);

                    if (usuario.getHp()>usuario.getMaxHP()) {
                        usuario.setHp(usuario.getMaxHP());
                    }

                    int curaciónRecibida = usuario.getHp()-actualHP;

                    System.out.println(String.format("Se curaron %d de HP", curaciónRecibida));
                    break;
                }
                case "Poder Supremo": {
                    usuario.setPoderSupremo(true);
                    System.out.println("Se realizó un ataque con el poder supremo");
                    break;
                }
                case "Robar Carta": {
                    //usuario.getManoCartas().agregarAlFinal(enemigo.getManoCartas().getNodo().getValor());
                    //enemigo.getManoCartas().;


                    System.out.println("Robé una carta del enemigo");
                    break;
                }
                case "Quemar": {
                    enemigo.setQuemado(true);
                    System.out.println("Quemé al enemigo");
                    break;
                }
                case "Veneno": {
                    enemigo.setEnvenenado(true);
                    System.out.println("Envenené al enemigo");
                    break;
                }
                case "Aumentar regeneración de maná": {
                    usuario.setRegenMana(45);
                    System.out.println("Se aumentó la regeneración de mana");
                    break;
                }
                case "Aumentar regeneración de vida": {
                    usuario.setRegeneracionHP(true);
                    System.out.println("Se aumentó la regeneración de vida");
                    break;
                }
                case "Trueno": {
                    enemigo.setHp(enemigo.getHp()/2);

                    System.out.println("Se invocó un trueno");
                    break;
                }
                case "Escudo": {
                    usuario.setEscudoActivo(true);
                    System.out.println("Se bloquea el 50% del daño recibido");
                    break;
                }
            }
        } else {
            System.out.println("No tienes mana suficiente para usar esta carta");
        }
    }
}
