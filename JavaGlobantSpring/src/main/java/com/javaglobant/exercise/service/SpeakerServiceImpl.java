package com.javaglobant.exercises.service;

import com.javaglobant.exercises.model.Speaker;
import com.javaglobant.exercises.repository.SpeakerRepositoryImpl;
import com.javaglobant.exercises.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository = new SpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
