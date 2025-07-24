package keisyou_jikkou;

import java.util.Random;
//スキャナーをインポート
import java.util.Scanner;

//サブクラスをインポート
import keisyou_syori.Player;

public class KeisyouJikkou {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String playerName = scanner.nextLine();
		
		//サブクラスの呼び出し
		Player objP = new Player(playerName);
		
		//ランダムの処理
		Random random = new Random();
		
		//サブクラスのコンソール出力文にランダムの数字が入るように処理
		objP.setHealth(random.nextInt(1000));
		objP.setMagic(random.nextInt(1000));
		objP.setAttack(random.nextInt(1000));
		objP.setSpeed(random.nextInt(1000));
		objP.setDefense(random.nextInt(1000));
		
		//サブクラスのprintメソッドを呼び出し
		objP.print();
		
        scanner.close();
	}

}
