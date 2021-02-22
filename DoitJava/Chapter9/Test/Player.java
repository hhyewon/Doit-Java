package Test;

public class Player {

	private PlayerLevel level;

	//<<����>> **����Ʈ ������ �����!!!!**
	public Player() {
		level = new BeginnerLevel(); //�⺻�� BeginnerLevel�� ����
		level.showLevelMessage(); //�⺻ BeginnerLevel�� ���̰� ����
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage(); // ������ �� ������ ������ �޼����� ���̵��� �Ѵ�. ( ���� �ٸ� )
	}
	
	public void play(int count) {
		level.go(count);
	}
	
	
}
