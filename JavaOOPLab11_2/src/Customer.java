public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;

    public Customer(){
        this.firstName = "";
        this.lastName = "";
        this.acct = null;
    }

    //Constructor
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
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

    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }

    public CheckingAccount getAcct() {
        return acct;
    }

    @Override
    public String toString() {
        if (this.acct == null){
            return String.format("%s %s doesn't have account.", this.firstName, this.lastName);
        }
        else {
            return String.format("The %s account has %.1f baht and %.1f credits.", this.firstName, acct.getBalance(), acct.getCredit());
        }
    }

    public boolean equals(Customer c) {
        if (c == null) {
            return false;
        }
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName);
    }
}
