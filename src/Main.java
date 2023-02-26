public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> box1 = new MagicBox<>(2);
        MagicBox<String> box2 = new MagicBox<>(2);
        box1.add(2);
        box1.add(1);
        box1.add(5);
        box2.add("Настя");
        box2.pick();
    }
}