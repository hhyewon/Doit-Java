package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("BeginnerLevel õõ�� �޸��ϴ�.");
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
		System.out.println("***�ʺ��� �����Դϴ�.***.");
	}

}
