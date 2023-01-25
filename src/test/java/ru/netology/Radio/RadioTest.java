package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void ShouldIncreaseVolumeOne() {
        Radio radio = new Radio();
        radio.setCurrentSound(7);


        int expected = 7;
        int actual = radio.getCurrentSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldDownVolumeOne() {
        Radio radio = new Radio();
        radio.setCurrentSound(5);


        int expected = 5;
        int actual = radio.getCurrentSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldIncreaseNumberOne() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);


        int expected = 8;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldDownNumberOne() {
        Radio radio = new Radio();
        radio.setCurrentNumber(3);


        int expected = 3;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
}

