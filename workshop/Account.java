package workshop;

import java.util.Date;

public class Account {

    private float balance;
    private Date dateCreated;
    private String name;

    Account(){
        balance = 0;
        name = "Your name";
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }

      //Define method withdraw
      float withdraw (int amount) {  
        return balance -= amount;
    }
    //Define method deposit 
    float deposit(int i) {
        return balance += i;
    }
}
