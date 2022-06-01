package workshopAns;

//import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        
        BankAccount acct = new BankAccount();
        System.out.printf("name: %s", acct.getName());
        System.out.printf("acctId: %s",acct.getAcctId());
        System.out.printf("Balance: %d",acct.getBalance());
        
        
       /* acct.setName("Fred");
        acct.setAcctId("acctId");

        UUID id = UUID.randomUUID();
        System.out.println(id.toString());

        String idAString = id.toString();

        System.out.println(idAString.substring(0,8));
        */
    }
}
