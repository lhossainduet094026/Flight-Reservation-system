package com.lokman.flightReservationSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lokman.flightReservationSystem.entities.User;
import com.lokman.flightReservationSystem.repositories.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/showReg")
	public String showRegistrationPage() {
		return "login/registerUser";
	}

	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user) {
		userRepository.save(user);

		return "login/login";
	}

	@PostMapping("/login")
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap) {

		User user = userRepository.findByEmail(email);

		if (password.equals(user.getPassword())) {
			return "findFlights";
		} else {
			modelMap.addAttribute("msg", "Invalid user name or password .Please try again...");
		}

		return "login/login";
	}

}
