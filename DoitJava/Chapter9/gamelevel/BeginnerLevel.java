package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("BeginnerLevel 천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("BeginnerLevel jmp");
	}

	@Override
	public void turn() {
		System.out.println("BeginnerLevelturn.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***초보자 레벨입니다.***.");
	}

}
