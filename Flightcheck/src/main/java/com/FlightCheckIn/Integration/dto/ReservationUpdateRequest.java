package com.FlightCheckIn.Integration.dto;

public class ReservationUpdateRequest {
	private Long id;
	private int numberOfBags;
	private boolean checkedIn;
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumberOfbags() {
		return numberOfBags;
	}
	public void setNumberOfbags(int numberOfbags) {
		this.numberOfBags = numberOfbags;
	}
	

}
