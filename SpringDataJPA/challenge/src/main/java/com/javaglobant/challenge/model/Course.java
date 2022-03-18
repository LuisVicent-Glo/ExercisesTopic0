package com.javaglobant.challenge.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "course")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcourse")
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    Set<StudentHasCourse> students;

    @JsonIgnore
    @ManyToMany(mappedBy = "courses")
    Set<Teacher> teachers;

    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }
}
