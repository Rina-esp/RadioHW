package RadioService;

public class RadioService {
  //радиостанции
  public int currentStation;
  private int startStation = 0;
  private int finalStation = 9;

  //громкость
  private int currentVolume;
  private int maxVolume = 10;
  private int minVolume = 0;

  public int getCurrentStation() {
    return currentStation;
  }

  public void setCurrentStation(int currentStation) {
    if (currentStation < startStation) {
      return;
    }
    if (currentStation > finalStation) {
      return;
    }
    this.currentStation = currentStation;
  }

  public int getStartStation() {
    return startStation;
  }

  public int getFinalStation() {
    return finalStation;
  }

  public void nextStation() {
    if (currentStation < finalStation) {
      currentStation = currentStation + 1;
    }
    else {
      currentStation = startStation;
    }
  }

  public void previousStation() {
    if (currentStation > startStation) {
      currentStation = currentStation - 1;
    }
    else {
      currentStation = finalStation;
    }
  }

  public int getCurrentVolume() {
    return currentVolume;
  }

  public void setCurrentVolume(int currentVolume) {
    if (currentVolume < minVolume) {
      return;
    }
    if (currentVolume > maxVolume) {
      return;
    }
    this.currentVolume = currentVolume;
  }

  public int getMaxVolume() {
    return maxVolume;
  }

  public int getMinVolume() {
    return minVolume;
  }

  public void increaseVolume() {
    if (currentVolume < maxVolume) {
      currentVolume = currentVolume + 1;
    }
  }

  public void decreaseVolume() {
    if (currentVolume > minVolume) {
      currentVolume = currentVolume - 1;
    }
  }

}