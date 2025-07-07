package keisyou_syori;

import java.util.Random;

public class K_syori {
	//private String name;
	private int health;
	private int magic;
	private int attack;
	private int speed;
	private int defense;
	
	
	public K_syori() {
        // ステータスをランダムな値で初期化
        Random random = new Random();
        this.health = random.nextInt(1000);
        this.magic = random.nextInt(1000);
        this.attack = random.nextInt(1000);
        this.speed = random.nextInt(1000);
        this.defense = random.nextInt(1000);
    }
	
	
	//setterの設定
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
	

