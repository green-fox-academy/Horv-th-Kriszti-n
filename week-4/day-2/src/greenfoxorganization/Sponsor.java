package greenfoxorganization;

public class Sponsor extends Person {
  public String company;
  public int hiredStudents;

  Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  Sponsor() {
    super();
    company = "Google";
    hiredStudents = 0;
  }

  public void introduce() {      // <----The superclass will call in the getIntroduce from the Student class!
    System.out.println(super.getIntroduce() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void hire() {
    hiredStudents++;
  }

  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }
}
