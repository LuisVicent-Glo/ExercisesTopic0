package com.example.javaglobant;

import com.example.javaglobant.exercises.entity.Flight;
import com.example.javaglobant.repository.FlightRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class CrudTests {

    @Autowired
    private FlightRepository flightRepository;

    @Test
    void shouldPerfomanceCrudOperantions(){
        final Flight flight = new Flight();
        flight.setOrigin("Medellin");
        flight.setDestination("Santa Marta");
        flight.setScheduleAt(LocalDateTime.now());

        flightRepository.save(flight);

        assertThat(flightRepository.findAll())
                .hasSize(1)
                .first()
                .isEqualToComparingFieldByField(flight);

        flightRepository.deleteById(flight.getId());

        assertThat(flightRepository.count()).isZero();
    }
}
