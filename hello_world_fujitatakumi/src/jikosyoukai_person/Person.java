package jikosyoukai_person;

public class Person {
	
	//問題1：インスタンスフィールドを定義してください
	//問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
	private String name;
	private int age;
	private double height;
	private double weight;
	
	private static int count = 0;
	
	//問題2：コンストラクタを定義してください
	public Person(String name, int age, double height, double weight){
	
	//問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		Person.count++;
	}
	
	//問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
	//問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
	public double bmi() {
		return this.weight / (this.height * this.height);
    }
	
	//問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
	//問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
	public void print() {
		System.out.println(name);
	    System.out.println(age);
	    System.out.println(height);
	    System.out.println();
		System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "才です");
        String formattedBmi = String.format("%.1f", this.bmi());
        System.out.println("BMIは" + formattedBmi + "です");
        System.out.println();
    }
	
	public static int getCount() {
        return Person.count;
    }
}