package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    this.name = "Electric Guitar";
    this.numberOfStrings = 6;
  }

  @Override
  public String sound() {
    return "Twang";
  }
}
