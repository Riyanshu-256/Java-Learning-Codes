package Section_7;

public class P04_Account_Challenge_1 {
    
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNo;

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
