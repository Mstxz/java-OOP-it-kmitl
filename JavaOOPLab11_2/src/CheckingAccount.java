public class CheckingAccount extends Account {
    private double credit;

    public CheckingAccount(){
        super(0,"");
        this.credit = 0;
    }

    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit){
        if (credit >= 0) {
            this.credit = credit;
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public double getCredit(){
        return this.credit;
    }

    @Override
    public void withdraw(double a) throws WithdrawException {
        try {
            if (a < 0) {
                System.out.println("Input number must be a positive integer.");
                return;
            }

            double balance_check = balance + credit;

            if (balance >= a) {
                balance -= a;
            } else if (balance_check >= a) {
                credit -= (a - balance);
                balance = 0;
            } else {
                throw new WithdrawException(String.format("Account %s has not enough money.", name));
            }

            System.out.println(String.format("%.1f baht is withdrawn from %s and your credit balance is %.1f.", a, name, credit));
        }
        catch (WithdrawException w) {
            throw w;
        }
        finally {
            System.out.println("Thank you.");
        }
    }


    public void withdraw(String a) throws WithdrawException {
        this.withdraw(Double.parseDouble(a));
    }

    @Override
    public String toString(){
        return String.format("The %s account has %.1f baht and %.1f credits.", this.name, this.balance, this.credit);
    }
}