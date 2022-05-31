package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void findMax() {
        Radio cond = new Radio();

        cond.currentRadioStation = 9;

        int actual = cond.currentRadioStation;
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        Radio cond = new Radio();

        //cond.currentRadioStation = 10;
        cond.setCurrentRadioStation(10);

        int actual = cond.getCurrentRadioStation();//cond.currentRadioStation;
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        Radio cond = new Radio();

        cond.currentRadioStation = 4;

        int actual = cond.currentRadioStation;
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        Radio cond = new Radio();

        //cond.currentRadioStation = 10;
        cond.setCurrentRadioStation(7);

        cond.increaseRadioStation();

        int actual = cond.getCurrentRadioStation();//cond.currentRadioStation;
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        Radio cond = new Radio();

        cond.currentVolume = 10;

        int actual = cond.currentVolume;
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        Radio cond = new Radio();

        //cond.currentVolume = 11;
        cond.setCurrentVolume(11);

        int actual = cond.getCurrentVolume();//cond.currentVolume;
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        Radio cond = new Radio();

        cond.currentVolume = 5;

        int actual = cond.currentVolume;
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        Radio cond = new Radio();

        //cond.currentRadioStation = 10;
        cond.setCurrentVolume(7);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();//cond.currentRadioStation;
        int expected = 8;

        assertEquals(expected, actual);
    }
}
