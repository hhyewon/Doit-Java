package inheritance;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
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
		
		// 코드 한 줄로 다른 결과가 나옴 (다형성)
		
	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
