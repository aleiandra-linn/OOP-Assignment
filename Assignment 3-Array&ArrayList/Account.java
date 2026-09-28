public class Account {
    private double balance;

    public Account(double init_balance){//nominal ketika baru buat rek
        if(init_balance >= 0){
            this.balance = init_balance;
        }else {
            this.balance = 0;
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean deposit(double amount){//aset yg disimpan
        if(amount > 0){
            this.balance += amount;
            return true; //default value false
        }
        return false;
    }

    public boolean withdraw(double amount){//narik uang
        if(this.balance >= amount){
            this.balance -= amount;
            return true;
        }
        return false;
    }
    
    
}