
public class TestDriver {

	public static void main(String[] args) {
		ShoppingCart cart1 = new ShoppingCart();
		cart1.checkout(1500);	
		cart1.setPaymentStrategy(new CredicardPayment());
		cart1.checkout(2000);
		cart1.setPaymentStrategy(new ScanPayment());
		cart1.checkout(10000);		
	}

}
