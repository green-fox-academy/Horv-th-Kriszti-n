package cloneable;

public class Main {
  public static void main(String[] args) {
    Student johnny = new Student("John", 20, "male", "BME");
    johnny.introduce();
    Student johnTheClone = johnny.clone();   // <--- you have to connect the clone with the concrete object you would like to clone!
    johnTheClone.introduce();
  }
}
