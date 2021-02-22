package Test;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("BeginnerLevel run");
	}

	@Override
	public void jump() {
		System.out.println("BeginnerLevel jump");		
	}

	@Override
	public void turn() {
		System.out.println("BeginnerLevel turn");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("BeginnerLevel showLevelMessage");
	}

	
}
