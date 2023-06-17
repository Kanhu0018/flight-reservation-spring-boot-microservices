package com.Flight_Reservation_App.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Flight_Reservation_App.dto.ReservationRequest;
import com.Flight_Reservation_App.entity.Flight;
import com.Flight_Reservation_App.entity.Passanger;
import com.Flight_Reservation_App.entity.Reservation;
import com.Flight_Reservation_App.repository.FlightRepository;
import com.Flight_Reservation_App.repository.PassangerRepository;
import com.Flight_Reservation_App.repository.ReservationRepository;
import com.Flight_Reservation_App.utlities.EmailUtil;
import com.Flight_Reservation_App.utlities.PDFGenerator;


@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private PassangerRepository passangerRepo;
	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired 
	private ReservationRepository reservationRepo;
	
	@Autowired
	private PDFGenerator pdfGenerator;
	
	@Autowired
	private EmailUtil emailUtil;

	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
		
		
		Passanger passanger=new Passanger();
		
		passanger.setFirstName(request.getFirstName());
		passanger.setLastName(request.getLastName());
		passanger.setMiddleName(request.getMiddleName());
		passanger.setEmail(request.getEmail());
		passanger.setPhone(request.getPhone());
		
		passangerRepo.save(passanger);
		
		long flightId = request.getFlightId();
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		
		Reservation reservation=new Reservation();
		reservation.setFlight(flight);
		reservation.setPassanger(passanger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		String filePath="F:\\Spring Boot\\Flight_Reservation_App\\tickets\\reservation"+reservation.getId()+".pdf";

		reservationRepo.save(reservation);
		pdfGenerator.generatePDF(filePath,reservation);
		emailUtil.sendeMail(passanger.getEmail(), filePath);
		return reservation;
	}

}
