package hiding;

class BirthDay{
	
	private int day;
	private int month;
	private int year;   // 이렇게만 쓰면 오류가 난다.
	
	// private 을 사용하면 다른 클레스에서 사용할 수 없다.
	// 값을 사용하기위해 퍼블릭 [메서드]를 넣는다.
		//getset
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month == 2) {
			if (day <1 || day>28) {
				System.out.println("날짜 오류입니다.");
			}
			else {
				this.day = day;
			}
		}
	} //모든게 public으로 오픈되어있을 떄 무결성이 침범될 수 있다.
	// 이걸 private
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}


public class BirthDayTest{
	//public은 하나만 존재
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();
		
	/*	day.month =2;
		day.year=2021;
		day.day=30; */
		
		day.setMonth(2);
		day.setDay(30);
		day.setYear(2021);
		
	}
}