package com.lewscanon.lessons.loggers.demo;

import com.lewscanon.lessons.loggers.LogSystem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogSystem.LOGSYSTEM.toString());
        logger.log(Level.WARNING, "Logging with logger(\"{0}\")", logger.getName());
    }
}
