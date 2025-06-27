package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog obj = new Dog();
		System.out.println( obj.animalName );
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog objName = new Dog(10);
		System.out.println( objName.animalNumber );
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		LocalDateTime nowDate = LocalDateTime.now();
		DateTimeFormatter dtf1 =
				DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		String formatNowDate = dtf1.format(nowDate);
		System.out.println(formatNowDate);
	}
}
