package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {

		/*(6)入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
		 *・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可
		 *・Switch文内でテレビとディスプレイは続けて書くようにしてください、
		 *　条件演算子で出力される値を変更してください
		 *・テレビとディスプレイは同じ商品扱いとし、
		 *　ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力してください 
		 *・例：テレビと受け取った場合、→「テレビの残り台数は〇〇台です」※〇〇はランダムで出た数字
		 *・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
		 *・入力された値は「、」区切りで指定してください
		 *・そのほかの値が入力された場合下記を出力されるようにしてください
		 *　『受け取った値』は指定の商品ではありません
		 *・残り台数は0〜11までのランダムな値が出力されるようにしてください
		 */

		//スキャナーで入力を見る
		Scanner sc = new Scanner(System.in);

		//String形式の入力を監視
		String str = sc.nextLine();

		//句読点で区切られるように設定
		String[] kaden = str.split("、");

		//flagをfalseに設定
		boolean flag = false;

		//テレビ用の変数を設定
		int tvNum = 0;

		//for文で設問の通りに出力されるように設定
		for (String item: kaden) {

			//残りの数をランダムで出るように設定
			Random kadenRand = new Random();
			int num = kadenRand.nextInt(12);



			//各商材ごとの設定
			switch (item) {

			case "パソコン":

				System.out.println("パソコンの残り台数は" + num + "台です");

				break;

			case "冷蔵庫":

				System.out.println("冷蔵庫の残り台数は" + num + "台です");

				break;

			case "扇風機":

				System.out.println("扇風機の残り台数は" + num + "台です");

				break;

			case "洗濯機":

				System.out.println("洗濯機の残り台数は" + num + "台です");

				break;

			case "加湿器":

				System.out.println("加湿器の残り台数は" + num + "台です");

				break;
				//テレビとディスプレイの処理をくっつける
			case "テレビ":
			case "ディスプレイ":

				System.out.println(flag ? item + "の残り台数は" + ( 11 - tvNum ) + "台です" : item + "の残り台数は" + num + "台です");

				tvNum = num;

				flag = true;

				break;

				//指定商品以外の処理
			default:

				System.out.println("『 " + item + " 』は指定の商品ではありません");

				break;
			}
		}

		sc.close();
	}

}
