package interfaceex;

public interface Sell {
	void sell();
	
	default void order() { //buy와 sell에 동일한 디폴트 메서드
		System.out.println("구매 주문");
	}
}
