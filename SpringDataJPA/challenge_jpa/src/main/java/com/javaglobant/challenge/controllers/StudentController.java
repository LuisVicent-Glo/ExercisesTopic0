package com.javaglobant.challenge.controllers;

import com.javaglobant.challenge.entities.Student;
import com.javaglobant.challenge.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private IStudentService service;


    @GetMapping
    public List<Student> studentList(){
        List<Student> allStudent = service.getAll();
        return allStudent;
    }

    @GetMapping(path = "/{id}")
    public Object findStudentById(@PathVariable("id") Long id)
    {
        try {
            return service.searchById(id);
        }
        catch (Exception e){
            return e.getMessage();
        }
    }



    @PostMapping
    public Student saveStudent(@RequestBody final Student student){
        return service.saveStudent(student);
    }


    @PutMapping("/{id}")
    public Object update(@PathVariable Long id, @RequestBody Student student){
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public List<Student> deleteStudent(@PathVariable Long id){
        service.deleteStudent(id);
        return service.getAll();
    }




}
