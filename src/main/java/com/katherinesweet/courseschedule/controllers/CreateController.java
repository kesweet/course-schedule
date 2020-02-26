package com.katherinesweet.courseschedule.controllers;


import com.katherinesweet.courseschedule.models.data.CourseRepository;
import com.katherinesweet.courseschedule.models.data.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.GeneratedValue;

@Controller
@RequestMapping("create")
public class CreateController {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("")
    public String createPage(Model model) {
        model.addAttribute("title", "What would you like to create?");
        return "create/index";
    }

    @GetMapping("course")
    public String createCourse(Model model) {
        model.addAttribute("title", "Create a Course");
        return "create/course";
    }

    @GetMapping("faculty")
    public String createFaculty(Model model) {
        model.addAttribute("title", "Create a Faculty Member");
        return "create/faculty";
    }

    @GetMapping("grad")
    public String createGradStudent(Model model) {
        model.addAttribute("title", "Create a Graduate Student");
        return "create/gradstudent";
    }


}
