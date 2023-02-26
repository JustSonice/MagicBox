import java.util.Random;

public class MagicBox<T> {
    private int size;
    private T[] items;

    public MagicBox(int size) {
        this.size = size;
        this.items = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("True значение " + item + " записано");
                return true;
            }
        }
        System.out.println("False значение " + item + " значение не было записано");
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                Random random = new Random();
                int randomInt = random.nextInt(size);
                return (items[randomInt]);
            }
        }
        int k = size;
        throw new RuntimeException("Ошибка, коробка не полна. Осталоcь заполнить:" + k);
    }
}
