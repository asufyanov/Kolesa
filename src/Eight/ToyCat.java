package Eight;

/**
 * »грушечный пушистый котик
 * ”меет: отображатьс€ (display) и м€укать (meow).
 * »мплементаци€ метода display - сво€.
 */
public class ToyCat extends Cat {
	public ToyCat(){
		setJumpHeight(Cat.NO_JUMP);

	}
	
    public void display() {
        //display implementation

        System.out.println("Toy cat is displayed, it is soft");
    }

    @Override
    public void purr() {
        //do nothing

        System.out.println("This cat does not purr!");
    }


}