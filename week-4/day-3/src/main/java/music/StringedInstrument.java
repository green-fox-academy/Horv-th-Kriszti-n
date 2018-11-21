package main.java.music;

abstract public class StringedInstrument extends Instrument {
  protected int numberOfStrings;
  protected String sound;

  public String sound(){
    return sound;
  }
}
