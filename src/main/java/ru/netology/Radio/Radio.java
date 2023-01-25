package ru.netology.Radio;

public class Radio {
    public int currentNumber;
    public int currentSound;

    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentSound(int newCurrentSound) {
        if (newCurrentSound < 0) {
            return;
        }
        if (newCurrentSound > 10) {
            return;

        }
        currentSound = newCurrentSound;
    }

    public void increaseSound() {
        if (currentSound < 10) {
            currentSound = currentSound + 1;
        }
    }


    public void DownSound() {
        if (currentSound > 10) {
            currentSound = currentSound - 1;
        }
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < 0) {
            return;
        }
        if (newCurrentNumber > 9) {
            return;

        }
        currentNumber = newCurrentNumber;
    }

    public void increaseNumber() {
        if (currentNumber < 9) {
            currentSound = currentNumber + 1;
        }
    }

    public void DownNumber() {
        if (currentNumber > 9) {
            currentSound = currentNumber - 1;
        }
    }
}