package Section_7;

public class P04_Account_Challenge_1 {
    
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNo;

//---------------------------------------------------------CONSTRUCTOR--------------------------------------------------------------------//

// 1st Constructor Declaration
    public P04_Account_Challenge_1() {  // Costructor declaration

        this("11234564579234", 100000, "Default name", "Default address", "Default phone");  // this() => must used in the 1st line of constructor declaration and used for constructor chaining
        System.out.println("Empty constructor called");
    }

// 2nd Constructor Declaration
    public P04_Account_Challenge_1(String accountNumber, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhoneNo = phone;
    }

// 3rd Constructor Declaration

    public P04_Account_Challenge_1(String customerName,  String customerEmail, String customerPhoneNo) {
        this("11234564579234", 100000, customerName, customerEmail, customerPhoneNo);

        // this.accountNumber = accountNumber;
        // this.customerEmail = customerEmail;
        // this.customerPhoneNo = customerPhoneNo;
    }

    // for deposite
    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);
    }

    // for withdrawl
    public void withdrawFunds(double withdrawlAmount) {
        if(balance - withdrawlAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + balance + " in you account.");
        } else {
            balance -= withdrawlAmount;
            System.out.println("Withdrawl of $" + withdrawlAmount + " processed, Remaining balance = $" + balance);
        }
    }

    // for update
    public String getAccNo() {
        return accountNumber;
    }
    public void setAccNo(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getbalance() {
        return balance;
    }
    public void setbalance(double balance) {
        this.balance = balance;
    }
    
    public String getCustName() {
        return customerName;
    }
    public void setCustName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustEmail() {
        return customerEmail;
    }
    public void setCustEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getNumber() {
        return customerPhoneNo;
    }
    public void setNumber(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

}
