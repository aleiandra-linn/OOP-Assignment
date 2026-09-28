//import java.util.ArrayList;
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;//one person one account
    
    /* if using array static
    private Account[] account = new Account[5];
    private int numberOfAccounts;

    if using dynamic arraylist
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account acct) {
    this.accounts.add(acct); // Otomatis bertambah 
    }
    public Account getAccount(int index) {
    return this.accounts.get(index);
    }*/

    public Customer(String f, String l){
        this.firstName = f;
        this.lastName = l;
        //this.(instance variable) = parameter
    }

    public String getfirstName(){
        return this.firstName;
    }

    public String getlastName(){
        return this.lastName;
    }

    public Account getAccount(){
        return this.account;
    }

    public void setAccount(Account acc){
        this.account = acc;
    }


    


}