public class Customer {
    private String firstName;
    private String lastName;
    private Account[] acct;
    private int numOfAccount;

    public Customer() {
        this.firstName = "";
        this.lastName = "";
        this.acct = new Account[5];
        this.numOfAccount = 0;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new Account[5];
        this.numOfAccount = 0;
    }

    public void addAccount(Account account) {
        if (numOfAccount < acct.length) {
            acct[numOfAccount] = account;
            numOfAccount++;
        } else {
            System.out.println("Cannot add more accounts. Maximum reached.");
        }
    }

    public Account getAccount(int index){
        if (index >= 0 && index < numOfAccount) {
            return acct[index];
        } else {
            System.out.println("Invalid account index.");
            return null;
        }
    }

    public int getNumOfAccount() {
        return numOfAccount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return String.format("%s %s has %d account(s).", firstName, lastName, numOfAccount);
    }

    public boolean equals(Customer c) {
        if (c == null) {
            return false;
        }
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName);
    }
}
