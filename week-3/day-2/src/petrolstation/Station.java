package petrolstation;

public class Station {

  static int gasAmount;

  public static void refill(Car car) {
    gasAmount -= Car.capacity - gasAmount;
    Car.capacity = Car.gasAmount + Car.capacity;
  }
}
