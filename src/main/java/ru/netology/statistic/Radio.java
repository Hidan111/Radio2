package ru.netology.statistic;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        } else if (currentRadioStation > maxRadioStation) {
            return;
        }

        this.currentRadioStation = currentRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        } else if (currentVolume > maxVolume) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
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