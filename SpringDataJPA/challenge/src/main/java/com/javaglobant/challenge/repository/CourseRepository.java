package com.javaglobant.challenge.repository;

import com.javaglobant.challenge.model.Course;
import com.javaglobant.challenge.model.CourseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<CourseDto> findByName(String name);
}