package objectExercise;

public class Property {
	protected String name;
	protected String owner;
	protected String kind;
	protected int price;
	
	Property(String name,String owner,String kind,int price) {
		this.name = name;
		this.owner = owner;
		this.kind = kind;
		this.price = price;
	}
	
	public void printData() {
		System.out.println("=============================");
		System.out.println("物件名：" + this.name);
		System.out.println("物件所有者名：" + this.owner);
		System.out.println("物件種別：" + this.kind);
		System.out.println("物件価格：" + this.price + "円");
	}
	
}
