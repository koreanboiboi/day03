package workshop;

public class Main {
        
        public static void main(String[] args) {
            java.util.Date dateCreated = new java.util.Date();
            BankAccount account1 = new BankAccount (1122, 20000, 0.045); //
            account1.withdraw(2500);
            account1.deposit(3000);
            System.out.println("----------------------------------------");
            System.out.println("   Welcome to your online account!");
            System.out.println("Please find your account details below");
            System.out.println("----------------------------------------");
    
            System.out.println("Account ID:" + " " + account1.getId());
            System.out.println("Initial Balance:" + account1.getBalance());
    
            System.out.println("Balance after Withdraw:" + " " + account1.withdraw(2500));
            System.out.println("Balance after deposit" + " " + account1.deposit(3000));
    
    
            System.out.println("Interest Rate:" + " " + account1.getAnnualInterestRate());
    
            System.out.println("Monthly Interest:" + " " + "£" + account1.getMonthlyInterestRate());
    
    
            System.out.println("Date Account was Created:" + " " + dateCreated);
    
    
    
            System.out.println("------------------------");
            System.out.println("The Process is complete");
            System.out.println("------------------------");

       

    }
    
}
