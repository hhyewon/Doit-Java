package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 5000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();
		
		/* 
		 James 님의 남은 돈은4000 입니다.
		버스100번의 승객은 1 명이고, 수입은1000 입니다.
		Tomas 님의 남은 돈은3500 입니다.
		지하철2번의 승객은 1 명이고, 수입은1500 입니다.
		 */
		 
	}
}
