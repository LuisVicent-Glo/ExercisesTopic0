package com.javaglobant.challenge.controllers;

import com.javaglobant.challenge.entities.Teacher;
import com.javaglobant.challenge.services.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    ITeacherService teacherService;

    @GetMapping
    public List<Teacher> getAll(){
        return teacherService.getAll();
    }

    @GetMapping("/{id}")
    public Teacher findById(@PathVariable final Long id){
        return teacherService.searchById(id);
    }

    @PostMapping
    public Teacher createTeacher(@RequestBody Teacher teacher){
        return teacherService.saveTeacher(teacher);
    }

    @PutMapping("/{id}")
    public Object updateTeacher(@PathVariable Long id,@RequestBody Teacher teacher){
        return teacherService.updateTeacher(id, teacher);
    }

    @DeleteMapping("/{id}")
    public List<Teacher> deleteTeacher(@PathVariable Long id){
        teacherService.deleteTeacher(id);
        return teacherService.getAll();
    }
}
