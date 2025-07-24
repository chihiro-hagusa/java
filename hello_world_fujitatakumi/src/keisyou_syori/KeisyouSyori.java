package keisyou_syori;

public class KeisyouSyori {
	private String name;
	private int health;
	private int magic;
	private int attack;
	private int speed;
	private int defense;
	
	//KeisyouSyoriのコンストラクタの設定
	public KeisyouSyori(String playerName) {
        this.name = playerName;
    }
	
	
	//setterの設定
	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(int health) {
        this.health = health;
    }
    public void setMagic(int magic) {
        this.magic = magic;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }

		
	//getterの設定
    public String getName() {
        return this.name;
    }
	public int getHealth() {
		return this.health;
	}
	public int getMagic() {
		return this.magic;
	}
	public int getAttack() {
		return this.attack;
	}
	public int getSpeed() {
		return this.speed;
	}
	public int getDefense() {
		return this.defense;
	}


	

}
	