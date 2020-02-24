package com.katherinesweet.courseschedule.models;

import javax.persistence.Entity;

import java.util.ArrayList;

@Entity
public class Course extends AbstractEntity {

    private int enrollmentCapacity = 100;
    private int enrollmentActual = 0;
    private Person instructor;
    private Person teachingAssistant = null;
    private String locationOnCampus;
    private ArrayList<Day> daysInClass;
    private int startTime;
    private int endTime;
    private int courseNumber;
    private String courseDepartment;
    private String prerequisites = null;
    private int classTimeLength;
    private Boolean isGraduateLevel = false;


    public Course() {}

    public Course(String name, Person instructor, String locationOnCampus, ArrayList<Day> daysInClass, int startTime, int endTime, int courseNumber, String courseDepartment) {
        this.setName(name);
        this.instructor = instructor;
        this.locationOnCampus = locationOnCampus;
        this.daysInClass = daysInClass;
        this.startTime = startTime;
        this.endTime = endTime;
        this.courseNumber = courseNumber;
        this.courseDepartment = courseDepartment;
        this.classTimeLength = startTime - endTime;
    }

    public Course(int enrollmentCapacity, int enrollmentActual, Person instructor, Person teachingAssistant, String locationOnCampus, ArrayList<Day> daysInClass, int startTime, int endTime, int courseNumber, String courseDepartment, String prerequisites, int classTimeLength, Boolean isGraduateLevel) {
        this();
        this.enrollmentCapacity = enrollmentCapacity;
        this.enrollmentActual = enrollmentActual;
        this.teachingAssistant = teachingAssistant;
        this.isGraduateLevel = isGraduateLevel;
        this.prerequisites = prerequisites;
    }


    public int getEnrollmentCapacity() {
        return enrollmentCapacity;
    }

    public void setEnrollmentCapacity(int enrollmentCapacity) {
        this.enrollmentCapacity = enrollmentCapacity;
    }

    public int getEnrollmentActual() {
        return enrollmentActual;
    }

    public void setEnrollmentActual(int enrollmentActual) {
        this.enrollmentActual = enrollmentActual;
    }

    public Person getInstructor() {
        return instructor;
    }

    public void setInstructor(Person instructor) {
        this.instructor = instructor;
    }

    public Person getTeachingAssistant() {
        return teachingAssistant;
    }

    public void setTeachingAssistant(Person teachingAssistant) {
        this.teachingAssistant = teachingAssistant;
    }

    public String getLocationOnCampus() {
        return locationOnCampus;
    }

    public void setLocationOnCampus(String locationOnCampus) {
        this.locationOnCampus = locationOnCampus;
    }

    public ArrayList<Day> getDaysInClass() {
        return daysInClass;
    }

    public void setDaysInClass(ArrayList<Day> daysInClass) {
        this.daysInClass = daysInClass;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(String courseDepartment) {
        this.courseDepartment = courseDepartment;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public int getClassTimeLength() {
        return classTimeLength;
    }

    public void setClassTimeLength(int classTimeLength) {
        this.classTimeLength = classTimeLength;
    }

    public Boolean getIsGraduateLevel() {
        return isGraduateLevel;
    }

    public void setIsGraduateLevel(Boolean graduateCourse) {
        this.isGraduateLevel = graduateCourse;
    }
}
