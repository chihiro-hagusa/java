package keisyou_jikkou;

//スキャナーをインポート
import java.util.Scanner;

import keisyou_syori.KeisyouSyori;
//サブクラスをインポート
import keisyou_syori.Player;

public class KeisyouJikkou {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String playerName = scanner.nextLine();
		
		//処理側の呼び出し
		KeisyouSyori obj = new KeisyouSyori();
		Player objP = new Player(playerName);
		
		//出力の処理
		objP.setName(playerName);
		playerName = objP.getName();
		System.out.println("こんにちは「" + playerName + "」さん");
		
		System.out.println("ステータス");
		
		obj.setHealth();
		int health = obj.getHealth();
		System.out.println("HP : " + health);
		
		obj.setMagic();
		int magic = obj.getMagic();
        System.out.println("MP : " + magic);
        
        obj.setAttack();
		int attack = obj.getAttack();
        System.out.println("攻撃力 : " + attack);
        
        obj.setSpeed();
		int speed = obj.getSpeed();
        System.out.println("素早さ : " + speed);
        
        obj.setDefense();
		int defense = obj.getDefense();
        System.out.println("防御力 : " + defense);
        
        System.out.println("さあ冒険に出かけよう！");
        
        scanner.close();
	}

}
