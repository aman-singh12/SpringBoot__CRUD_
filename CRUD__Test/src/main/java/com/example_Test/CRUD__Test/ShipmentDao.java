package com.example_Test.CRUD__Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShipmentDao {
	@Autowired
	private ShipmentRepository shipmneRepository;
	
//	insert
	public Shipment saveShipment(Shipment shipment)
	{
		return shipmneRepository.save(shipment);
		
	}
	
//	get
	
 
	

}
