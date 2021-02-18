package thisex;

class Person{
	
	String name;
	int age;
	
	public Person() { //defalut 값을 넣어주고 싶다면
		//주의 사항 !
		//생성자에서 다른 생성자를 호출하는 문장을 쓸 때 제약이 있음. (this)
		//내가 만약 이 안에 int i=0; 등의 코드를 넣었다면 this에서 오류가 남
		// this를 쓸 때는 그 어떤 문장도 올 수 없음.
		
		this("이름없음",1);
	} //이미 밑에 이름과 나이를 초기화해주는 함수가 있으니까 호출
	
	public Person(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	
	
	// 자기 자신의 인스턴스 주소를 반환 하기
	public Person returnSelf() { //자기자신 클래스명인 Person을 넣어준다.
		return this; //현재 인스턴스의 주소 값을 반환해줌.
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.name); //이름없음이 호출 됨
	
		System.out.println(p1.returnSelf());
	}
}
