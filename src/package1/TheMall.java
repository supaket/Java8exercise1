package package1;

import package2.Customer;

public class TheMall {
    
    public static int TotalPrice = 0;
    
    public static void main(String args[]) {
        Customer customer = new Customer();
        customer.shopping();
    }
}
