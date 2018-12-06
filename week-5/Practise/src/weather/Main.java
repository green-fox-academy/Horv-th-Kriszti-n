package weather;

import java.util.List;

import static weather.Weather.getRainyCity;
import static weather.Weather.readFile;

public class Main {
  public static void main(String[] args) {

    List<String> weatherList = readFile();
    getRainyCity(weatherList);
  }
}
