package jikosyoukai_person_31;

public class Person {
	
	private String name;
	private int age;
	private double height;
	private double weight;
	
	//問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）
	private static int count = 0;
	
	//問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください 
	public Person(String name, int age, double height, double weight){
	  this.name = name;
	  this.age = age;
	  this.height = height;
	  this.weight = weight;
	  Person.count++;
	 }
	
	//問題4：クラスメソッド「printCount」を定義してください（データ型：void）
		public static void printCount() {
			
		//	問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください
			System.out.println("合計" + count + "人です");
		}

	 public double bmi(){
	  return this.weight / this.height / this.height;
	 }

	 public void print(){
	  System.out.println("名前は" + this.name + "です");
	  System.out.println("年は" + this.age + "です");
	 }
	 
	 public static int getCount() {
	        return Person.count;
	    }

}
