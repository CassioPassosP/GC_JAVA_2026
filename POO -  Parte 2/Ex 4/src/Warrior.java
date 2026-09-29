public class Warrior extends Character{
    private int fisicFource;

    public Warrior(String name, String elixir, int baseDamege, int fisicFource) {
        super(name, elixir, baseDamege);
        this.fisicFource = fisicFource;
    }

    @Override
    public void atack(Character target) {
        int receiveAtackDamage = getBaseDamege() + getFisicFource();
        target.receiveDamage(receiveAtackDamage);
        System.out.println("Ataque com dano critico de forca do guerreiro " + getName() + "\n" + "Dano causado: " + receiveAtackDamage);
    }

    public int getFisicFource() {
        return fisicFource;
    }

    public void setFisicFource(int fisicFource) {
        this.fisicFource = fisicFource;
    }
}
