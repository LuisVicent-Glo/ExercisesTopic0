package com.javaglobant.exercises.repository;

import com.javaglobant.exercises.model.Speaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id de la impresora");
        speaker.setId(sc.nextInt());
        System.out.println("Ingrese el nombre de la impresora");
        speaker.setName(sc.next());

        speakers.add(speaker);
        return speakers;
    }
}
