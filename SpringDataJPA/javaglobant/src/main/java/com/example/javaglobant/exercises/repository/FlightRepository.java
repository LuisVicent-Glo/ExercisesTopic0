package com.example.javaglobant.exercises.repository;

import com.example.javaglobant.exercises.entity.Flight;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightRepository extends CrudRepository<Flight, Integer> {
    List<Flight> findByOrigin(String origin);

    List<Flight> findByOriginAndDestination(String origin, String destination);
}
