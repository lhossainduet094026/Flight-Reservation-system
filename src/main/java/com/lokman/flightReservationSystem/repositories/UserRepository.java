package com.lokman.flightReservationSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lokman.flightReservationSystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
