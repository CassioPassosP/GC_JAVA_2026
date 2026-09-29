public class Main {
    public static void main(String[] args) {
        bankAccount contaJoao = new bankAccount(123, 500.0);
        contaJoao.deposite(200.0);
        contaJoao.getBalance(150.0);

        bankAccount contaMaria = new especialAccount(456, 100.0, 200.0);
        contaMaria.deposite(200.0);
        contaMaria.getBalance(501.0);
    }
}