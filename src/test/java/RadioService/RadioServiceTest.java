package RadioService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {
  RadioService radio = new RadioService();


  @Test
  public void shouldStartStation() {

    radio.setCurrentStation(0);

    radio.getStartStation();

    int expected = 0;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldFinalStation() {

    radio.setCurrentStation(9);

    radio.getFinalStation();

    int expected = 9;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldNextStationMax() {
    radio.setCurrentStation(9);

    radio.nextStation();

    int expected = 0;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldNextStationMin() {
    radio.setCurrentStation(0);

    radio.nextStation();

    int expected = 1;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldNextStation() {
    radio.setCurrentStation(5);

    radio.nextStation();

    int expected = 6;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldNextStationTabooMax() {
    radio.setCurrentStation(10);

    radio.getCurrentStation();

    int expected = 0;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldNextStationTabooMin() {
    radio.setCurrentStation(-1);

    radio.getCurrentStation();

    int expected = 0;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldPreviousStationMin() {
    radio.setCurrentStation(0);

    radio.previousStation();

    int expected = 9;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldPreviousStationMax() {
    radio.setCurrentStation(10);

    radio.previousStation();

    int expected = 9;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldPreviousStation() {
    radio.setCurrentStation(6);

    radio.previousStation();

    int expected = 5;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldMaxVolume() {
    radio.setCurrentVolume(10);

    radio.getMaxVolume();

    int expected = 10;
    int actual = radio.getCurrentVolume();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldMinVolume() {
    radio.setCurrentVolume(0);

    radio.getMinVolume();

    int expected = 0;
    int actual = radio.getCurrentVolume();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldMinVolumeMinus() {
    radio.setCurrentVolume(-1);

    radio.getMinVolume();

    int expected = 0;
    int actual = radio.getCurrentVolume();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldMinVolumeTaboo() {
    radio.setCurrentVolume(11);

    radio.getMinVolume();

    int expected = 0;
    int actual = radio.getCurrentVolume();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldIncreaseVolumeMax() {
    radio.setCurrentVolume(10);

    radio.increaseVolume();

    int expected = 10;
    int actual = radio.getCurrentVolume();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldIncreaseVolumeMin() {
    radio.setCurrentVolume(0);

    radio.increaseVolume();

    int expected = 1;
    int actual = radio.getCurrentVolume();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldIncreaseVolume() {
    radio.setCurrentVolume(8);

    radio.increaseVolume();

    int expected = 9;
    int actual = radio.getCurrentVolume();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldDecreaseVolumeMax() {
    radio.setCurrentVolume(10);

    radio.decreaseVolume();

    int expected = 9;
    int actual = radio.getCurrentVolume();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldDecreaseVolumeMin() {
    radio.setCurrentVolume(0);

    radio.decreaseVolume();

    int expected = 0;
    int actual = radio.getCurrentVolume();

    assertEquals(expected, actual);

  }

  @Test
  public void shouldDecreaseVolume() {
    radio.setCurrentVolume(4);

    radio.decreaseVolume();

    int expected = 3;
    int actual = radio.getCurrentVolume();

    assertEquals(expected, actual);

  }

}