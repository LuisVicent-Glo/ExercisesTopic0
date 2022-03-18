package com.example.javaglobant;

import com.example.javaglobant.exercises.entity.Flight;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class JavaglobantApplicationTests {

	@Autowired
	private EntityManager entityManager;

	@Test
	void verifyFlightCanSaved() {
		Flight flight = new Flight();
		flight.setOrigin("Amsterdan");
		flight.setDestination("Santa Marta");
		flight.setScheduleAt(LocalDateTime.now());

		entityManager.persist(flight);
		TypedQuery<Flight> select_f_from_flight_f = entityManager.createQuery("SELECT f FROM Flight f", Flight.class);

		final List<Flight> result = select_f_from_flight_f.getResultList();

		assertThat(result)
				.hasSize(1)
				.first()
				.isEqualTo(flight);

	}

}
