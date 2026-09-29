public class bankAccount {
    private int accountNumber;
    double balance;

    public bankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void getBalance(double value) {
        if (value > balance) {
            throw new InsufficientBalanceException("Saldo insuficiente para o saque.\n");
        }

        balance -= value;
        System.out.println("Saldo retirado.\n Valor atual: " + balance + "\n");
    }

    public void deposite(double value) {
        this.balance = balance + value;
        System.out.println("Saldo depositado.\n Valor atual: " + balance + "\n");
    }
}
