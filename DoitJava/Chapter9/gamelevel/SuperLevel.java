package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("SuperLevel ���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("SuperLevel jmp.");
	}

	@Override
	public void turn() {
		System.out.println("SuperLevel turn.");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("SuperLevel �Դϴ�..");	
	}


}
