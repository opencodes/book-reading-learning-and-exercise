package com.rkjha.designpattern.creational.singleton;

public class RunCode {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.debug("Error on line 10");
        logger = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger.debug("Error on line 11");
        System.out.println(logger == logger2);

        logger.getLogs().forEach(log -> System.out.printf("LOG: %s \n", log));

    }
}
