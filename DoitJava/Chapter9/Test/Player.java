package Test;

public class Player {

	private PlayerLevel level;

	//<<오답>> **디폴트 생성자 만들기!!!!**
	public Player() {
		level = new BeginnerLevel(); //기본을 BeginnerLevel로 설정
		level.showLevelMessage(); //기본 BeginnerLevel을 보이게 설정
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage(); // 레벨업 할 때마다 레벨업 메세지를 보이도록 한다. ( 위랑 다름 )
	}
	
	public void play(int count) {
		level.go(count);
	}
	
	
}
