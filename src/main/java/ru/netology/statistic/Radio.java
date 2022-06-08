package ru.netology.statistic;

public class Radio {

    public int currentRadioStation;

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation >= 9) {
            setCurrentRadioStation(0);

            if (currentRadioStation >= 0) {
                setCurrentRadioStation(9);
            }
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation <= 0) {
            setCurrentRadioStation(9);

            if (currentRadioStation <= 9) {
                setCurrentRadioStation(0);
            }
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public int currentVolume;

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= 10) {
            setCurrentVolume(0);

            if (currentVolume >= 0) {
                setCurrentVolume(10);
            }
        } else {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= 0) {
            setCurrentVolume(10);

            if (currentVolume <= 10) {
                setCurrentVolume(0);
            }
        } else {
            setCurrentVolume(currentVolume - 1);
        }
    }
}