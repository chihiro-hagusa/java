package jikosyoukai_main;

import jikosyoukai_person.Person;

public class Main {

	//問題5：Main.javaの引数にweightの60を入れてください
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		   
		person1.print();
		
		//問題10：人数の合計を「合計○人です」と出力してください。
        System.out.println("合計" + Person.getCount() + "人です");
	}

}
