public class Manager extends Emlployee{
    private double bonus;

    public Manager(double bonus,String name, double baseSalary) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        super.baseSalary = (baseSalary + 200 - 60) + (baseSalary * (bonus / 10)) ;
        return super.baseSalary;
    }
}
