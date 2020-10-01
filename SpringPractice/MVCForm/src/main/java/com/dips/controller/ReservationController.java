package com.dips.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dips.model.Reservation;

@RequestMapping("/reservation")
@Controller
public class ReservationController {
	@RequestMapping("/bookingForm")
	public String bookingForm(Model model) {
		// create a reservation object
		Reservation res = new Reservation();
		// provide reservation object to the model
		model.addAttribute("reservation", res);
		return "reservation-page";
	}

	@RequestMapping("/submitForm")
	// @ModelAttribute binds form data to the object
	public String submitForm(@ModelAttribute("reservation") Reservation res) {
		return "confirmation-page";
	}

}
