public class Warrior extends Character{
    private int fisicFource;

    public Warrior(String name, String elixir, int baseDamege, int fisicFource) {
        super(name, elixir, baseDamege);
        this.fisicFource = fisicFource;
    }

    public int getFisicFource() {
        return fisicFource;
    }

    public void setFisicFource(int fisicFource) {
        this.fisicFource = fisicFource;
    }
}
