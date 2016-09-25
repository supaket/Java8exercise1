 
package package2;
 
import package1.TheMall;

public class Customer {
    
    public void shopping() {
        TheMall.TotalPrice = TheMall.TotalPrice + 10;
        TheMall.TotalPrice = TheMall.TotalPrice + 5;
        TheMall.TotalPrice = TheMall.TotalPrice + 20;
    }
}
