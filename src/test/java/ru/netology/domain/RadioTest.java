package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio rad = new Radio();

    @Test
    public void shouldSetNumberOfStations() {
        Radio rad = new Radio(5);
    }

    @Test
    public void SetNextStation() {
        Radio rad = new Radio(7);

        rad.setCurrentStation(4);
        rad.nextStation();

        int expected = 5;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    public void SetNextStationIfLastStation() {
        Radio rad = new Radio(17);

        rad.setCurrentStation(17);
        rad.nextStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void SetNextStationBeforeBorder() {
        Radio rad = new Radio(20);

        rad.setCurrentStation(19);
        rad.nextStation();

        int expected = 20;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void SetNextStationBeyondBorder() {
        Radio rad = new Radio(10);

        rad.setCurrentStation(11);
        rad.nextStation();

        int expected = 2;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void SetNextStationBeyondBorderNegative() {
        Radio rad = new Radio(10);

        rad.setCurrentStation(-1);
        rad.nextStation();

        int expected = 2;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void SetNextStationIfFirstStation() {
        Radio rad = new Radio(10);

        rad.setCurrentStation(1);
        rad.nextStation();

        int expected = 2;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void SetPrevStationIfFirstStation() {
        Radio rad = new Radio(10);

        rad.setCurrentStation(1);
        rad.prevStation();

        int expected = 10;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void SetPrevStationIfBeforeBorder() {
        Radio rad = new Radio(10);

        rad.setCurrentStation(2);
        rad.prevStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void SetPrevStation() {
        Radio rad = new Radio(10);

        rad.setCurrentStation(6);
        rad.prevStation();

        int expected = 5;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolume() {

        rad.setCurrentVolume(6);
        rad.increaseVolume();

        int expected = 7;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolume() {

        rad.setCurrentVolume(3);
        rad.decreaseVolume();

        int expected = 2;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeUnderMinValue() {

        rad.setCurrentVolume(-1);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeAboveMaxValue() {

        rad.setCurrentVolume(101);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeAboveMaxValue() {

        rad.setCurrentVolume(101);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeUnderMinValue() {

        rad.setCurrentVolume(-1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeOnMinValue() {

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeBeforeMinValue() {

        rad.setCurrentVolume(1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeBeforeMaxValue() {

        rad.setCurrentVolume(9);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeOnMaxValue() {

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

}