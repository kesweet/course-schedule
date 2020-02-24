package com.katherinesweet.courseschedule.models;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class Calendar extends AbstractEntity {

    private ArrayList<Day> daysOfTheWeek;

    private ArrayList<Integer> timesOfTheDay;

    public ArrayList<Integer> buildTimeSlots(int startTime, int endTime) {

        for (int i = startTime; i <= endTime; i+=5) {
            timesOfTheDay.add(startTime);
        }
        return timesOfTheDay;
    }

    public ArrayList<Day> createFullWeek() {
        daysOfTheWeek.add(Day.MONDAY);
        daysOfTheWeek.add(Day.TUESDAY);
        daysOfTheWeek.add(Day.WEDNESDAY);
        daysOfTheWeek.add(Day.THURSDAY);
        daysOfTheWeek.add(Day.FRIDAY);
        daysOfTheWeek.add(Day.SATURDAY);
        daysOfTheWeek.add(Day.SUNDAY);
        return daysOfTheWeek;
    }

    public ArrayList<Day> createCustomWeek(Day[] days) {
        for (int i = 0; i < days.length; i++) {
            daysOfTheWeek.add(days[i]);
        }
        return daysOfTheWeek;
    }


}
