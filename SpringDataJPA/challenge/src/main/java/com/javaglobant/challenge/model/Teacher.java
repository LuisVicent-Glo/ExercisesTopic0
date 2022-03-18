package com.javaglobant.challenge.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idteacher")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "teacher_has_course",
            joinColumns = @JoinColumn(name = "teacher_idteacher"),
            inverseJoinColumns = @JoinColumn(name = "course_idcourse"))
    Set<Course> courses;
}
