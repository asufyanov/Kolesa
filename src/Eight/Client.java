package Eight;
import java.util.LinkedList;
import java.util.List;

/**
 * ������������� ��� ���, ����� ����� ����:
 * - ������������� ��������� ����� ���������� �������;
 * - ����������� ��������� ��������� � �������. (������: ����� MaineCoonCat ��� ������� �����)
 */

/**
*	���� � ������� ������� jump() ������ � ������ Cat
*	� ����� ������� � ������������ ����� �������� jumpHeight � get/set
*	�������� ������ ���������� ������ � ���������� � �����������
*	� �� ��������� Cat ����� ������� ������
*	� main() �������� ������, ��� ����� ������ ���� �� ������� �������
*	� ��� �������� �� ��������� ������ �������
*
*/
public class Client {

    public static void main(String[] args) {
        List<Cat> cats = new LinkedList<>();
        cats.add(new MaineCoonCat());
        cats.add(new MunchkinCat());
        
        MunchkinCat newCat = new MunchkinCat();
        newCat.setJumpHeight(Cat.MEDIUM_JUMP);
        cats.add(newCat);
        
        cats.add(new PiggyBankCat());
        cats.get(3).setJumpHeight(Cat.HIGH_JUMP);
        
        cats.add(new ToyCat());
        
        cats.add(new PiggyBankCat());

        for (Cat cat : cats) {
            cat.display();
            cat.purr();
            cat.meow();
            cat.jump();
            System.out.println();
        }
    }
}