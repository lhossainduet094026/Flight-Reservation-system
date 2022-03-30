package com.lokman.flightReservationSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lokman.flightReservationSystem.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
