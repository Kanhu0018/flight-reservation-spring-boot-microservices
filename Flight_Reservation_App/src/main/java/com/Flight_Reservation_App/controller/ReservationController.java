package com.Flight_Reservation_App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Flight_Reservation_App.dto.ReservationRequest;
import com.Flight_Reservation_App.entity.Reservation;
import com.Flight_Reservation_App.service.ReservationService;


@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping("/confirmReservation")
	public String confirmReservation(ReservationRequest request,ModelMap modelmap) {
		Reservation reservationId = reservationService.bookFlight(request);
		modelmap.addAttribute("reservationId", reservationId.getId());
		
		return "confirmReservation";
	}

}
