package com.javaglobant.challenge.service;

import com.javaglobant.challenge.model.Course;
import com.javaglobant.challenge.model.CourseDto;

import java.util.List;

public interface ICourseService {
    List<Course> findAllCourses();

    Course findCourseById(Long id);

    List<CourseDto> findCourseByName(String name);
}
