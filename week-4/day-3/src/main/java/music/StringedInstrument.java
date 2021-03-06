package main.java.music;

abstract public class StringedInstrument extends Instrument {
  protected int numberOfStrings;
  protected String sound;

  public String sound(){
    return sound;
  }

  @Override
  public void play() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
