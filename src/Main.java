public class Main {
    public static void main(String[] args) {
        MagicBox <Integer> box1 = new MagicBox <>(1);
        MagicBox <String> box2 = new MagicBox <>(2);
        box1.add(20);
        box1.add(10);
        box2.add("Настя");
        box2.add("Петя");
        box2.pick();
    }
}