package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        int firstStation = 0;
        currentStation = currentStation + 1;
        {
            if (currentStation > 9) {
                currentStation = firstStation;
            }
        }
    }


    public void prevStation() {
        int lastStation = 9;
        currentStation = currentStation - 1;
        {
            if (currentStation < 0) {
                currentStation = lastStation;
            }
        }
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}



