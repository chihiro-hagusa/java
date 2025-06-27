package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		//Scannerで入力できるようにする
		Scanner scanner = new Scanner (System.in);

		//初期状態の出力
		System.out.println("生徒の人数を入力してください（2以上）: ");

		//生徒の数の入力
		int students = scanner.nextInt();

		//生徒数と教科数の配列
		int[][] points = new int[students][4];

		//平均点等で使用する変数
		double ave = 0;

		double total = 0;

		double subAll = 0;

		double subAve = 0;

		double allAve = 0;

		double allTotal = 0;

		double[] allNumber= new double[4];

		//for文で点数の入力を回す
		for (int i = 0; i < students; i++) {

			System.out.println( (i + 1 ) + "人目の『英語』の点数を入力してください :");

			points[i][0] = scanner.nextInt();

			System.out.println( (i + 1 ) + "人目の『数学』の点数を入力してください :");

			points[i][1] = scanner.nextInt();

			System.out.println( (i + 1 ) + "人目の『理科』の点数を入力してください :");

			points[i][2] = scanner.nextInt();

			System.out.println( (i + 1 ) + "人目の『社会』の点数を入力してください :");

			points[i][3] = scanner.nextInt();
		}


		//生徒ごとの平均点を出す処理
		for (int i = 0; i < students; i++) {

			for ( int sub = 0; sub < 4; sub++) {

				total += points[i][sub];

			}

			ave = total / 4;

			total = 0;

			System.out.println ( (i + 1 ) + "人目の平均点は" + String.format("%.2f",ave) + "点です。");

		}

		//教科の配列を作成
		String[] stringArray = { "英語", "数学", "理科","社会" };

		//教科ごとの平均点を出していく処理
		for (int i = 0; i < 4; i++) {

			for ( int score = 0; score < students; score++ ) {

				subAll += points[score][i]; 
			}

			subAve = subAll / students;

			allNumber[i] = subAve;

			subAll = 0;

			System.out.println ( stringArray[i] + "の平均点は" + String.format("%.2f",subAve) + "点です。");

		}

		for (double all: allNumber ) {

			allAve += all;

		}
		//全体の平均点を出す処理
		allTotal = allAve / 4;

		System.out.println ("全体の平均点は" + String.format("%.2f",allTotal) + "点です。");

		scanner.close();
	}



}


