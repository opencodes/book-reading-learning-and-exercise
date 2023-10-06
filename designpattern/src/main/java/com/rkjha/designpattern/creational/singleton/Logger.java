package com.rkjha.designpattern.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance = null;
    List<String> logs = new ArrayList<>();

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void debug(String message) {
        logs.add(message);
    }

    public List<String> getLogs() {
        return logs;
    }

}
