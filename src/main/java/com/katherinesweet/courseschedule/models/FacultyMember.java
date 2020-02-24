package com.katherinesweet.courseschedule.models;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class FacultyMember extends Person {

    private Boolean canTeachGradLevel;
    private FacultyType facultyType;
    private DepartmentJob departmentJob;
    private ArrayList<GraduateStudent> teachingAssistants;
    private GraduateStudent researchAssistant = null;
    private int hierarchicalStatus;
    private ArrayList<Course> coursesTeaching;
    private Boolean isOnSabbatical = false;
    private Boolean isDepartmentChair = false;
    private String otherDepartmentRoles;

    public FacultyMember() {}


    public FacultyMember(Boolean canTeachGradLevel, FacultyType facultyType, DepartmentJob departmentJob, ArrayList<GraduateStudent> teachingAssistants, ArrayList<Course> coursesTeaching, int yearsInDepartment) {
        this.canTeachGradLevel = canTeachGradLevel;
        this.facultyType = facultyType;
        this.departmentJob = departmentJob;
        this.teachingAssistants = teachingAssistants;
        this.coursesTeaching = coursesTeaching;
        this.setYearsInDepartment(yearsInDepartment);
        this.hierarchicalStatus = 0;
        this.otherDepartmentRoles = "None";
    }

    public FacultyMember(Boolean canTeachGradLevel, FacultyType facultyType, DepartmentJob departmentJob, ArrayList<GraduateStudent> teachingAssistant, GraduateStudent researchAssistant, int hierarchicalStatus, ArrayList<Course> coursesTeaching, Boolean isOnSabbatical, Boolean isDepartmentChair, int yearsInDepartment, String otherDepartmentRoles) {
        this();
        this.researchAssistant = researchAssistant;
        this.hierarchicalStatus = hierarchicalStatus;
        this.isOnSabbatical = isOnSabbatical;
        this.isDepartmentChair = isDepartmentChair;
        this.otherDepartmentRoles = otherDepartmentRoles;
    }

    public Boolean getCanTeachGradLevel() {
        return canTeachGradLevel;
    }

    public void setCanTeachGradLevel(Boolean canTeachGradLevel) {
        this.canTeachGradLevel = canTeachGradLevel;
    }

    public FacultyType getFacultyType() {
        return facultyType;
    }

    public void setFacultyType(FacultyType facultyType) {
        this.facultyType = facultyType;
    }

    public DepartmentJob getDepartmentJob() {
        return departmentJob;
    }

    public void setDepartmentJob(DepartmentJob departmentJob) {
        this.departmentJob = departmentJob;
    }

    public ArrayList<GraduateStudent> getTeachingAssistants() {
        return teachingAssistants;
    }

    public void setTeachingAssistants(ArrayList<GraduateStudent> teachingAssistants) {
        this.teachingAssistants = teachingAssistants;
    }

    public GraduateStudent getResearchAssistant() {
        return researchAssistant;
    }

    public void setResearchAssistant(GraduateStudent researchAssistant) {
        this.researchAssistant = researchAssistant;
    }

    public int getHierarchicalStatus() {
        return hierarchicalStatus;
    }

    public void setHierarchicalStatus(int hierarchicalStatus) {
        this.hierarchicalStatus = hierarchicalStatus;
    }

    public ArrayList<Course> getCoursesTeaching() {
        return coursesTeaching;
    }

    public void setCoursesTeaching(ArrayList<Course> coursesTeaching) {
        this.coursesTeaching = coursesTeaching;
    }

    public Boolean getOnSabbatical() {
        return isOnSabbatical;
    }

    public void setOnSabbatical(Boolean onSabbatical) {
        isOnSabbatical = onSabbatical;
    }

    public Boolean getDepartmentChair() {
        return isDepartmentChair;
    }

    public void setDepartmentChair(Boolean departmentChair) {
        isDepartmentChair = departmentChair;
    }


    public String getOtherDepartmentRoles() {
        return otherDepartmentRoles;
    }

    public void setOtherDepartmentRoles(String otherDepartmentRoles) {
        this.otherDepartmentRoles = otherDepartmentRoles;
    }
}
