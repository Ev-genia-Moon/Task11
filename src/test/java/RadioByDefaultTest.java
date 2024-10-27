import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioByDefaultTest {

    Radio radioStation = new Radio();

    @Test
    public void shouldSetRadioStationMinByDefault() {
        radioStation.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationMinPlus1ByDefault() {
        radioStation.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationMaxByDefault() {
        radioStation.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationMaxMinus1ByDefault() {
        radioStation.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMaxByDefault() {
        radioStation.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationUnderMinByDefault() {
        radioStation.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationAboveMaxByDefault() {
        radioStation.setCurrentRadioStation(9);

        int expected = 0;
        int actual = radioStation.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationMaxMinus1ByDefault() {
        radioStation.setCurrentRadioStation(8);

        int expected = 9;
        int actual = radioStation.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation0ByDefault() {
        radioStation.setCurrentRadioStation(0);

        int expected = 1;
        int actual = radioStation.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationUnderMinByDefault() {
        radioStation.setCurrentRadioStation(0);

        int expected = 9;
        int actual = radioStation.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation1ByDefault() {
        radioStation.setCurrentRadioStation(1);

        int expected = 0;
        int actual = radioStation.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationMaxByDefault() {
        radioStation.setCurrentRadioStation(9);

        int expected = 8;
        int actual = radioStation.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0ByDefault() {
        radioStation.setCurrentVolume(0);

        int expected = 0;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume1ByDefault() {
        radioStation.setCurrentVolume(1);

        int expected = 1;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume99ByDefault() {
        radioStation.setCurrentVolume(99);

        int expected = 99;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume100ByDefault() {
        radioStation.setCurrentVolume(100);

        int expected = 100;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMaxByDefault() {
        radioStation.setCurrentVolume(101);

        int expected = 0;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVoluneUnderMinByDefault() {
        radioStation.setCurrentVolume(-1);

        int expected = 0;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumePlus1AboveMaxByDefault() {
        radioStation.setCurrentVolume(100);

        int expected = 100;
        int actual = radioStation.increaseVolumePlus1();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumePlus1ByDefault() {
        radioStation.setCurrentVolume(99);

        int expected = 100;
        int actual = radioStation.increaseVolumePlus1();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMinus1UnderMinByDefault() {
        radioStation.setCurrentVolume(0);

        int expected = 0;
        int actual = radioStation.increaseVolumeMinus1();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMinus1ByDefault() {
        radioStation.setCurrentVolume(1);

        int expected = 0;
        int actual = radioStation.increaseVolumeMinus1();

        Assertions.assertEquals(expected, actual);
    }

}

