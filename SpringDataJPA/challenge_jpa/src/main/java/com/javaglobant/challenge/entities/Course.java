package com.javaglobant.challenge.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcourse")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "grade")
    private Integer grade;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    List<Student> students;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_teacher")
    private Teacher teacher;


}
