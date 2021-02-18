package thisex;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year =year;
		//자신의 메모리를 가리키는 this
	//this를 안 넣을 시 두 year는 같은 매개변수인 year를 참조
		//두 이름이 다를 시는 괜찮음 ex) year= y
		//하지만 자바에서는 set이나 get 메서드를 쓸 때 같은 이름으로 자주 쓴다.
	}
	public void printThis() {
		//this가 뭘 가리키는지 확인하기
		System.out.println(this);
	}
}

public class ThisExample {
	public static void main(String[] args) {
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		//같은 this지만 다른 인스턴스 값을 가진다 !
		System.out.println(b1);
		b1.printThis();  //두 값이 동일
		
		System.out.println(b2);
		b2.printThis(); // b1과 같은 this인데 값이 다름
		
	}
}
