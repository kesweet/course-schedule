package com.katherinesweet.courseschedule.models;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class GraduateStudent extends Person {

    private ArrayList<Course> coursesTeaching;
    private ArrayList<Course> coursesTaking;

}
