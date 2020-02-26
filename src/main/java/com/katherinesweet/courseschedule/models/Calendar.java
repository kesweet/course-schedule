package com.katherinesweet.courseschedule.models;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Calendar extends AbstractEntity {

    private static List<Day> daysOfTheCalendarWeek;

    private static List<Integer> timesOfTheDay;



//    public Calendar () {
//        this.daysOfTheCalendarWeek = this.createFullWeek();
//        this.timesOfTheDay = this.buildTimeSlots(7, 9, 10);
//    }
//
//
//    public Calendar(List<Day> daysOfTheCalendarWeek, List<Integer> timesOfTheDay) {
//        this.daysOfTheCalendarWeek = daysOfTheCalendarWeek;
//        this.timesOfTheDay = timesOfTheDay;
//    }



    public static final List<Integer> buildTimeSlots(int startTime, int endTime, int increment) {

        for (int i = startTime; i <= endTime; i+=increment) {
            timesOfTheDay = new ArrayList<>();
            timesOfTheDay.add(startTime);
        }
        return timesOfTheDay;
    }


    public static final List<Day> createFullWeek() {
        daysOfTheCalendarWeek = new ArrayList<>();
        daysOfTheCalendarWeek.add(Day.MONDAY);
        daysOfTheCalendarWeek.add(Day.TUESDAY);
        daysOfTheCalendarWeek.add(Day.WEDNESDAY);
        daysOfTheCalendarWeek.add(Day.THURSDAY);
        daysOfTheCalendarWeek.add(Day.FRIDAY);
        daysOfTheCalendarWeek.add(Day.SATURDAY);
        daysOfTheCalendarWeek.add(Day.SUNDAY);
        return daysOfTheCalendarWeek;
    }



    public static final List<Day> createCustomWeek(Day[] days) {
        for (int i = 0; i < days.length; i++) {
            daysOfTheCalendarWeek = new ArrayList<>();
            daysOfTheCalendarWeek.add(days[i]);
        }
        return daysOfTheCalendarWeek;
    }


}
