public class especialAccount extends bankAccount{
    private double limit;

    public especialAccount(int accountNumber, double balance, double limit) {
        super(accountNumber, balance);
        this.limit = limit;
    }

    @Override
    public void getBalance(double value) {
        if (value > (balance + limit)) {
            throw new InsufficientBalanceException("Saldo insuficiente para o saque.");
        }

        balance -= value;
        System.out.println("Saldo retirado.\n Valor atual: " + balance + "\n");
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
