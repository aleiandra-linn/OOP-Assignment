import java.util.ArrayList; 

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    
    // ada banyak rekening 
    private ArrayList<Account> accounts;

    public Customer(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public boolean validatePassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public void addAccount(Account acc) {
        this.accounts.add(acc);
    }

    // ngambil rekening utama (indeks 0)
    public Account getAccount() {
        if (!accounts.isEmpty()) {
            return this.accounts.get(0);
        }
        return null;
    }

    //ngambil rekening berdasarkan indeks tertentu 
    public Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return this.accounts.get(index);
        }
        return null;
    }

    public int getNumOfAccounts() {
        return this.accounts.size();
    }
}