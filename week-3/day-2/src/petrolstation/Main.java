package petrolstation;

public class Main {
  public static void main(String[] args) {
    Car bmw = new Car();
    bmw.capacity = 60;
    bmw.gasAmount = 5;

    Station shell = new Station();

    shell.refill(bmw);

    System.out.println(bmw.gasAmount);
  }
}
