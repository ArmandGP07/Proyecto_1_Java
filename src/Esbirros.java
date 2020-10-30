public class Esbirros extends Cartas {
    private int ataque;

    public Esbirros(String nombre, int costoMana, int ataque){
        super(nombre, costoMana);
        this.ataque=ataque;
    }

    public void Atacar (Usuario player){
        player.setHp(player.getHp()-ataque);
    }
}
