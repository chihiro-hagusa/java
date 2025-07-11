package object_jikkou;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import object_syori.ObjectSyori;

public class ObjectJikkou {

	public static void main(String[] args) {
		
		//問に合うようにmapの作成
		 Map<String, String> scientificNames = new HashMap<>();
	        scientificNames.put("ライオン", "パンテラ レオ");
	        scientificNames.put("ゾウ", "ロクソドンタ サイクロティス");
	        scientificNames.put("パンダ", "アイルーロポダ メラノレウカ");
	        scientificNames.put("チンパンジー", "パン トゥログロディテス");
	        scientificNames.put("シマウマ", "チャップマンシマウマ");
	        scientificNames.put("インコ", "不明");
	        
	        //コンソールに入力できるようにする
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("コンソールに文字を入力してください");
	        String inputLine = scanner.nextLine();

	        //,で区切る配列の作成
	        String[] animalDataArray = inputLine.split(",");

	        System.out.println("コンソール出力結果");

	        //ループ処理で名前、体長、速さを:で区切られた入力から当てはめる
	        for (String animalData : animalDataArray) {
	            String[] details = animalData.split(":");
	            String name = details[0];
	            double bodyLength = Double.parseDouble(details[1]);
	            int speed = Integer.parseInt(details[2]);

	            // マップから対応する学名を取得
	            String scientificName = scientificNames.getOrDefault(name, "不明");

	            // animalクラスの新しいインスタンスを作成
	            ObjectSyori animal = new ObjectSyori(name, bodyLength, speed, scientificName);

	            // 動物の情報を問に合った形式でコンソールに出力
	            System.out.println("動物名 : " + animal.getName());
	            System.out.println("体長 : " + String.format("%.1f", animal.getbodyLength()) + "M"); // 体重は小数点以下1桁にフォーマット
	            System.out.println("速度 : " + animal.getSpeed() + "km/h");
	            System.out.println("学名 : " + animal.getScientificName());
	            System.out.println();
	        }

	        scanner.close();
	    }
	}


