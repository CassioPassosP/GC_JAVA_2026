public class Character {
    private String name;
    private String elixir;
    private int baseDamege;

    public Character(String name, String elixir, int baseDamege) {
        this.name = name;
        this.elixir = elixir;
        this.baseDamege = baseDamege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElixir() {
        return elixir;
    }

    public void setElixir(String elixir) {
        this.elixir = elixir;
    }

    public int getBaseDamege() {
        return baseDamege;
    }

    public void setBaseDamege(int baseDamege) {
        this.baseDamege = baseDamege;
    }

    public void atack(Character target){

    }

    public void receiveDamage(int quantity){

    }
}
