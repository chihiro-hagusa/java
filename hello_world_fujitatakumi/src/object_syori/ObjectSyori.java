package object_syori;

public class ObjectSyori {
	
	//フィールドの定義
	private String name;
    private double bodyLength;
    private int speed;
    private String scientificName;
    
    //コンストラクタの設定
    public ObjectSyori(String name, double bodyLength, int speed, String scientificName) {
        this.name = name;
        this.bodyLength = bodyLength;
        this.speed = speed;
        this.scientificName = scientificName;
    }
    
    //getterの設定
    public String getName() {
        return name;
    }
    public double getbodyLength() {
        return bodyLength;
    }
    public int getSpeed() {
        return speed;
    }
    public String getScientificName() {
        return scientificName;
    }
}

