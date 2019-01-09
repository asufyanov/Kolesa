package Eight;

public class Cat {

    /**
     * Данный метод, для каждого конкретного котика, должен быть свой.
     */
	
	public final static String NO_JUMP = "This cat does not jump";
	public final static String LOW_JUMP = "LOW";
	public final static String MEDIUM_JUMP= "MEDIUM";
	public final static String HIGH_JUMP = "HIGH";

	private String jumpHeight = Cat.HIGH_JUMP;
	
    public void display() {
        throw new UnsupportedOperationException();
    }

    public void purr() {
        System.out.println("This cat can purr, mrrrrr...");
    }

    public void meow() {
        System.out.println("Does this cat meow? - Meow!");
    }

    public void jump() {
    	if  (jumpHeight!=Cat.NO_JUMP)System.out.println("How does this cat jump? - Jumps " + jumpHeight);
    	else System.out.println(Cat.NO_JUMP);
    }
    
    public String getJumpHeight(){
    	
    	return jumpHeight;
    }
    
    public void setJumpHeight(String s){
    	jumpHeight = s;
    }
} 