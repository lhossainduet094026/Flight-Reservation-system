package com.lokman.flightReservationSystem.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lokman.flightReservationSystem.Dtos.ReservationRequestDto;
import com.lokman.flightReservationSystem.entities.Flight;
import com.lokman.flightReservationSystem.entities.Passenger;
import com.lokman.flightReservationSystem.entities.Reservation;
/**
 * 
 * @author lokman 25/1/2023
 *
 */
import com.lokman.flightReservationSystem.repositories.FlightRepository;
import com.lokman.flightReservationSystem.repositories.PassengerRepository;
import com.lokman.flightReservationSystem.repositories.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private FlightRepository flightRepository;

	@Autowired
	private PassengerRepository passengerRepository;

	private ReservationRepository reservationRepository;

	@Override
	public Reservation bookFlight(ReservationRequestDto reservationRequestDto) {

		Long flightId = reservationRequestDto.getFlightId();

		Optional<Flight> fightOptional = flightRepository.findById(flightId);

		Passenger passenger = new Passenger();
		passenger.setFirstName(reservationRequestDto.getPassengerFirstName());
		passenger.setLastName(reservationRequestDto.getPassengerLastName());
		passenger.setEmail(reservationRequestDto.getPassengerEmail());
		passenger.setPhone(reservationRequestDto.getPassengerPhone());

		Passenger savedPassenger = passengerRepository.save(passenger);

		Reservation reservation = new Reservation();
		reservation.setFlight(fightOptional.get());
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(Boolean.FALSE);

		Reservation savedReservation = reservationRepository.save(reservation);

		return savedReservation;
	}

}
