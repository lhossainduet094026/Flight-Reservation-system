package com.lokman.flightReservationSystem.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lokman.flightReservationSystem.entities.Reservation;
import com.lokman.flightReservationSystem.repositories.ReservationRepository;

/**
 * @author lokman 8/11/2022
 *
 */

@Controller
public class ReservationController {

	@Autowired
	private ReservationRepository reservationRepository;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		
		System.out.println("flightId" + flightId);
		
		Optional<Reservation> reservationOptional = reservationRepository.findById(flightId);
		
		if(reservationOptional.isPresent()) {
			Reservation reservation = reservationOptional.get();
			System.out.println(reservation.getId());
			System.out.println(reservation.getPassenger().getFirstName());
			System.out.println(reservation.getFlight().getId());
			modelMap.addAttribute("reservation", reservation);
		}
		
		
		return "completeReservation";
	}
}
