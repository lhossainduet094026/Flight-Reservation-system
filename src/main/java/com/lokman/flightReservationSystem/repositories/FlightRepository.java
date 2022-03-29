package com.lokman.flightReservationSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lokman.flightReservationSystem.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
