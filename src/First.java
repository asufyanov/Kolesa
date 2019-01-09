
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = a;
		calculate(b);
		
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	private static void calculate (int b){
		b = b + 10;
	}

}
