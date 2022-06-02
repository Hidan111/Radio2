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
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void next1RadioStation() {
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        }
    }

    public void next2RadioStation() {
        if (currentRadioStation <= 9) {
            currentRadioStation = 0;
        }
    }

    public void next3RadioStation() {
        if (currentRadioStation >= 0) {
            currentRadioStation = 9;
        }
    }

    public void next4RadioStation() {
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
        }
    }

    public void next5RadioStation() {
        if (currentRadioStation <= -1) {
            currentRadioStation = 0;
        }
    }

    public void next6RadioStation() {
        if (currentRadioStation >= -1) {
            currentRadioStation = 0;
        }
    }

    public void next7RadioStation() {
        if (currentRadioStation <= 10) {
            currentRadioStation = 9;
        }
    }

    public void next8RadioStation() {
        if (currentRadioStation >= 10) {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void prev1RadioStation() {
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
        }
    }

    public void prev2RadioStation() {
        if (currentRadioStation >= 0) {
            currentRadioStation = 9;
        }
    }

    public void prev3RadioStation() {
        if (currentRadioStation <= 9) {
            currentRadioStation = 0;
        }
    }

    public void prev4RadioStation() {
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        }
    }

    public void prev5RadioStation() {
        if (currentRadioStation >= 10) {
            currentRadioStation = 0;
        }
    }

    public void prev6RadioStation() {
        if (currentRadioStation <= 10) {
            currentRadioStation = 9;
        }
    }

    public void prev7RadioStation() {
        if (currentRadioStation >= -1) {
            currentRadioStation = 0;
        }
    }

    public void prev8RadioStation() {
        if (currentRadioStation <= -1) {
            currentRadioStation = 0;
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
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void increase1Volume() {
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
    }

    public void increase2Volume() {
        if (currentVolume <= 10) {
            currentVolume = 10;
        }
    }

    public void increase3Volume() {
        if (currentVolume >= 0) {
            currentVolume = 1;
        }
    }

    public void increase4Volume() {
        if (currentVolume <= 0) {
            currentVolume = 1;
        }
    }

    public void increase5Volume() {
        if (currentVolume <= -1) {
            currentVolume = 0;
        }
    }

    public void increase6Volume() {
        if (currentVolume >= -1) {
            currentVolume = 0;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void decrease1Volume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
    }

    public void decrease2Volume() {
        if (currentVolume >= 0) {
            currentVolume = 0;
        }
    }

    public void decrease3Volume() {
        if (currentVolume <= 10) {
            currentVolume = 9;
        }
    }

    public void decrease4Volume() {
        if (currentVolume >= 10) {
            currentVolume = 9;
        }
    }

    public void decrease5Volume() {
        if (currentVolume <= 11) {
            currentVolume = 10;
        }
    }

    public void decrease6Volume() {
        if (currentVolume >= 11) {
            currentVolume = 0;
        }
    }
}
