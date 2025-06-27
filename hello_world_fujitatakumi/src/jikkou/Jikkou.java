package jikkou;

//Syoriをインポート
import syori.Syori;

//publicクラスJikkouを作成
public class Jikkou {

	public static void main(String[] args) {
		
		//問題に合うようにSyoriから変数を代入
		Syori obj = new Syori();
		System.out.println( obj.greet + "！ここは" + obj.country + "です！" );
		System.out.println( "この" + obj.food + "はうまい" );
		System.out.println( obj.food + "は" + obj.foodGenre +"です" );
		System.out.println( "今の現在日時は" + obj.formatNowDate + "です" );
	}

}
