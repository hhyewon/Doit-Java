package inheritance;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("Human");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("Tiger");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("Eagle");
	}
}


public class AnimalTest {

	public static void main(String[] args) {

		AnimalTest test = new AnimalTest();
		
		test.moveAnimal(new Human()); //= Animal animal = new Human();
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		// �ڵ� �� �ٷ� �ٸ� ����� ���� (������)
		
	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
