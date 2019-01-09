
public class Five {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		C c = new C(a);
		B b = new B(c);
		A a = new A(b);
		
	}

}


class A {
	private B val;
	
	A (B b){
		val = b;
	}
	
}

class B{
	private C val;
	
	B (C c){
		val = c;
	}
	
}

class C{
	private A val;
	C (A a){
		val = a;
	}
	
}
