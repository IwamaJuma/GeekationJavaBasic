package objectExercise;

public class Main {

	public static void main(String[] args) {
		Property at = new Apartment("いい感じアパートメント","山田 マンション太郎","マンション",50000000,"3LDK");
		Property ld = new Land("いい感じの土地","山田 土地太郎","土地",8000000,105.2);
		
		at.printData();
		ld.printData();

	}

}
