package com.javaglobant.challenge.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idstudent", nullable = false)
    private Long id;

    @Column(name = "name", length = 40, nullable = false)
    private String name;

    @Column(name = "lastName", length = 40, nullable = false)
    private String lastName;

    @Column(name = "age", nullable = false)
    private byte age;

    @Column(name = "gender", length = 20, nullable = false)
    private String gender;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    Set<StudentHasCourse> courses;

}
