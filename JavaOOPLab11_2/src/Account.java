

public class Account {
    protected double balance;
    protected String name;

    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double a){
        if (a > 0){
            this.balance += a;
            System.out.println(a+" baht is deposited to "+this.name+".");
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public void withdraw(double a) throws WithdrawException {
        try {
            if (a < 0) {
                System.out.println("Input number must be a positive integer.");
                return;
            }

            if (balance >= a) {
                balance -= a;
                System.out.println(a + " baht is withdrawn from " + name + ".");
            } else {
                throw new WithdrawException(String.format("Account %s has not enough money.", name));
            }
        }
        catch (WithdrawException w) {
            throw w;
        }
        finally {
            System.out.println("Thank you.");
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void showAccount(){
        System.out.println(String.format("%s account has %.1f baht.", this.name, this.balance));
    }
}
