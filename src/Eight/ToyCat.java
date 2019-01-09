package Eight;

/**
 * ���������� �������� �����
 * �����: ������������ (display) � ������� (meow).
 * ������������� ������ display - ����.
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