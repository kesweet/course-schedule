package com.katherinesweet.courseschedule.models.data;

import com.katherinesweet.courseschedule.models.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {
}
