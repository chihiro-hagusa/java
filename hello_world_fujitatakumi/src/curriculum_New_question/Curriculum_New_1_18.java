package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
		public static void q1 (String greet,int number) {
			System.out.println( greet + number);
		}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		public static void q2 (int i,int j) {
			System.out.println(i * j);
		}
		
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
		public static void q3 (int[] line) {
			for(int score: line)
			System.out.println(score);
		}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		public static void q2 (double i,double j) {
			System.out.println(i + j);
		}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
		public static int[] q5 (int number) {
			
			int[] storeNumber =new int[number];
			
				for(int i=0; number > i; i++) {
				
					Random randNum = new Random();
					int randomNumber = randNum.nextInt(100) + 1;
			
					storeNumber[i] = randomNumber;
			
					System.out.println(storeNumber[i]);
				}
			return storeNumber;
		}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
		public static double q6 (int[] aveNumber) {
			double aveNum = 0;
			
			for (double ave: aveNumber) {
				aveNum += ave;
			}
			
			double result = aveNum / aveNumber.length;
			
			System.out.println(result);
			return result;
			
		}
		
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
		public static void q7 (double q6Num) {
			
			if(q6Num >= 50) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}		
			
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
	
		//Q1
		q1 ("Hello JavaSE ",11);
		
		//Q2
		q2 (10,100);
		
		//Q3
		int[] number = {0,1,2,3};
		q3 (number);
		
		//Q4
		q2 (10.5,100.5);
		
		//Q5
		int[] aveNumber = q5 (3);
		
		//Q6
		double q6Num = q6(aveNumber);
		
		//Q7
		q7 (q6Num);
	}	
}