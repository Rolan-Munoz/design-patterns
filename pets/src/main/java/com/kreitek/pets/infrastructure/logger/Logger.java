package com.kreitek.pets.infrastructure.logger;

public class Logger {
    private static Logger instance;
    private static int counter = 1;

    private Logger() {}

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void debug(String message) {
        System.out.println("[debug][" + counter++ + "] - " + message);
    }
}
