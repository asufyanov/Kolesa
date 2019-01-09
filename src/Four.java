
public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Numberr a = new Numberr();
		Numberr b = a;
		
		a.val  = 5;
		
		calculate(b);
		
		System.out.println("a = " + a.val);
		System.out.println("b = " + b.val);

	}
	
	private static void calculate (Numberr b){
		b.val = b.val + 10;
		
	}
}

class Numberr {
	
	int val;

}
