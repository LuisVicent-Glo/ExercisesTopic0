package com.javaglobant.exercises.repository;

import com.javaglobant.exercises.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
