package gamelevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("AdvancedLevel 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("AdvancedLevel jmp.");
	}

	@Override
	public void turn() {
		System.out.println("AdvancedLevel turn.");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("AdvancedLevel 입니다..");
	}

}
