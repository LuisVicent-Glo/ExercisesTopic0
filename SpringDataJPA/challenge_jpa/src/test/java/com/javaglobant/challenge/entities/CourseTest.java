package com.javaglobant.challenge.entities;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void showIfAddingDataIsValid(){
        Course course = new Course();
        course.setId(1L);
        course.setName("Maths");
        List<Course> list = new ArrayList<>();
        list.add(course);

        assertNotNull(list);
        assertEquals(1, list.size());
    }

}