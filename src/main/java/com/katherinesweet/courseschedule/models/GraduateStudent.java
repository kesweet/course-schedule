package com.katherinesweet.courseschedule.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


public class GraduateStudent extends Teacher {

    @OneToMany
    private List<Course> coursesTaking = new ArrayList<>();


    public GraduateStudent() {}

    public GraduateStudent(String name, int yearsInDepartment, DepartmentJob departmentJob, ArrayList<Course> coursesTeaching, ArrayList<Course> coursesTaking) {
        super(name, yearsInDepartment, departmentJob, coursesTeaching);
        this.coursesTaking = coursesTaking;
    }

}
