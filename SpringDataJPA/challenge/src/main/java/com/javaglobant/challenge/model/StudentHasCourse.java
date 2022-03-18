package com.javaglobant.challenge.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "student_has_course")
@Data
public class StudentHasCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idstudent")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "idcourse")
    private Course course;

    @Column(name = "grade")
    private Integer grade;

}
