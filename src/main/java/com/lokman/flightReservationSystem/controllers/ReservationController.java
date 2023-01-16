package com.lokman.flightReservationSystem.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lokman.flightReservationSystem.Dtos.ReservationRequestDto;
import com.lokman.flightReservationSystem.entities.Flight;
import com.lokman.flightReservationSystem.repositories.FlightRepository;

/**
 * @author lokman 8/11/2022
 *
 */

@Controller
public class ReservationController {

	@Autowired
	private FlightRepository  flightRepository;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		
		System.out.println("flightId" + flightId);

		Optional<Flight> flightOptional = flightRepository.findById(flightId);

		if (flightOptional.isPresent()) {
			Flight flight = flightOptional.get();
			
			modelMap.addAttribute("flight", flight);
		}

		return "completeReservation";
	}
	
	/**
	 * @author lokman 17/1/2023
	 * @param reservationRequestDto
	 * @return
	 */
	@RequestMapping(value ="/completeReservation" , method = RequestMethod.POST)
	public String completeReservation(ReservationRequestDto reservationRequestDto) {
		return null;
	}
}
