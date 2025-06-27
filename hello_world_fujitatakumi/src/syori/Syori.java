package syori;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//publicクラスSyoriを作成
public class Syori {
	//各種文言を入れるための変数を作成
	public String greet;
	public String country;
	public String food;
	public String foodGenre;
	
	//現在の日時を取得
	LocalDateTime nowDate = LocalDateTime.now();
	DateTimeFormatter dtf1 =
			DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	public String formatNowDate = dtf1.format(nowDate);
	
	//コンストラクタを作成
	public Syori() {
		this.greet = "こんにちは";
		this.country = "日本";
		this.food = "寿司";
		this.foodGenre = "和食";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

	

}
