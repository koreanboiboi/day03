package workshop;

public class MainAccount {

    public static void main(String[] args) {
        
        java.util.Date dateCreated = new java.util.Date(name,5000);
            Account account1 = new Account (); 

            
            System.out.println("Account ID:" + " " + account1.getId());
            System.out.println("Initial Balance:" + account1.getBalance());
            
            //System.out.println("Withdrawal amount: $"+ i);
            System.out.println("Deposit: $100 on " + dateCreated);
            System.out.println("Balance after deposit " + account1.deposit(100)+" on " + dateCreated);
            System.out.println("Withdraw: $100 on " + dateCreated);
            System.out.println("Balance after Withdraw: " + account1.withdraw(100)+ "on " + dateCreated);
    }
    
}
