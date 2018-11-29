package piratesreloaded;

public class Pirate extends People implements Fightable {

  int drinksHad;
  String pet = "";

  Pirate () {
    this.isAlive = true;
    this.isConscious = true;
    this.fightingPower = 3;
    this.drinksHad = 0;
    int petChance = 1 + (int) (Math.random() * 10);
    if (petChance > 8) {
      this.pet = "parrot";
    }
  }

  public void drinkSomeRum() {
    this.drinksHad++;
  }

  public void passedOut() {
    System.out.println("He's passed out!");
    this.isConscious = true;
  }
  public  boolean isCapable() {
    return  isAlive && isConscious;
  }

  public void howsItGoingMate() {
    if (!this.isAlive) {
      System.out.println("He's dead!");
    } else if (this.drinksHad < 5 && this.isConscious) {
      System.out.println("Pour me anudder!");
      drinkSomeRum();     //this.drinksHad++; <--- this would be the same!
    } else if (this.isConscious) {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      this.isConscious = false;
      this.drinksHad = 0;
    } else {        // <--- We declare with this that, the pirate is not conscious!
      passedOut();
    }
  }

  @Override
  public void brawl(People opponent) {

  }

  @Override
  public void die() {
    this.isAlive = false;
  }
}
