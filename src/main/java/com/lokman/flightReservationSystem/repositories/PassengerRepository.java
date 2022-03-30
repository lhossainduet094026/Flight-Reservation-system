package com.lokman.flightReservationSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lokman.flightReservationSystem.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
