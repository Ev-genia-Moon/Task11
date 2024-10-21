import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation0() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation1() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation9() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation8() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationUnderMin() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationAboveMax() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(9);

        int expected = 0;
        int actual = radioStation.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation8() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(8);

        int expected = 9;
        int actual = radioStation.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation0() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(0);

        int expected = 1;
        int actual = radioStation.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationUnderMin() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(0);

        int expected = 9;
        int actual = radioStation.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation1() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(1);

        int expected = 0;
        int actual = radioStation.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation9() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(9);

        int expected = 8;
        int actual = radioStation.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(0);

        int expected = 0;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume1() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(1);

        int expected = 1;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume99() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(99);

        int expected = 99;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume100() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(100);

        int expected = 100;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(101);

        int expected = 0;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVoluneUnderMin() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(-1);

        int expected = 0;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumePlus1AboveMax() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(100);

        int expected = 100;
        int actual = radioStation.increaseVolumePlus1();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumePlus1() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(99);

        int expected = 100;
        int actual = radioStation.increaseVolumePlus1();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMinus1UnderMin() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(0);

        int expected = 0;
        int actual = radioStation.increaseVolumeMinus1();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMinus1() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(1);

        int expected = 0;
        int actual = radioStation.increaseVolumeMinus1();

        Assertions.assertEquals(expected, actual);
    }

}
