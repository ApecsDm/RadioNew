package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void SetNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(4);

        rad.nextStation();

        int expected = 5;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    public void SetNextStationIfLastStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void SetNextStationBeforeBorder() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.nextStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void SetNextStationBeyondBorder() {
        Radio rad = new Radio();
        rad.setCurrentStation(11);

        rad.nextStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void SetNextStationBeyondBorderNegative() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        rad.nextStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void SetNextStationIfFirstStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.nextStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void SetPrevStationIfFirstStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void SetPrevStationIfBeforeBorder() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);

        rad.prevStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void SetPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(6);

        rad.prevStation();

        int expected = 5;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(6);

        rad.increaseVolume();

        int expected = 7;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);

        rad.decreaseVolume();

        int expected = 2;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeUnderMinValue() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeAboveMaxValue() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);

        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeAboveMaxValue() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeUnderMinValue() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeOnMinValue() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeBeforeMinValue() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeBeforeMaxValue() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);

        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeOnMaxValue() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

}