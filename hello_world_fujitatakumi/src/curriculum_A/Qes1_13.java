package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		/*
		 * (1)下記9個をローカル変数として宣言のみしてください
		 * ・バイト型・短整数型・整数型・長整数型
		 * ・単精度浮動小数点数型・倍精度浮動小数点数型
		 * ・文字型・文字列型
		 * ・ブーリアン型 
		 */
		
		//バイト型の宣言
		byte myByte;
		
		//短整数型の宣言
		short myShort;
		
		//整数型の宣言
		int myInt;
		
		//長整数型の宣言
		long myLong;
		
		//単精度浮動小数点数型の宣言
		float myFloat;
		
		//倍精度浮動小数点数型の宣言
		double myDouble;
		
		//文字型の宣言
		char myChar;
		
		//文字列型の宣言
		String myStr;
		
		//ブーリアン型の宣言
		boolean myBoo;
		
		
		
		
		
		//(2)それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		
		//バイト型の初期値の代入、及び初期化
		myByte = 0;
		
		//短整数型の初期値の代入、及び初期化
		myShort = 0;
		
		//整数型の初期値の代入、及び初期化
		myInt =0;
		
		//長整数型の初期値の代入、及び初期化
		myLong = 0L;
		
		//単精度浮動小数点数型の初期値の代入、及び初期化
		myFloat = 0.0f;
		
		//倍精度浮動小数点数型の初期値の代入、及び初期化
		myDouble = 0.0d;
		
		//文字型の初期値の代入、及び初期化
		myChar = '\u0000';
		
		//文字列型の初期値の代入、及び初期化
		myStr = null;
		
		//ブーリアン型の初期値の代入、及び初期化
		myBoo = false;
		
		
		
		
		
		/*(3)初期化をしたそれぞれの変数に下記の値を代入してください
		 * ・バイト型		10
		 * ・短整数型		100
		 * ・整数型		1000
		 * ・長整数型		10000
		 * ・単精度浮動小数点数型		9.5
		 * ・倍精度浮動小数点数型		10.5
		 * ・文字型		a
		 * ・文字列型		ハロー
		 * ・ブーリアン型		true
		 */
		
		//バイト型に値を代入
		myByte = 10;
		
		//短整数型に値を代入
		myShort = 100;
		
		//整数型に値を代入
		myInt = 1000;
		
		//長整数型に値を代入
		myLong = 10000;
		
		//単精度浮動小数点数型に値を代入
		myFloat = 9.5F;
		
		//倍精度浮動小数点数型に値を代入
		myDouble = 10.5;
		
		//文字型に値を代入
		myChar = 'a';
		
		//文字列型に値を代入
		myStr = "ハロー";
		
		//ブーリアン型に値を代入
		myBoo = true;
		
		
		
		
		
		/*(4)下記の通りにコンソール出力されるようにしてください
		 * 上記で作成した変数を必ず使用すること
		 * 11110		11110
		 * 20		20
		 * a ハロー true		a ハロー true
		 * 11130		11130	数字を全て足す
		 * 10000000000		10000000000	小数点以外の数字を全てかける
		 * 0.105		0.105	10.5割る100をする
		 * -90		-90	10引く100をする
		 */
		
		//以下、コンソールに出力する処理
		
		//myByte,myShort,myInt,myLongを全て足して11110を出力
		System.out.println(myByte + myShort + myInt + myLong);
		
		/* myfloatとmyDoubleをdouble型で合計
		 * int型に変換し、小数点第1位を消去
		 * intResultの20を出力
		 */
		double sum = myFloat + myDouble;
		int intResult = (int) sum;
		System.out.println(intResult);
		
		//myChar,myStr,myBooを使用してa ハロー trueを出力
		System.out.print(myChar);
		System.out.print(' ' + myStr + ' ');
		System.out.println(myBoo);
		
		//上で使用したintResult,myByte,myShort,myInt,myLongを全て足して11130を出力
		
		System.out.println(intResult + myByte + myShort + myInt + myLong);
		
		//myByte,myShort,myInt,myLongを全てかけて10000000000を出力
		System.out.println(myByte * myShort * myInt * myLong);
		
		//myDoubleでmyShortを割って0.105を出力
		System.out.println(myDouble / myShort);
		
		//myByteからmyShortを引いて-90を出力
		System.out.println(myByte - myShort);
		
		
		
		
		
		/* (5)次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		 * 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		 * String num="20";
		 * int num1=23;
		 * System.out.println("ハローJAVA"+(num+num1));
		 */
		
		//String型からint型に修正,ダブルクォーテーションがついていると文字になるのでそれも外す
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA"+(num+num1));
		
		
		
		
		
		/* (6)『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		 * ローカル変数に代入し○○に入れてください
		 * 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		 * 
		 * ↓↓format↓↓
		 * 「初めまして○○です」
		 * 「年齢は○○歳です」
		 * 「身長は○○cmです」
		 * 「体重は○○kgです」
		 * 「好きな食べ物は○○です」
		 */
		
		//String型で名前を宣言
		String name = "山田太郎";
		
		//int型で年齢を宣言
		int age = 18;
		
		//double型で身長を宣言
		double tall = 170.5;
		
		//double型で体重を宣言
		double bodyWeight = 62.2;
		
		//String型で食べ物を宣言
		String food = "寿司";
		
		//以下、コンソールに出力する処理
		
		//名前
		System.out.println("初めまして" + name + "です");
		
		//年齢
		System.out.println("年齢は" + age + "歳です");
		
		//身長
		System.out.println("身長は" + tall + "cmです");
		
		//体重
		System.out.println("体重は" + bodyWeight + "kgです");
		
		//食べ物
		System.out.println("好きな食べ物は" + food + "です");
		
		
		
		
		
		/* (7)6で作成した自己紹介に続いてBMIが出力されるようにしてください
		 * 「BMIは○○です」
		 * ただし計算は数値を直書きせず、全て変数を使ってすること
		 */
		
		/* BMIの計算方法は”体重(kg) / (身長(m))^2”
		 * 体重はそのままで身長をmに直して2乗すれば求められる
		 */
		
		
		//身長をmに直す　100の値は問3のmyShortを使用する
		double tallIndexForBmi = tall / myShort;
		
		//結果を2乗する
		double tallResultForBmi = tallIndexForBmi * tallIndexForBmi;
		
		//BMIの計算式に当てはめる
		double bmiResult = bodyWeight / tallResultForBmi;
		
		//BMIの数値を整数にする
		int intBmiResult = (int) bmiResult;
		
		//コンソールに出力
		System.out.println("BMIは" + intBmiResult + "です");
		
		
		
		
		
		/* (8)6で宣言した変数に再代入し下記の通りコンソールに出力してください
		 * 初めまして鈴木一郎です
		 * 年齢は24歳です
		 * 身長168.5cmです
		 * 体重は64.2kgです
		 * 好きな食べ物はオムライスです
		 * BMIは22.6です
		 */
		
		//変数の再代入をする
		
		//名前
		name = "鈴木一郎";
				
		//年齢
		age = 24;
		
		//身長
		tall = 168.5;
		
		//体重
		bodyWeight = 64.2;
		
		//食べ物
		food = "オムライス";
		
		//BMI
		bmiResult = 22.6;
		
		//以下、コンソールに出力する処理
		
		//名前
		System.out.println("初めまして" + name + "です");
				
		//年齢
		System.out.println("年齢は" + age + "歳です");
				
		//身長
		System.out.println("身長は" + tall + "cmです");
				
		//体重
		System.out.println("体重は" + bodyWeight + "kgです");
				
		//食べ物
		System.out.println("好きな食べ物は" + food + "です");
		
		//BMI
		System.out.println("BMIは" + bmiResult + "です");
		
		
		
		
		
		/* (9)8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		 * 　初めまして鈴木一郎です
		 * 　年齢は48歳です
		 * 　身長337.0cmです
		 * 　体重は128.4kgです
		 * 　好きな食べ物はオムライスです
		 * 　BMIは11.31です
		 */
		
		//年齢、身長、体重に自己代入
		age = age +24;
		
		tall = tall + 168.5;
		
		bodyWeight = bodyWeight + 64.2;
		
		bmiResult = bmiResult / 2 + 0.01;
		
		//以下、コンソールに出力する処理
		
		//名前
		System.out.println("初めまして" + name + "です");
						
		//年齢 
		System.out.println("年齢は" + age + "歳です");
						
		//身長
		System.out.println("身長は" + tall + "cmです");
						
		//体重
		System.out.println("体重は" + bodyWeight + "kgです");
						
		//食べ物
		System.out.println("好きな食べ物は" + food + "です");
				
		//BMI
		System.out.println("BMIは" + bmiResult + "です");
		
		
		
		
		
		//(10)8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		
		//(9)で年齢の数字を触ったので、元に戻す
		
		age = age - 24;
		
		//boolean型の作成
		boolean isOverTwentyFive = true;
		
		//問8のageを元に条件式の作成
		isOverTwentyFive = (age >= 25);
		
		//結果をコンソールに出力
		System.out.println(isOverTwentyFive);
		
		
		
		
		
		//(11)8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		
		//(9)で身長、体重を触ったので元に戻す
		
		tall = tall - 168.5;
		
		bodyWeight = bodyWeight - 64.2;
		
		//String.valueOfを使用してage,tall,bodyWeightを文字列型に変換
		String ageStr = String.valueOf(age);
		
		String tallStr = String.valueOf(tall);
		
		String bodyWeightStr = String.valueOf(bodyWeight);
		
		//コンソールに繋げて出力
		System.out.println(ageStr + tallStr + bodyWeightStr);
		
		
		
		
		
		//(12)11で変換した【年齢・身長】を整数型に変換して出力してください
		
		//Integer.valueOfを使用してageStrを整数型に変換
		int ageInt = Integer.valueOf(ageStr);
		
		//tallStrは小数の為、Double.parseDoubleを使用してdouble型に変換
		double tallDouble = Double.parseDouble(tallStr);
		
		//コンソールに出力
		System.out.println(ageInt + tallDouble);
		
		
		
		
		
		/* (13)12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		 * ただしif文は使わないでください
		 */
		
		//boolean型の作成
		boolean isResult = true;
		
		//問12のageInt,tallDoubleを元に条件式の作成
		isResult = (ageInt == 25 & tallDouble >=160);
		
		//結果をコンソールに出力
		System.out.println(isResult);
	}
}