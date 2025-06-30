package getterandsetter_syori;

public class Gs_syori {
	private String name;
	private double bodyLength;
	private int speed;
	
	//setterの設定
	public void setName(String name) {
		this.name = name;
	}
	public void setBodyLength(double bodyLength) {
		this.bodyLength = bodyLength;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//getterの設定
	public String getName() {
		return this.name;
	}
	public double getBodyLength() {
		return this.bodyLength;
	}
	public int getSpeed() {
		return this.speed;
	}

}
