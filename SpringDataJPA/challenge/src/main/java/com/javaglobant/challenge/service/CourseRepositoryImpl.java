package com.javaglobant.challenge.service;

import com.javaglobant.challenge.model.Course;
import com.javaglobant.challenge.model.CourseDto;
import com.javaglobant.challenge.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseRepositoryImpl implements ICourseService {

    @Autowired
    private CourseRepository repository;

    @Override
    public List<Course> findAllCourses() {
        return this.repository.findAll();
    }

    @Override
    public Course findCourseById(Long id) {
        return this.repository.findById(id).get();
    }

    @Override
    public List<CourseDto> findCourseByName(String name) {
        return this.repository.findByName(name);
    }
}
