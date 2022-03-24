package com.javaglobant.challenge.repositories;

import com.javaglobant.challenge.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    @Query("select c from Course c where c.name = ?1")
    List<Course> findByName(String name);
}