public class Bank {
    private Account[] acct;
    private int numacct;

    public Bank(){
        acct = new Account[10];
        numacct = 0;
    }

    public void addAccount(Account ac){
        if(numacct < acct.length){
            acct[numacct] = ac;
            numacct++;
        }
    }

    public Account getAccount(int index) {
        return acct[index];
    }

    public int getNumAccount(){
        return numacct;
    }
}