package Eight;
import java.util.LinkedList;
import java.util.List;

/**
 * Оптимизируйте код так, чтобы можно было:
 * - безболезненно добавлять новые реализации котиков;
 * - динамически подменять поведения у котиков. (Пример: чтобы MaineCoonCat мог прыгать Низко)
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