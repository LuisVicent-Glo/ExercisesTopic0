package com.example.javaglobant;

import com.example.javaglobant.exercises.entity.Flight;
import com.example.javaglobant.repository.FlightRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class derivedQueries {

    @Autowired
    private FlightRepository flightRepository;

    @Test
    void deleteAllFlights() {
        flightRepository.deleteAll();
    }

    @Test
    void findByOrigin(){
        final Flight flight1 = createFlights("Paris");
        final Flight flight2 = createFlights("Bogota");
        final Flight flight3 = createFlights("Paris");

        flightRepository.save(flight1);
        flightRepository.save(flight2);
        flightRepository.save(flight3);

        List<Flight> flightFromMadrid = flightRepository.findByOrigin("Paris");

        assertThat(flightFromMadrid).hasSize(2);
        assertThat(flightFromMadrid.get(0)).isEqualToComparingFieldByField(flight1);
        assertThat(flightFromMadrid.get(1)).isEqualToComparingFieldByField(flight3);
    }

    @Test
    public void shouldFindFromOriginAndDestination(){
        Flight flight1 = createFlights("Madrid");
        Flight flight2 = createFlights("Santa Marta");
        Flight flight3 = createFlights("Bogota");
        Flight flight4 = createFlights("Madrid");

        flightRepository.save(flight1);
        flightRepository.save(flight2);
        flightRepository.save(flight3);
        flightRepository.save(flight4);

        final List<Flight> originAndDestination =
                    flightRepository
                            .findByOriginAndDestination("Madrid", "Valledupar");

        assertThat(originAndDestination).hasSize(2);
        assertThat(originAndDestination.get(0)).isEqualToComparingFieldByField(flight1);
        assertThat(originAndDestination.get(1)).isEqualToComparingFieldByField(flight4);
    }

    private Flight createFlights(String origin, String destination){
        final Flight flight = new Flight();
        flight.setOrigin(origin);
        flight.setDestination(destination);
        flight.setScheduleAt(LocalDateTime.now());

        return flight;
    }

    private Flight createFlights(String origin){
        return createFlights(origin, "Valledupar");
    }

}
