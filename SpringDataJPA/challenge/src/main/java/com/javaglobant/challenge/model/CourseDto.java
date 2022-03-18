package com.javaglobant.challenge.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseDto implements Serializable {
    private final Long id;
    private final String name;
}
