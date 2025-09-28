package com.example_Test.CRUD__Test;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shipment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long trackingNumber;
	private String origin;
	private String destination;
	private LocalDate estimateDeliveryDate;
	private int status;
	private String carrer;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(long trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getEstimateDeliveryDate() {
		return estimateDeliveryDate;
	}
	public void setEstimateDeliveryDate(LocalDate estimateDeliveryDate) {
		this.estimateDeliveryDate = estimateDeliveryDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getCarrer() {
		return carrer;
	}
	public void setCarrer(String carrer) {
		this.carrer = carrer;
	}
	
	
}
