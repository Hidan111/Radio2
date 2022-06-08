package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        assertEquals(radio.getCurrentRadioStation(), radio.getCurrentRadioStation());
    }

    @Test
    public void test1() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);

        assertEquals(9, radio.getMaxRadioStation());
    }

    @Test
    public void test3() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);

        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void test2() {
        Radio radio = new Radio();
        radio.setMinRadioStation(0);

        assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void test4() {
        Radio radio = new Radio();
        radio.setMinVolume(0);

        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void findNext1() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(0);

        cond.nextRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findNext2() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(1);

        cond.nextRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void findNext3() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(2);

        cond.nextRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void findNext4() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(3);

        cond.nextRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void findNext5() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(4);

        cond.nextRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findNext6() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(5);

        cond.nextRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void findNext7() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(6);

        cond.nextRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void findNext8() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(7);

        cond.nextRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findNext9() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(8);

        cond.nextRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findNext11() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(9);

        cond.nextRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findNext13() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(0);

        cond.nextRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findNext14() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(-1);

        cond.nextRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findNext15() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(10);

        cond.nextRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findPrev10() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(0);

        cond.prevRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findPrev9() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(9);

        cond.prevRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findPrev8() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(8);

        cond.prevRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void findPrev7() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(7);

        cond.prevRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void findPrev6() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(6);

        cond.prevRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findPrev5() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(5);

        cond.prevRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void findPrev4() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(4);

        cond.prevRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void findPrev3() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(3);

        cond.prevRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void findPrev2() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(2);

        cond.prevRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findPrev1() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(1);

        cond.prevRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findPrev11() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(0);

        cond.prevRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findPrev12() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(9);

        cond.prevRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findPrev13() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(9);

        cond.prevRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findPrev14() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(-1);

        cond.prevRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findPrev15() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(10);

        cond.prevRadioStation();

        int actual = cond.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findIncrease1() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findIncrease2() {
        Radio cond = new Radio();

        cond.setCurrentVolume(1);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void findIncrease3() {
        Radio cond = new Radio();

        cond.setCurrentVolume(2);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void findIncrease4() {
        Radio cond = new Radio();

        cond.setCurrentVolume(3);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void findIncrease5() {
        Radio cond = new Radio();

        cond.setCurrentVolume(4);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findIncrease6() {
        Radio cond = new Radio();

        cond.setCurrentVolume(5);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void findIncrease7() {
        Radio cond = new Radio();

        cond.setCurrentVolume(6);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void findIncrease8() {
        Radio cond = new Radio();

        cond.setCurrentVolume(7);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findIncrease9() {
        Radio cond = new Radio();

        cond.setCurrentVolume(8);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findIncrease10() {
        Radio cond = new Radio();

        cond.setCurrentVolume(9);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void findIncrease11() {
        Radio cond = new Radio();

        cond.setCurrentVolume(10);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void findIncrease12() {
        Radio cond = new Radio();

        cond.setCurrentVolume(10);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void findIncrease14() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findIncrease15() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findIncrease16() {
        Radio cond = new Radio();

        cond.setCurrentVolume(11);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease11() {
        Radio cond = new Radio();

        cond.setCurrentVolume(10);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease10() {
        Radio cond = new Radio();

        cond.setCurrentVolume(9);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease9() {
        Radio cond = new Radio();

        cond.setCurrentVolume(8);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease8() {
        Radio cond = new Radio();

        cond.setCurrentVolume(7);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease7() {
        Radio cond = new Radio();

        cond.setCurrentVolume(6);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease6() {
        Radio cond = new Radio();

        cond.setCurrentVolume(5);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease5() {
        Radio cond = new Radio();

        cond.setCurrentVolume(4);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease4() {
        Radio cond = new Radio();

        cond.setCurrentVolume(3);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease3() {
        Radio cond = new Radio();

        cond.setCurrentVolume(2);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease2() {
        Radio cond = new Radio();

        cond.setCurrentVolume(1);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease1() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease12() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease13() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease14() {
        Radio cond = new Radio();

        cond.setCurrentVolume(10);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease15() {
        Radio cond = new Radio();

        cond.setCurrentVolume(10);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease16() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findDecrease17() {
        Radio cond = new Radio();

        cond.setCurrentVolume(11);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}