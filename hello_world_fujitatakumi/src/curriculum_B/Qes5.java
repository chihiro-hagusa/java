package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {

		//以下、for文のループの記述
		
		//iの値を初期化し、20になるまで1ずつ増やし続ける
		for (int i = 1; i <= 20; i++) {

			//StringBuilderでStringを変更可能な状態にする
			StringBuilder rowBuilder = new StringBuilder();

			//jの値を初期化し、9になるまで1ずつ増やし続ける
			for (int j = 1; j <= 9; j++) {

				//掛け算の記述になるように設定、001のような数字になるようにする
				String item = String.format("%03d * %03d = %03d", j, i, (i * j));

				//上記itemをrowBuilderで出るようにする
				rowBuilder.append(item);

				//if文でjが9になるまで式の間に||を挟む
				if (j < 9) {

					rowBuilder.append(" || ");
				}
			}

			//コンソールに出力する処理、見本が2行ずつ空いているように見えるので空白の行も追加
			System.out.println(rowBuilder.toString());

			System.out.println();
			
			System.out.println();
		}

	}

}
