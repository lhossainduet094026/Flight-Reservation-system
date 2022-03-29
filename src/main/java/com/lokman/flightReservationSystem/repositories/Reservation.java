package com.lokman.flightReservationSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Reservation extends JpaRepository<Reservation, Long> {

}
