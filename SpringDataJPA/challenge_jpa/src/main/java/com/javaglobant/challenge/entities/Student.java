package com.javaglobant.challenge.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
    private Integer age;

    @Column(name = "gender", length = 20, nullable = false)
    private String gender;


}
