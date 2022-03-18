package com.javaglobant.challenge.controller;

import com.javaglobant.challenge.model.Course;
import com.javaglobant.challenge.model.CourseDto;
import com.javaglobant.challenge.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    private ICourseService service;



    @GetMapping(value = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CourseDto> findByName(@PathVariable("name") String name){
       return this.service.findCourseByName(name);
    }

    /*@PostMapping()
    public void saveCourse(@RequestBody Course course){
        this.repository.save(course);
        System.out.println("Successfully");*/


}
