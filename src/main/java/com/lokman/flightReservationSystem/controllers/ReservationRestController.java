package com.lokman.flightReservationSystem.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lokman.flightReservationSystem.Dtos.ReservationUpdateRequestDto;
import com.lokman.flightReservationSystem.entities.Reservation;
import com.lokman.flightReservationSystem.repositories.ReservationRepository;

/**
 * 
 * @author lokman 1/2/2023
 *
 */
@RestController
public class ReservationRestController {

	@Autowired
	private ReservationRepository reservationRepository;

	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		Optional<Reservation> reservationOptional = reservationRepository.findById(id);
		return reservationOptional.get();
	}

	@RequestMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequestDto updateRequestDto) {

		Optional<Reservation> reservationOptional = reservationRepository.findById(updateRequestDto.getId());
		Reservation reservation = reservationOptional.get();

		reservation.setCheckedIn(updateRequestDto.isCheckedIn());
		reservation.setNumberOfBags(updateRequestDto.getNumberOfBags());
		return reservationRepository.save(reservation);
	}
}
