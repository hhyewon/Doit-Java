package abstractex;

public class DeskTop extends Computer{

	@Override
	public void display() { //여기서 구체적으로 구현
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");		
	}
		
}
