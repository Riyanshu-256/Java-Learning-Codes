package Section_7;

public class P07_Constructor_Challenge {

    private String customerName;
    private double customerCreditLimit;
    private String customerEmail;

    public String getCustomerName(){
        return customerName;
    }

public double getCustomerCreditLimit(){
        return customerCreditLimit;
    }
    public String getCustomerEmail(){
        return customerEmail;
    }

    public P07_Constructor_Challenge(String customerName, double customerCreditLimit, String customerEmail){
        this.customerName = customerName;
        this.customerCreditLimit = customerCreditLimit;
        this.customerEmail = customerEmail;
    }

    public P07_Constructor_Challenge(){
        this("Anshu", 121356, "riyan062@gmail.com");
    }

    public P07_Constructor_Challenge(String customerName, String customerEmail) {
        this(customerName, 10000.0, customerEmail);
    }
}
