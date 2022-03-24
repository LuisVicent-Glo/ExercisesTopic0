package com.javaglobant.challenge.services;


import com.javaglobant.challenge.entities.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();

    Student saveStudent(Student student);
    Student searchById(Long id);
    Object updateStudent(Long id, Student student);
    void deleteStudent(Long id);
}
