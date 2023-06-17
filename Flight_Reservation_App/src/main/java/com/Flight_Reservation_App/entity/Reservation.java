package com.Flight_Reservation_App.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;


@Entity 
public class Reservation extends AbstractEntity{
	private boolean checkedIn;
	private int numberOfBags;
	
	@OneToOne
    private Passanger passanger;
	
	@OneToOne
	private Flight flight;
	
	
	
	public boolean isCheckedIn() {
		return checkedIn;
	}


	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}


	public int getNumberOfBags() {
		return numberOfBags;
	}


	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}


	public Passanger getPassanger() {
		return passanger;
	}


	public void setPassanger(Passanger passanger) {
		this.passanger = passanger;
	}


	public Flight getFlight() {
		return flight;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	

}
