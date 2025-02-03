package objectExercise;

public class Land extends Property{
	private double size;
	
	Land(String name,String owner,String kind,int price,double size) {
		super(name,owner,kind,price);
		this.size = size;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getKind() {
		return this.kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getSize() {
		return this.size;
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	
	public void printData() {
		super.printData();
		System.out.println("広さ:" + this.size + "㎡");
		System.out.println("=============================");
	}



}
