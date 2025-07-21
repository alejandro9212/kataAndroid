package co.com.kata.mobil.utils;

public class Time {
    public Time () {
    }

    public static void waiting (int waiting) {
        try {
            Thread.sleep(waiting * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
