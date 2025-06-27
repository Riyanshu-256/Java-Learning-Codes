package Section_7;

public class P04_Account_Challenge_2 {
    
    public static void main(String[] args) {
        
        // P04_Account_Challenge_1 bobsP04_Account_Challenge_2 = new P04_Account_Challenge_1("11234564579234", 100000, "Riyanshu Sharma","cust062@gmail.com", "9678901154");
        P04_Account_Challenge_1 bobsP04_Account_Challenge_2 = new P04_Account_Challenge_1(); 

        System.out.println( bobsP04_Account_Challenge_2.getAccNo());
        System.out.println( bobsP04_Account_Challenge_2.getbalance());


        // bobsP04_Account_Challenge_2.setAccNo("11234564579234");
        // bobsP04_Account_Challenge_2.setbalance(100000);
        // bobsP04_Account_Challenge_2.setCustName("Riyanshu Sharma");
        // bobsP04_Account_Challenge_2.setCustEmail("cust062@gmail.com");
        // bobsP04_Account_Challenge_2.setNumber("9678901154");

        bobsP04_Account_Challenge_2.withdrawFunds(200.0);
        bobsP04_Account_Challenge_2.depositFunds(11000);
        bobsP04_Account_Challenge_2.withdrawFunds(10);
        bobsP04_Account_Challenge_2.withdrawFunds(1.0);
        bobsP04_Account_Challenge_2.depositFunds(100.0);
        bobsP04_Account_Challenge_2.withdrawFunds(100.10);
        bobsP04_Account_Challenge_2.withdrawFunds(250.0); 
        
        P04_Account_Challenge_1 riyanshuP04_Account_Challenge_1 = new P04_Account_Challenge_1("Riyanshu Sharma", "riyan062@gmail.com", "87655433455");

        System.out.println("Account No. : " + riyanshuP04_Account_Challenge_1.getAccNo() + "; name" + riyanshuP04_Account_Challenge_1.getCustName());



    }
}
