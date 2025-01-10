public class Wallet {
    private double balance;

    public void setBalance(double balance) {
        this.balance = Math.max(balance, 0);
    }

    public double getBalance() {
        return balance;
    }
}
