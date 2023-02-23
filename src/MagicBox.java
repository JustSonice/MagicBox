import java.util.Random;

public class MagicBox<T> {
    private int size;
    private T[] items;

    public MagicBox(int size) {
        this.size = size;
        this.items = (T[])new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length;) {
            if (items[i] == null || size > items.length) {
                items[i] = item;
                System.out.println("True значение" + item + "записано");
                return true;
            } else {
                System.out.println("False значение" + item + "значение не было записано");
                return false;
            }
        } return false;
    }

    public T pick() {
        try {
            for (int i = 0; 0 < items.length;)
                if (items[i] == null) {
            } else if (items[i] != null) {
                Random random = new Random();
                int randomInt = random.nextInt();
                return items[randomInt];
            }
        } catch (RuntimeException e) {
            int k = items.length - size;
            System.out.println("Ошибка, коробка не полна. Осталоcь заполнить:" + k);
        }
        return null;
    }
}
