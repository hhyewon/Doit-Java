package cooperation;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) { //모든 버스는 번호를 가지고 생성해야한다. 하면 생성 //아닌경우 디폴트 생성자로 만들면 됨
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) { //승객을 태웠을 경우
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("지하철" + lineNumber + "번의 승객은 "+ passengerCount + " 명이고, 수입은" 
	+ money + " 입니다.");
	}
}
