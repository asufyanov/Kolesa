package Eight;


/**
 * ������ �����, � ��������� �������.
 * �����: ��������� (purr), ������� (meow), � ������� ����� (jump, ���� �������������)
 * ������������� ������ display - ����.
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