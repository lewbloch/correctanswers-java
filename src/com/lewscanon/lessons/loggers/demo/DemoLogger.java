package com.lewscanon.lessons.loggers.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.lewscanon.lessons.loggers.LogSystem.LOGSYSTEM;

public class DemoLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LOGSYSTEM.toString());
        logger.log(Level.WARNING, "Logging with logger(\"{0}\")", logger.getName());
    }
}
