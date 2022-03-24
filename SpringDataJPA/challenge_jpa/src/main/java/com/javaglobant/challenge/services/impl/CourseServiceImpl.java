package com.javaglobant.challenge.services.impl;

import com.javaglobant.challenge.entities.Course;
import com.javaglobant.challenge.repositories.CourseRepository;
import com.javaglobant.challenge.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course findCourseById(Long id) {
        return courseRepository.findById(id).get();
    }

    @Override
    public List<Course> findCourseByName(String name){
        return courseRepository.findByName(name);
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);

    }

    @Override
    public Object updateCourse(Long id, Course course) {
        Course course1 = courseRepository.getById(id);


        if (!course.getName().isEmpty()){
            course1.setName(course.getName());
        }
        if (!course.getGrade().equals(null)) {
            course1.setGrade(course.getGrade());
        }
        if (!course.getStudents().isEmpty()){
            course1.setStudents(course.getStudents());
        }
        if (!course.getTeacher().equals(null)){
            course1.setTeacher(course.getTeacher());
        }
        return courseRepository.save(course1);
    }

    @Override
    public void deleteCourse(Long id) {
        Course course = courseRepository.getById(id);
        courseRepository.delete(course);
    }


}
