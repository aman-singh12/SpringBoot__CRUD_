package com.example_Test.CRUD__Test;


public class ResponseStructure<Shipment> {

	private int satutscode;
	private String message;
	private Shipment data;
	public int getSatutscode() 
	{
		return satutscode;
	}
	public void setSatutscode(int satutscode) {
		this.satutscode = satutscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Shipment getData() {
		return data;
	}
	public void setData(Shipment data) {
		this.data = data;
	}
	
	
	
}
