package com.FlightCheckIn.Integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.FlightCheckIn.Integration.dto.Reservation;
import com.FlightCheckIn.Integration.dto.ReservationUpdateRequest;

public interface ReservationRestfulClient {
	
	 public Reservation findReservation(Long id);
	 public Reservation UpdateReservation(@RequestBody ReservationUpdateRequest request);
}
