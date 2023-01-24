package com.lokman.flightReservationSystem.services;
/**
 * 
 * @author lokman 25/1/2023
 *
 */

import com.lokman.flightReservationSystem.Dtos.ReservationRequestDto;
import com.lokman.flightReservationSystem.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequestDto reservationRequestDto);
}
