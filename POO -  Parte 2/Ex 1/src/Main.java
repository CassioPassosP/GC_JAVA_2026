public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(5, "Garry", 2000);
        Emlployee emlployee = new Emlployee( "Robson", 2000);

        System.out.println(manager.getName() + ", base salarial: R$ " + manager.calculateSalary());
        System.out.println(emlployee.getName() + ", base salarial: R$ " + emlployee.calculateSalary());
    }
}