package Test;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("AdvancedLevel run");
	}

	@Override
	public void jump() {
		System.out.println("AdvancedLevel jump");
	}

	@Override
	public void turn() {
		System.out.println("AdvancedLevel turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("AdvancedLevel showLevelMessage");
	}

}
