package com.lokman.flightReservationSystem.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lokman.flightReservationSystem.entities.Flight;
import com.lokman.flightReservationSystem.repositories.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	private FlightRepository flightRepository;

	@PostMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("dapartureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate, ModelMap map) {

		List<Flight> flights = flightRepository.findFlights(from, to, departureDate);

		map.addAttribute("flights", flights);
		
		System.out.println(flights.toString());

		return "displayFlights";
	}
}
