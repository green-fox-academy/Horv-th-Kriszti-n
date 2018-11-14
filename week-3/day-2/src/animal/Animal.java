package animal;

public class Animal {
    int hunger;
    int thirst;

    Animal(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public void eat() {
        System.out.println("Hunger: " + (hunger - 1));
    }

    public void drink() {
        System.out.println("Thirst: " + (thirst -1));
    }

    public void play() {
        System.out.print("Hunger: " + (hunger + 1));
        System.out.print(" Thirst: " + (thirst + 1));
    }
}
