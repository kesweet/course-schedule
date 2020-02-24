package com.katherinesweet.courseschedule.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


public class GraduateStudent extends Teacher {

    @OneToMany
    private List<Course> coursesTaking = new ArrayList<>();


    public GraduateStudent() {}

    public void researcherNotTeacher() {
        if (this.getDepartmentJob().getDisplayName().equals("Research Assistant")) {
            this.setCoursesTeaching(new ArrayList<>());
        }
    }

}
