package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    // Тесты звука
    @Test
    public void shoudSetVolume() {

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToMaxVolume() {

        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.setToMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.setToMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {

        radio.setCurrentVolume(15);
        radio.increaseVolume();

        int expected = 16;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolume() {

        radio.setCurrentVolume(22);
        radio.volumeDown();

        int expected = 21;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {

        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeUnderMin() {

        radio.setCurrentVolume(-2);

        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Тесты радиостанции
    @Test
    public void ShouldSetStation() {

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToMaxStation() {

        radio.setToMaxStation();

        int expected = 9;
        int actual = radio.setToMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinStation() {

        radio.setToMinStation();

        int expected = 0;
        int actual = radio.setToMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {

        radio.setCurrentStation(15);
        radio.getMinStation();

        int expected = 0;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMin() {

        radio.setCurrentStation(-1);
        radio.getMaxStation();

        int expected = 9;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation() {
        radio.setCurrentStation(5);
        radio.pressNextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownStation() {
        radio.setCurrentStation(5);
        radio.pressPrevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
