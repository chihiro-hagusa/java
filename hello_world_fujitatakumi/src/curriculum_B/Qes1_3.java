package curriculum_B;

// Randamの読み込み
import java.util.Random;
// Scannerの読み込み
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		/* (1)ログイン時の入力チェックシステムを下記条件で作成してください
		 * ・コンソールにユーザー名を入力できるようにしてください
		 * ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		 * ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		 * ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		 */

		//Scannerで入力を読み取れるようにする
		Scanner scanner = new Scanner(System.in);

		//文字列の入力を受け取る
		String name = "";

		//半角英数の正規表現を宣言
		String half = "^[A-za-z0-9]+$";

		//ループの入り口を作成
		while (true) {

			//コンソールに入力された文字を監視
			name = scanner.nextLine();

			//10文字を超えた場合の条件の記述
			if (name.length() > 10) {
				System.out.println("「名前を10文字以内にしてください」");

			} else if (name.isEmpty() || name == null) {
				//↑↓0文字以下もしくはnullの場合の条件の記述	
				System.out.println("「名前を入力してください」");

				//(2)ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください	
			} else if (!(name.matches(half))) {
				System.out.println("「半角英数字のみで名前を入力してください」");

				//正常な値だった場合のコンソールの出力
			} else {
				System.out.println("「ユーザー名「" + name + "」を登録しました」");

				//ループを抜けるためのbreak
				break;
			}

		}

		/* (3)じゃんけんのシステムを下記の条件で作成してください
		//	 * ・「0はグー、1：チョキ、2：パー」とすること
		 * 
		->	 * ・じゃんけんに勝つまでループすること
		 * 
		//	 * ・一回ごとに自分の手と相手の手を下記の通り出力してください
		 *  ユーザー名「name」を登録しました
		 *  nameの手は「パー」
		 *  相手の手は「グー」
		 *  
		//	 * ・条件分岐の設定
		 * 
		//	 * ・自分がじゃんけんに勝った場合、下記が出力されるようにしてください
		 *  次は俺にリベンジさせて
		 *  
		//	 * ・自分がじゃんけんでグーに負けた場合、下記が出力されるようにしてください
		 *  俺の勝ち！
		 *  負けは次につながるチャンスです！
		 *  ネバーギブアップ！
		 *  
		//	 * ・自分がじゃんけんでチョキに負けた場合、下記が出力されるようにしてください
		 *  俺の勝ち！
		 *  たかがじゃんけん、そう思ってないですか？
		 *  それやったら次も、俺が勝ちますよ
		 *  
		//	 * ・自分がじゃんけんでパーに負けた場合、下記が出力されるようにしてください
		 *  俺の勝ち！
		 *  なんで負けたか、明日まで考えといてください。
		 *  そしたら何かが見えてくるはずです
		 *  
		//	 * ・あいこの場合、下記が出力されるようにしてください
		 *  DRAW あいこ もう一回しましょう！
		 *  
		->	 * じゃんけんを行った回数を表示してください
		 *  勝つまでにかかった合計回数は1回です
		 *  
		//	 *  ユーザー名が正常の場合じゃんけんのシステムが起動するようにしてください
		 */

		//じゃんけんの手の変数の配列
		String[] hands = { "グー", "チョキ", "パー" };


		
		boolean win = false;
		
		int attempts = 0;
		
		//入力ループの作成
		while (!win) {
			
			attempts++;
			
			//ユーザーの手の読み取り
			int userHands = scanner.nextInt();
			
			//相手(PC)の手の作成
			Random pcRand = new Random();
			int pcHands = pcRand.nextInt(3);

				//手の出力

				System.out.println(name + "の手は「" + hands[userHands] + '」');

				System.out.println("相手の手は「" + hands[pcHands] + '」');
				
				System.out.println("");
				
				

				//結果の出力
				{
					if (userHands == pcHands) {

						System.out.println("DRAW あいこ もう一回しましょう！");

					} else if ((userHands == 0 && pcHands == 1) ||

							(userHands == 1 && pcHands == 2) ||

							(userHands == 2 && pcHands == 0)) {

						System.out.println("やるやん。");
						
						System.out.println("次は俺にリベンジさせて");
						
						win = true;

					} else if (userHands == 1 && pcHands == 0) {

						System.out.println("俺の勝ち！");

						System.out.println("負けは次につながるチャンスです！");

						System.out.println("ネバーギブアップ！");

					} else if (userHands == 2 && pcHands == 1) {

						System.out.println("俺の勝ち！");

						System.out.println("たかがじゃんけん、そう思ってないですか？");

						System.out.println("それやったら次も、俺が勝ちますよ");

					} else {

						System.out.println("俺の勝ち！");

						System.out.println("なんで負けたか、明日まで考えといてください。");

						System.out.println("そしたら何かが見えてくるはずです");

					}
			}
		}
		
		System.out.println("");
		
		System.out.println("勝つまでにかかった合計回数は" + attempts + "回です");
	
		scanner.close();
	}
}