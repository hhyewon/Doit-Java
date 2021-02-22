package Test;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("SuperLevel run");
	}

	@Override
	public void jump() {
		System.out.println("SuperLevel jump");		
	}

	@Override
	public void turn() {
		System.out.println("SuperLevel turn");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("SuperLevel showLevelMessage");
	}

}
