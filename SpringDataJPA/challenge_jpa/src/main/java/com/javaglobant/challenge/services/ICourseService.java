package com.javaglobant.challenge.services;

import com.javaglobant.challenge.entities.Course;
import java.util.List;

public interface ICourseService {

    List<Course> findAllCourses();
    Course findCourseById(Long id);
    List<Course> findCourseByName(String name);

    Course saveCourse(Course course);

    Object updateCourse(Long id, Course course);

    void deleteCourse(Long id);
}
