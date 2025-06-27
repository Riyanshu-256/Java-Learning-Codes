package Section_7;

public class P07_Constructor_Challenge_2 {

    public static void main(String[] args) {
        
        P07_Constructor_Challenge customer = new P07_Constructor_Challenge("Riyan", 620.09, "avbsfdc43@gmail.com");
            System.out.println(customer.getCustomerName());
            System.out.println(customer.getCustomerCreditLimit());
            System.out.println(customer.getCustomerEmail());
            
        P07_Constructor_Challenge secondcustomer = new P07_Constructor_Challenge();
            System.out.println(secondcustomer.getCustomerName());
            System.out.println(secondcustomer.getCustomerCreditLimit());
            System.out.println(secondcustomer.getCustomerEmail());

        P07_Constructor_Challenge thirdcustomer = new P07_Constructor_Challenge();
            System.out.println(thirdcustomer.getCustomerName());
            System.out.println(thirdcustomer.getCustomerCreditLimit());
            System.out.println(thirdcustomer.getCustomerEmail());


    }
    
}
