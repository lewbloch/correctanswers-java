/** Copyright 2025, Lewis S. Bloch. */
package com.lewscanon.lessons.loggers;

/** Logger system name. */
public enum LogSystem {
    LOGSYSTEM(LogSystem.class.getPackageName());

    private final String name;

    LogSystem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
