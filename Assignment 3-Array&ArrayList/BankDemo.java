public class BankDemo {
    public static void main(String[] args) {
        // set balance
        Bank account = new Bank();

        account.addCustomer("aleiandra", "carissa");
        account.addCustomer("almira","ursula");
        
        Customer cust1 = account.getCustomer(0);
        cust1.setAccount(new Account(500000));
        Customer cust2 = account.getCustomer(1);
        cust2.setAccount(new Account(1000000));

        System.out.println("Customer " + cust1. getfirstName() + " " + cust1.getlastName());
        System.out.println("\tInitial balance = " + cust1.getAccount().getBalance());

        double depo1 = 150000;
        boolean depoStatus1 = cust1.getAccount().deposit(depo1);
        System.out.println("\tDeposit = Rp." + (int)depo1 + (depoStatus1 ? " is success :)" : " is failed :("));
        double wd1 = 100000;
        boolean wdStatus1 = cust1.getAccount().withdraw(wd1);
        System.out.println("\tWithdraw = Rp." + (int)wd1 + (wdStatus1 ? " is success :)" : " is failed :("));
        System.out.println("\tFinal Balance = " + cust1.getAccount().getBalance());

        System.out.println("\nCustomer " + cust2. getfirstName() + " " + cust2.getlastName());
        System.out.println("\tInitial balance = " + cust2.getAccount().getBalance());

        double depo2 = 350000;
        boolean depoStatus2 = cust2.getAccount().deposit(depo2);
        System.out.println("\tDeposit = Rp." + (int)depo2 + (depoStatus2 ? " is succees :)" : " is failed :("));
        double wd2 = 500000;
        boolean wdStatus2 = cust2.getAccount().withdraw(wd2);
        System.out.println("\tWithdraw = Rp." + (int)wd2 + (wdStatus2 ? " is success :)" : " is failed :("));
        System.out.println("\tFinal Balance = " + cust2.getAccount().getBalance());


    
    }
}