package utils;

import java.util.Random;

public class Helpers {

    /**
     * Returns random int between min and max.
     * @param min - lower range
     * @param max - highest range
     * @return - random number between min and max
     */
    public static int generateRandomNumber(int min, int max) {
        int randomNr;
        Random random = new Random();
        randomNr = random.nextInt(max - min) + min;
        return randomNr;
    }
}