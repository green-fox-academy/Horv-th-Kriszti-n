package piratesreloaded;

public class BattleApp {
  public static void main(String[] args) {
    Ship stardust = new Ship();
    Ship blackPearl = new Ship();
    stardust.fillShip();
    blackPearl.fillShip();

    stardust.statusOfShip();
    blackPearl.statusOfShip();

    System.out.println(stardust.battle(blackPearl));

    stardust.statusOfShip();
    blackPearl.statusOfShip();
  }
}
