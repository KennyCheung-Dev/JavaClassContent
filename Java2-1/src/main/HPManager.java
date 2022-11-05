package main;

public class HPManager {
	public static HPManager Instance;
	
	public void GameStart() {
		if (Instance != null) {
			//Destory(this);
		}
		else
			Instance = this;
	}
	
	public int GetHP() {
		return 10;
	}
}
