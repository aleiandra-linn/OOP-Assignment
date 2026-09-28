public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        this.customers = new Customer[10];
        this.numberOfCustomers = 0;
    }

    public void addCustomer(String f, String l){
        if (numberOfCustomers < customers.length){
            Customer c = new Customer(f, l);
            customers[numberOfCustomers] = c;
            numberOfCustomers++;
        }else {
            System.out.println("Already full");
        }        
    }

    public int getNumOfCustomers(){
        return this.numberOfCustomers;
    }

    public Customer getCustomer(int index){
        if (index >= 0 && index < numberOfCustomers){
            return customers[index];
        }
        return null;
    }
}