package gettersetter_jikkou;

//処理側のインポート
import getterandsetter_syori.Gs_syori;

public class Gs_jikkou {

	//メイン
	public static void main(String[] args) {
		
		//処理側の呼び出し
		Gs_syori obj = new Gs_syori ();
		
		//問題に合うようにsetとgetを使用して変数を代入
		obj.setName("ライオン");
		String name = obj.getName();
		System.out.println("動物名：" + name);
		
		obj.setBodyLength(2.1);
		double bodyLength = obj.getBodyLength();
		System.out.println("体長：" + bodyLength + "m");
		
		obj.setSpeed(80);
		double speed = obj.getSpeed();
		System.out.println("速度：" + speed + "km/h");
	}

}
