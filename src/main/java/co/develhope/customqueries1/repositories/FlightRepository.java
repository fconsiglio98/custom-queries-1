package co.develhope.customqueries1.repositories;

import co.develhope.customqueries1.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
