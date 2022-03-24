package com.javaglobant.challenge.services;

import com.javaglobant.challenge.entities.Teacher;

import java.util.List;

public interface ITeacherService {
    List<Teacher> getAll();

    Teacher saveTeacher(Teacher teacher);

    Teacher searchById(Long id);

    Object updateTeacher(Long id, Teacher teacher);

    void deleteTeacher(Long id);
}
