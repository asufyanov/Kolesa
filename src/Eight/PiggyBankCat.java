package Eight;
/**
 * ���-�������.
 * ��� ��� ��� �������������� �������, �� ����� ������ ������������ (display).
 * ������������� ������ display - ����.
 */
public class PiggyBankCat extends Cat {
	
	public PiggyBankCat(){
		setJumpHeight(Cat.NO_JUMP);

	}

    @Override
    public void display() {
        //display implementation

        System.out.println("Piggy bank cat is displayed, it can keep money");
    }

    @Override
    public void purr() {
        //do nothing

        System.out.println("This cat does not purr!");
    }

    @Override
    public void meow() {
        //do nothing

        System.out.println("This cat does not mew!");
    }


}