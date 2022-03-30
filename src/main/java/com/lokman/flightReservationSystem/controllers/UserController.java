package com.lokman.flightReservationSystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/showReg")
	public String showRegistrationPage() {
		return "login/registerUser";
	}
}
