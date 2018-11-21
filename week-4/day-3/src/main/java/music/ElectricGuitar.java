package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    this.name = "Electric Guitar";
    this.numberOfStrings = 6;
  }

  public ElectricGuitar(int newNumberOfStrings) {
    this.name = "Electric Guitar";
    this.numberOfStrings = newNumberOfStrings;
  }

  @Override
  public String sound() {
    return "Twang";
  }
}

