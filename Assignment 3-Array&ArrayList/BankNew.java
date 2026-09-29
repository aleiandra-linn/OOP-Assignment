public class BankNew {
    private Customer[] customers;
    private int numberOfCustomers;

    public BankNew() {
        this.customers = new Customer[10]; // array static
        this.numberOfCustomers = 0;
    }

    public void addCustomer(String firstName, String lastName, String username, String password) {
        if (numberOfCustomers < customers.length) {
            Customer c = new Customer(firstName, lastName, username, password);
            customers[numberOfCustomers] = c;
            numberOfCustomers++;
        } else {
            System.out.println("Kapasitas nasabah bank sudah penuh!");
        }        
    }

    public int getNumOfCustomer() {
        return this.numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }
        return null;
    }

    //verifikasi login nasabah di array
    public Customer authenticate(String username, String password) {
        for (int i = 0; i < numberOfCustomers; i++) {
            Customer c = customers[i];
            if (c.getUsername().equalsIgnoreCase(username) && c.validatePassword(password)) {
                return c; // return objek nasabah jika cocok
            }
        }
        return null; // return null jika unme/pass salah
    }
}