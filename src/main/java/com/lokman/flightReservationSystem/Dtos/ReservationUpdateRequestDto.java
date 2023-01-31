package com.lokman.flightReservationSystem.Dtos;

/**
 * 
 * @author lokman 1/2/2023
 *
 */
public class ReservationUpdateRequestDto {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	private boolean checkedIn;
	private int numberOfBags;
}
