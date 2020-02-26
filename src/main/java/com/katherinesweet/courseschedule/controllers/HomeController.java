package com.katherinesweet.courseschedule.controllers;

import com.katherinesweet.courseschedule.models.Calendar;
import com.katherinesweet.courseschedule.models.data.CourseRepository;
import com.katherinesweet.courseschedule.models.data.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @RequestMapping("")
    public String showCalendar(Model model) {
        model.addAttribute("title", "Course Calendar");
        model.addAttribute("courses", courseRepository.findAll());
        model.addAttribute("teachers", teacherRepository.findAll());
        model.addAttribute("calendarDays", Calendar.createFullWeek());
        model.addAttribute("calendarTimes", Calendar.buildTimeSlots(7, 9, 10));
        return "index";
    }

}
