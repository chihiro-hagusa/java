package keisyou_jikkou;

//スキャナーをインポート
import java.util.Scanner;

//サブクラスをインポート
import keisyou_syori.Player;

public class KeisyouJikkou {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String playerName = scanner.nextLine();
		
		Player player = new Player(playerName);
		
		//出力の処理
		System.out.println("こんにちは「" + player.getName() + "」さん");
        System.out.println("ステータス");
        System.out.println("HP : " + player.getHealth());
        System.out.println("MP : " + player.getMagic());
        System.out.println("攻撃力 : " + player.getAttack());
        System.out.println("素早さ : " + player.getSpeed());
        System.out.println("防御力 : " + player.getDefense());
        System.out.println("さあ冒険に出かけよう！");
        
        scanner.close();
	}

}
