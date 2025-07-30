package prefecture_syori;

public class PrefectureSyori {
	private String name;
	private String capital;
	private double area;
	
	public PrefectureSyori (String name, String capital, double area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}
	
	//getterの作成
	public String getName() {
		return name;
	}
	public String getCapital() {
		return capital;
	}
	public double getArea() {
		return area;
	}
	
	//オーバーライド
	@Override
    public String toString() {
        return "都道府県名: " + name + "\n" +
               "県庁所在地: " + capital + "\n" +
               "面積: " + area + "km2";
    }

}
