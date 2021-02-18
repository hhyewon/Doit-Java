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
		 James ���� ���� ����4000 �Դϴ�.
		����100���� �°��� 1 ���̰�, ������1000 �Դϴ�.
		Tomas ���� ���� ����3500 �Դϴ�.
		����ö2���� �°��� 1 ���̰�, ������1500 �Դϴ�.
		 */
		 
	}
}
