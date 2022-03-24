package com.javaglobant.challenge.services.impl;

import com.javaglobant.challenge.services.IStudentService;
import com.javaglobant.challenge.entities.Student;
import com.javaglobant.challenge.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student searchById(Long id){
        return studentRepository.findById(id).get();
    }

    @Override
    public Object updateStudent(Long id, Student student){
        Student student1 = studentRepository.getById(id);

        if (!student.getName().isEmpty()){
            student1.setName(student.getName());
        }
        if (!student.getLastName().isEmpty()){
            student1.setLastName(student.getLastName());
        }
        if (!student.getAge().equals(null)){
            student1.setAge(student.getAge());
        }
        if (!student.getGender().isEmpty()){
            student1.setGender(student.getGender());
        }
        return studentRepository.save(student1);
    }

    @Override
    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id).get();
        studentRepository.delete(student);

    }
}
