package com.katherinesweet.courseschedule.models;

import javax.persistence.Entity;

public enum Day {

    SUNDAY("Sunday", false),
    MONDAY("Monday", true),
    TUESDAY("Tuesday", true),
    WEDNESDAY("Wednesday", true),
    THURSDAY("Thursday", true),
    FRIDAY("Friday", true),
    SATURDAY("Saturday", false);

    private final String displayName;
    private final boolean weekday;

    public Day(String displayName, boolean weekday) {
        this.displayName = displayName;
        this.weekday = weekday;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public boolean isWeekday() {
        return this.weekday;
    }

}
