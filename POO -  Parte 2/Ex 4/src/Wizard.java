public class Wizard extends Character{
    private int mana;

    public Wizard(String name, String elixir, int baseDamege, int mana) {
        super(name, elixir, baseDamege);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
