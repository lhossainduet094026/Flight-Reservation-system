package com.lokman.flightReservationSystem.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEntity {
	private int flightNumber;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	private Timestamp estimatedDepatureTime;

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArivalCity() {
		return arrivalCity;
	}

	public void setArivalCity(String arivalCity) {
		this.arrivalCity = arivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Timestamp getEstimatedDepatureTime() {
		return estimatedDepatureTime;
	}

	public void setEstimatedDepatureTime(Timestamp estimatedDepatureTime) {
		this.estimatedDepatureTime = estimatedDepatureTime;
	}

}
