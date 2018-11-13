package counter;

public class Main {
    public static void main(String[] args) {
    Counter counter = new Counter();

    counter.add(10);
    counter.add();
    counter.add();

        System.out.println(counter.get());
    counter.reset();
    }
}
