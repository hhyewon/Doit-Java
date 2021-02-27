package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		customer.order();
		buyer.order();
		seller.order();
		
		/*
		 * 고객 판매주문
		 * 고객 판매주문  //오버라이딩된 메서드가 불림
		 * 고객 판매주문  //오버라이딩된 메서드가 불림
		 */
		
	}

}
