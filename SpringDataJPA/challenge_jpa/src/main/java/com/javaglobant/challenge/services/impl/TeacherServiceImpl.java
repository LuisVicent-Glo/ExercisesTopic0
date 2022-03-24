package com.javaglobant.challenge.services.impl;

import com.javaglobant.challenge.entities.Teacher;
import com.javaglobant.challenge.repositories.TeacherRepository;
import com.javaglobant.challenge.services.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher searchById(Long id){
        return teacherRepository.findById(id).get();
    }

    @Override
    public Object updateTeacher(Long id, Teacher teacher){
        Teacher teacher1 = teacherRepository.getById(id);

        if (!teacher.getName().isEmpty()){
            teacher1.setName(teacher.getName());
        }
        if (!teacher.getLastName().isEmpty()){
            teacher1.setLastName(teacher.getLastName());
        }
        return teacherRepository.save(teacher1);
    }

    @Override
    public void deleteTeacher(Long id) {
        Teacher teacher = teacherRepository.findById(id).get();
        teacherRepository.delete(teacher);
    }
}
