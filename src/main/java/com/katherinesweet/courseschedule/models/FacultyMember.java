package com.katherinesweet.courseschedule.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;


public class FacultyMember extends Teacher {

    private Boolean canTeachGradLevel;
    private FacultyType facultyType;

    @OneToMany
    @JoinColumn
    private List<GraduateStudent> teachingAssistants = new ArrayList<>();

    @OneToOne
    private GraduateStudent researchAssistant = null;
    private int hierarchicalStatus;
    private Boolean isOnSabbatical = false;
    private Boolean isDepartmentChair = false;


    public FacultyMember() {}


    public FacultyMember(String name, Boolean canTeachGradLevel, FacultyType facultyType, DepartmentJob departmentJob, ArrayList<GraduateStudent> teachingAssistants, ArrayList<Course> coursesTeaching, int yearsInDepartment) {
        super();
        this.setName(name);
        this.canTeachGradLevel = canTeachGradLevel;
        this.facultyType = facultyType;
        this.setDepartmentJob(departmentJob);
        this.teachingAssistants = teachingAssistants;
        this.setCoursesTeaching(coursesTeaching);
        this.setYearsInDepartment(yearsInDepartment);
        this.hierarchicalStatus = 0;
        this.setOtherDepartmentRoles("None");
    }

    public FacultyMember(Boolean canTeachGradLevel, FacultyType facultyType, DepartmentJob departmentJob, ArrayList<GraduateStudent> teachingAssistant, GraduateStudent researchAssistant, int hierarchicalStatus, ArrayList<Course> coursesTeaching, Boolean isOnSabbatical, Boolean isDepartmentChair, int yearsInDepartment, String otherDepartmentRoles) {
        this();
        this.researchAssistant = researchAssistant;
        this.hierarchicalStatus = hierarchicalStatus;
        this.isOnSabbatical = isOnSabbatical;
        this.isDepartmentChair = isDepartmentChair;
        this.setOtherDepartmentRoles(otherDepartmentRoles);
        this.setYearsInDepartment(yearsInDepartment);
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


    public List<GraduateStudent> getTeachingAssistants() {
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


}
