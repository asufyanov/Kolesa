
public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number a = new Number(5);
		Number b = calculate (a);
		
		System.out.println("a = " + a.val);
		System.out.println("b = " + b.val);

	}
	
	private static Number calculate (Number a){
		a.val = 10;
		return a;
		
	}

}

class Number {
	
	int val;
	
	Number (int val){
		this.val = val;
	}
}
