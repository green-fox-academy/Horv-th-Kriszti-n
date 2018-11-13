package sharpie;

public class Main {
    public static void main(String[] args) {
    Sharpie stabilo = new Sharpie("green", 2);

    stabilo.use();
        System.out.println(stabilo.inkAmount);
    }
}
