package cloneable;

public class Person {
  public String name;
  public int age;
  public String gender;

  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  Person() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }

  public void introduce() {
    System.out.println(getIntroduce() + ".");
  }

  public String getIntroduce() {
    return "Hi, I'm " + name + ", a " + age + " year old " + gender;
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}

