import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio(9, 0, 0, 100, 0, 0);

    @Test
    public void shouldInitFields() {
        Radio radio = new Radio();

        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    // Тесты звука
    @Test
    public void shoudSetVolume() {

        radio.setCurrentVolume(10);

        int expected = 10;
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

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolume() {

        radio.setCurrentVolume(20);
        radio.volumeDown();

        int expected = 19;
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

    @Test
    public void testOverLastVolume() {
        radio.setCurrentVolume(120);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnderInitialVolume() {
        radio.setCurrentVolume(-1);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }


    // Тесты радиостанции

    @Test
    public void testParametersStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

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
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinStation() {

        radio.setToMinStation();

        int expected = 0;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {

        radio.setCurrentStation(15);

        int expected = 0;
        int actual = radio.pressNextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMin() {

        radio.setCurrentStation(-1);

        int expected = 9;
        int actual = radio.pressPrevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation() {
        radio.setCurrentStation(9);
        radio.pressNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownStation() {
        radio.setCurrentStation(2);
        radio.pressPrevStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOverLastStation() {
        radio.setCurrentStation(11);
        radio.pressNextStation();

        int expected = 0;
        int actual = radio.pressNextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnderInitialStation() {
        radio.setCurrentStation(-1);
        radio.pressPrevStation();

        int expected = 9;
        int actual = radio.pressPrevStation();

        Assertions.assertEquals(expected, actual);
    }


}

