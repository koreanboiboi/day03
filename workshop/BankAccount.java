package workshop;

import java.util.Date;

public class BankAccount {
    private int id;
    private double balance; //balance for account
    private double annualInterestRate; //store interest rate
    private Date dateCreated; //store date account created
    
    // no arg constructor for default account 
    BankAccount() {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    //constructor with specfic id and initial balance
    BankAccount (int newId, double newBalance) {
    id = newId;
    balance = newBalance;
    }
    //
    BankAccount (int newId, double newBalance, double newAnnualInterestRate) {
        id = newId;
        balance = newBalance;
        annualInterestRate = newAnnualInterestRate;
    }
    //accessor and mutator methods
    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setId (int newId) { 
        id = newId;
    }
    public void setBalance (double newBalance) {
        balance = newBalance;
    }
    public void setAnnualInterestRate (double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }
    public void seDateCreated (Date newDateCreated) { 
        setDateCreated(newDateCreated);
    }
    //Method for monthly interest
    double getMonthlyInterestRate() {
        return annualInterestRate/12;
    }
    //Define method withdraw
    double withdraw (double amount) {  
        return balance -= amount;
    }
    //Define method deposit 
    double deposit(double amount) {
        return balance += amount;
    }
    
       
        
    

}
