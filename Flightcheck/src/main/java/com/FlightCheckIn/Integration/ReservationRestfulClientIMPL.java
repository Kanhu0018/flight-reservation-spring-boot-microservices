package com.FlightCheckIn.Integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.FlightCheckIn.Integration.dto.Reservation;
import com.FlightCheckIn.Integration.dto.ReservationUpdateRequest;

@Component
public class ReservationRestfulClientIMPL implements ReservationRestfulClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate =new RestTemplate();
		System.out.println("Test-3");
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flights/reservation/"+id,Reservation.class );
		System.out.println("Test-4");
		return reservation;
				
	}
	@Override
	public Reservation UpdateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate=new RestTemplate();
		Reservation reservation = restTemplate.postForObject("http://localhost:8080/flights/reservation/", request,Reservation.class );
		return reservation;
	}
	
	

}
