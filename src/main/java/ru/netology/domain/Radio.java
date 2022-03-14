package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberOfStations = 9;
    private int firstStation = 0;

    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations - 1;
    }

    public int getCurrentStation() {
        return currentStation + 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation - 1 > numberOfStations) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        this.currentStation = newCurrentStation - 1;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        currentStation = currentStation + 1;
        if (currentStation > numberOfStations) {
            currentStation = firstStation;
        }
    }

    public void prevStation() {
        currentStation = currentStation - 1;
        if (currentStation < firstStation) {
            currentStation = numberOfStations;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}



