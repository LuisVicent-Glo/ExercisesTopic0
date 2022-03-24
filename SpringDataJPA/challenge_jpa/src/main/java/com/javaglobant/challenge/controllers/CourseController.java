package com.javaglobant.challenge.controllers;

import com.javaglobant.challenge.entities.Course;
import com.javaglobant.challenge.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {



    @Autowired
    private ICourseService service;


    @GetMapping
    public List<Course> showCourses(){
        return service.findAllCourses();
    }

    @GetMapping("/{id}")
    public Course getById(@PathVariable("id") Long id){
        return service.findCourseById(id);
    }

    @GetMapping("search-name/{name}")
    public List<Course> getByName(@PathVariable("name") String name){
        return service.findCourseByName(name);
    }


    @PostMapping
    public Course createCourse(@RequestBody final Course course){
        return service.saveCourse(course);
    }

    @PutMapping("/{id}")
    public Object update(@PathVariable Long id, @RequestBody Course course){
        return service.updateCourse(id, course);
    }

    @DeleteMapping("/{id}")
    public List<Course> deleteCourse(@PathVariable Long id){
        service.deleteCourse(id);
        return service.findAllCourses();
    }



}
