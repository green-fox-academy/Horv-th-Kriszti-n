package greenfoxorganization;

public class Student extends Person {
  public String previousOrganization;
  public int skippedDays;

  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  Student() {
    super();
    previousOrganization = "The School of Life!";
    skippedDays = 0;

  }

  public void introduce() {           // <----The superclass will call in the getIntroduce from the Student class!
    super.introduce();
  }

  public void getGoal() {
    System.out.println("Be a software developer.");
  }

  public String getIntroduce() {
    return super.getIntroduce() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the cource already.";
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }
}
