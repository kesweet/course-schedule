package com.katherinesweet.courseschedule.models;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.lang.annotation.Inherited;
import java.util.ArrayList;
import java.util.List;

@Entity
public abstract class Teacher extends AbstractEntity {

    private int age;
    private String gender;
    private int yearsInDepartment;
    private String specializations;

    @OneToMany
    private List<Course> previousCoursesTaught;
    private DepartmentJob departmentJob;
    private String otherDepartmentRoles;

    @OneToMany
    @JoinColumn
    private List<Course> coursesTeaching = new ArrayList<>();

    public Teacher() {}

    public Teacher(String name, int yearsInDepartment, DepartmentJob departmentJob, List<Course> coursesTeaching) {
        this.setName(name);
        this.yearsInDepartment = yearsInDepartment;
        this.departmentJob = departmentJob;
        this.coursesTeaching = coursesTeaching;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecializations() {
        return specializations;
    }

    public void setSpecializations(String specializations) {
        this.specializations = specializations;
    }

    public List<Course> getPreviousCoursesTaught() {
        return previousCoursesTaught;
    }

    public void setPreviousCoursesTaught(ArrayList<Course> previousCoursesTaught) {
        this.previousCoursesTaught = previousCoursesTaught;
    }

    public int getYearsInDepartment() {
        return yearsInDepartment;
    }

    public void setYearsInDepartment(int yearsInDepartment) {
        this.yearsInDepartment = yearsInDepartment;
    }

    public DepartmentJob getDepartmentJob() {
        return departmentJob;
    }

    public void setDepartmentJob(DepartmentJob departmentJob) {
        this.departmentJob = departmentJob;
    }

    public String getOtherDepartmentRoles() {
        return otherDepartmentRoles;
    }

    public void setOtherDepartmentRoles(String otherDepartmentRoles) {
        this.otherDepartmentRoles = otherDepartmentRoles;
    }

    public List<Course> getCoursesTeaching() {
        return coursesTeaching;
    }

    public void setCoursesTeaching(ArrayList<Course> coursesTeaching) {
        this.coursesTeaching = coursesTeaching;
    }


}
