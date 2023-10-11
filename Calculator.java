
public class Calculator {

	public static int add( int a, int b) {
		return a+b;
	}
	
	public static double add( double a, double b) {
		return a+b;
	}
	
	public static double add( double a, int b) {
		return a+b;
	}
	
	public static double add( int a, double b) {
		return a+b;
	}
	
	public static void main(String[] Args) {
		System.out.println(" 7 + 3 = " + add(7, 3));
		System.out.println(" 8.1 + 1.9 = " + add(8.1, 1.9));
		System.out.println(" 6.5 + 3 = " + add(6.5, 3));
		System.out.println(" 7 + 3.8 = " + add(7, 3.8));
	}
}
