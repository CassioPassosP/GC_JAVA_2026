public class Wizard extends Character{
    private int mana;

    public Wizard(String name, String elixir, int baseDamege, int mana) {
        super(name, elixir, baseDamege);
        this.mana = mana;
    }

    @Override
    public void atack(Character target) {
        if(mana >= 10){
            mana -= 10;
            int receiveAtackDamage = getBaseDamege() * 2;
            target.receiveDamage(receiveAtackDamage);
            System.out.println("Ataque magico com dano critico do mago " + getName() + "\n" + "Dano causado: " + receiveAtackDamage);
        }else{
            int receiveAtackDamage = getBaseDamege();
            target.receiveDamage(receiveAtackDamage);
            System.out.println("Ataque realizado do " + getName() + " ! " + "\n" + "Sem mana suficiente para causar dano critico." + "\n" + "Dano causado: " + receiveAtackDamage);
        }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
