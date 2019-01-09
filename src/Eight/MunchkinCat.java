package Eight;


/**
 * Порода кошек, с короткими лапками.
 * Умеет: мурлыкать (purr), мяукать (meow), и прыгать Низко (jump, своя имплементация)
 * Имплементация метода display - своя.
 */
public class MunchkinCat extends Cat {
	
	public MunchkinCat (){
		setJumpHeight(Cat.LOW_JUMP);
	}

    @Override
    public void display() {
        //display implementation

        System.out.println("Munchkin cat is displayed, he has small paws");
    }


}