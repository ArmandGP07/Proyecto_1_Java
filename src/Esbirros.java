public class Esbirros extends Cartas {
    private int ataque;

    public Esbirros(String nombre, int costoMana, int ataque) {
        super(nombre, costoMana);
        this.ataque = ataque;
    }

    public Esbirros() {
    }


    @Override
    public void UsarCarta(Usuario usuario, Usuario enemigo) {
        if (usuario.getMana() > getCostoMana()) {
            if (usuario.isEscudoActivo()){
                enemigo.setHp(enemigo.getHp() - ataque/2);
            } else {
                enemigo.setHp(enemigo.getHp() - ataque);
            }
            System.out.printf("El hp de %s es %d\n", enemigo.getNombre(), enemigo.getHp());

            switch (getNombre()) {

                case "Slime": {
                    System.out.println(String.format("Soy un slime y ataqué a %s", enemigo.getNombre()));
                    break;
                }
                case "Minotauro": {
                    System.out.println("Soy un minotauro");
                    break;
                }
                case "Mago": {
                    System.out.println("Soy un mago, merlín");
                    break;
                }
                case "Bruja": {
                    System.out.println("Soy una bruja");
                    break;
                }
                case "Caballero": {
                    System.out.println("Soy un caballero y derrotaré al enemigo");
                    break;
                }
                case "Valkiria": {
                    System.out.println("Soy una valkiria");
                    break;
                }
                case "Dragón": {
                    System.out.println("Soy un dragón");
                    break;
                }
                case "Horda de duendes": {
                    System.out.println("Somos unos duendes");
                    break;
                }
                case "Esqueletos": {
                    System.out.println("Somos esqueletos, morimos hace mucho");
                    break;
                }
                case "Cerbero": {
                    System.out.println("Soy Cerbero, tengo 3 cabezas");
                    break;
                }
            }

        } else {
            System.out.println("No tienes mana suficiente para usar esta carta");
        }
    }


    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
}
