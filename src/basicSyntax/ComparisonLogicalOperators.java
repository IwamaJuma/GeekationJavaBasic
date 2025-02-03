package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		System.out.println( a > b );
		
		boolean isSunny = true;
		boolean isWarm = true;
		System.out.println( isSunny && isWarm );
		
		int x = 15;
		int y = 31;
		System.out.println( x >= 0 && y%2==0 );
		
		boolean hasPermission = false;
		System.out.println( !hasPermission );
		

	}

}
