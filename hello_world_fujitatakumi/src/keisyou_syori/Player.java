package keisyou_syori;

//スーパークラスを継承
public class Player extends KeisyouSyori {
		
		//Playerのコンストラクタの設定
		public Player(String playerName) {
		super(playerName);
		
	}

		//printメソッドの設定
		public void print(){
			System.out.println("こんにちは「" + super.getName() + "」さん");
			System.out.println("ステータス");
			System.out.println("HP : " + super.getHealth());
			System.out.println("MP : " + super.getMagic());
			System.out.println("攻撃力 : " + super.getAttack());
			System.out.println("素早さ : " + super.getSpeed());
			System.out.println("防御力 : " + super.getDefense());
			System.out.println("さあ冒険に出かけよう！");
		}
}
