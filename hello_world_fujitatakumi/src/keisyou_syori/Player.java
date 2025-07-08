package keisyou_syori;

public class Player extends KeisyouSyori {
	//スーパークラス K_syori を継承
		private String name;
		
		//スーパークラスを継承
		public Player(String name) {
			super();
			this.name = name;
		}
		
		//名前のsetter
		public void setName(String name) {
			this.name = name;
		}
		
		//名前のgetter
		public String getName() {
	        return this.name;
	    }
		
}
