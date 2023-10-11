package Day12.Assignment3;

public class Bill {
    int billId ;
    double amount ;
    static final double TAX_RATE = 5 ;
    static final double DISCOUNT_RATE = 10 ;
    static final double SPECIAL_OFFER_DISCOUNT = 25 ;
    void calculateTotalBill(){
        double totalAmount = amount + (amount * (TAX_RATE / 100));
        amount = totalAmount ;
    }
    void applyDiscount(){
        amount = amount - (amount * (DISCOUNT_RATE / 100));
    }
    void displayBill(){
        System.out.println() ;
    }
}
