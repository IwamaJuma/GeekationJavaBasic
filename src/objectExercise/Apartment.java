package objectExercise;

public class Apartment extends Property {
	private String plan;
	
	Apartment(String name,String owner,String kind,int price,String plan) {
		super(name,owner,kind,price);
		this.plan = plan;
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
	
	public String getPlan() {
		return this.plan;
	}
	
	public void setPlan(String plan) {
		this.plan = plan;
	}
	
	public void printData() {
		super.printData();
		System.out.println("間取り:" + this.plan);
		System.out.println("=============================");
	}


}
