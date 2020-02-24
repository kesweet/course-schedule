package com.katherinesweet.courseschedule.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course extends AbstractEntity {

    private int enrollmentCapacity = 100;
    private int enrollmentActual = 0;

    @ManyToOne
    private Teacher teacher;

    @OneToMany
    private List<Teacher> teachingAssistant = new ArrayList<>();
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

    public Course(String name, Teacher teacher, String locationOnCampus, ArrayList<Day> daysInClass, int startTime, int endTime, int courseNumber, String courseDepartment) {
        super();
        this.setName(name);
        this.teacher = teacher;
        this.locationOnCampus = locationOnCampus;
        this.daysInClass = daysInClass;
        this.startTime = startTime;
        this.endTime = endTime;
        this.courseNumber = courseNumber;
        this.courseDepartment = courseDepartment;
        this.classTimeLength = startTime - endTime;
    }

    public Course(int enrollmentCapacity, int enrollmentActual, Teacher teacher, ArrayList<Teacher> teachingAssistant, String locationOnCampus, ArrayList<Day> daysInClass, int startTime, int endTime, int courseNumber, String courseDepartment, String prerequisites, int classTimeLength, Boolean isGraduateLevel) {
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

    public Teacher getInstructor() {
        return teacher;
    }

    public void setInstructor(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Teacher> getTeachingAssistant() {
        return teachingAssistant;
    }

    public void setTeachingAssistant(ArrayList<Teacher> teachingAssistant) {
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
