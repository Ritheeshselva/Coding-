package oops;
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
class BankAccount{
        private int accountNumber;
        private String accountHolder;
        protected double balance;
        
        BankAccount(int acc,String name,double bal){
            accountNumber=acc;
            accountHolder=name;
            balance=bal;
        }
        
        public void deposit(double amount){
            balance+=amount;
        }
        public void withdraw(double amount){
            if(amount<=balance){
            balance-=amount;
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
        public void displayAccount(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        }
    }
    
    class SavingsAccount extends BankAccount{
        double interestRate;
     SavingsAccount(int accNo, String name, double bal, double rate){
            super(accNo,name,bal);
            interestRate = rate;
        }
       public void  displayAccount(){
             double interest = balance * interestRate / 100;
        System.out.println("Account Type: Savings");
        super.displayAccount();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Amount: " + interest);
        }
    }
    
     class CurrentAccount extends BankAccount{
         private double overdraftLimit;
         public CurrentAccount(int accNo, String name, double bal, double limit){
             super(accNo,name,bal);
             overdraftLimit=limit;
         }
       public void withdraw(double amount){
            if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded");
        }
        }
        
        public void  displayAccount(){
         System.out.println("Account Type: Current");
         super.displayAccount();
         System.out.println("Overdraft Limit: " + overdraftLimit);
         }
    }
    
public class task_Bank  {
    public static void main(String[] args) {
        BankAccount user1 = new SavingsAccount(12345678,"Ram",15000,5);
        BankAccount user2= new CurrentAccount(87654321,"Raj",200000,5000);
        
        user1.displayAccount();
        System.out.println("");
        user2.displayAccount();
    }
}

