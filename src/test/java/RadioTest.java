import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radioStation = new Radio(20);

    @Test
    public void shouldSetRadioStationMin() {
        radioStation.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationMinPlus1() {
        radioStation.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationMax() {
        radioStation.setCurrentRadioStation(19);

        int expected = 19;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationMaxMinus1() {
        radioStation.setCurrentRadioStation(18);

        int expected = 18;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        radioStation.setCurrentRadioStation(20);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationUnderMin() {
        radioStation.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationAboveMax() {
        radioStation.setCurrentRadioStation(19);

        int expected = 0;
        int actual = radioStation.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationMaxMinus1() {
        radioStation.setCurrentRadioStation(18);

        int expected = 19;
        int actual = radioStation.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation0() {
        radioStation.setCurrentRadioStation(0);

        int expected = 1;
        int actual = radioStation.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationUnderMin() {
        radioStation.setCurrentRadioStation(0);

        int expected = 19;
        int actual = radioStation.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation1() {
        radioStation.setCurrentRadioStation(1);

        int expected = 0;
        int actual = radioStation.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationMax() {
        radioStation.setCurrentRadioStation(19);

        int expected = 18;
        int actual = radioStation.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0() {
        radioStation.setCurrentVolume(0);

        int expected = 0;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume1() {
        radioStation.setCurrentVolume(1);

        int expected = 1;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume99() {
        radioStation.setCurrentVolume(99);

        int expected = 99;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume100() {
        radioStation.setCurrentVolume(100);

        int expected = 100;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        radioStation.setCurrentVolume(101);

        int expected = 0;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVoluneUnderMin() {
        radioStation.setCurrentVolume(-1);

        int expected = 0;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumePlus1AboveMax() {
        radioStation.setCurrentVolume(100);

        int expected = 100;
        int actual = radioStation.increaseVolumePlus1();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumePlus1() {
        radioStation.setCurrentVolume(99);

        int expected = 100;
        int actual = radioStation.increaseVolumePlus1();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMinus1UnderMin() {
        radioStation.setCurrentVolume(0);

        int expected = 0;
        int actual = radioStation.increaseVolumeMinus1();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMinus1() {
        radioStation.setCurrentVolume(1);

        int expected = 0;
        int actual = radioStation.increaseVolumeMinus1();

        Assertions.assertEquals(expected, actual);
    }

}

