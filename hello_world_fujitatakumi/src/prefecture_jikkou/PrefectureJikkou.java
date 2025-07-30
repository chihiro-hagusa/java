package prefecture_jikkou;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import prefecture_syori.PrefectureSyori;

public class PrefectureJikkou {

	//都道府県の初期データを格納するリスト
	private static List<PrefectureSyori> allPrefectures = new ArrayList<>();

	public static void main(String[] args) {
		//都道府県データの初期化
		initializePrefectures();

		Scanner scanner = new Scanner(System.in);

		//入力の読み込み
		String inputLine = scanner.nextLine();

		//入力を解析
		//カンマで分割
		String[] parts = inputLine.split(",");
		List<Integer> selectedIndices = new ArrayList<>();
		//デフォルトは昇順
		String sortOrder = "asc";

		//入力を受けてのfor文
		for (int i = 0; i < parts.length; i++) {
			String part = parts[i].trim();
			if (part.equalsIgnoreCase("asc")) {
				sortOrder = "asc";
			} else if (part.equalsIgnoreCase("desc")) {
				sortOrder = "desc";
			} else {
				try {
					selectedIndices.add(Integer.parseInt(part));
				} catch (NumberFormatException e) {
					return; // エラーがあれば終了
				}
			}
		}

		//入力された値のソート
		if (sortOrder.equals("asc")) {
			Collections.sort(selectedIndices);
		} else {
			Collections.sort(selectedIndices, Collections.reverseOrder());
		}

		//選択された都道府県のリストを作成
		List<PrefectureSyori> selectedPrefectures = new ArrayList<>();
		for (int index : selectedIndices) {
			if (index >= 0 && index < allPrefectures.size()) {
				selectedPrefectures.add(allPrefectures.get(index));
			} else {
				return;
			}
		}

		//結果の表示
		for (PrefectureSyori pref : selectedPrefectures) {
			System.out.println(pref);
			System.out.println();
		}

		scanner.close();
	}

	//都道府県データを初期化するメソッド
	private static void initializePrefectures() {
		allPrefectures.add(new PrefectureSyori("北海道", "札幌市", 83424.0));
		allPrefectures.add(new PrefectureSyori("青森県", "青森市", 9646.0));
		allPrefectures.add(new PrefectureSyori("岩手県", "盛岡市", 15275.0));
		allPrefectures.add(new PrefectureSyori("宮城県", "仙台市", 7282.0));
		allPrefectures.add(new PrefectureSyori("秋田県", "秋田市", 11638.0));
		allPrefectures.add(new PrefectureSyori("山形県", "山形市", 9323.0));
		allPrefectures.add(new PrefectureSyori("福島県", "福島市", 13784.0));
		allPrefectures.add(new PrefectureSyori("茨城県", "水戸市", 6097.0));
		allPrefectures.add(new PrefectureSyori("栃木県", "宇都宮市", 6408.0));
		allPrefectures.add(new PrefectureSyori("群馬県", "前橋市", 6362.0));
		allPrefectures.add(new PrefectureSyori("埼玉県", "さいたま市", 3798.0));
	}
}