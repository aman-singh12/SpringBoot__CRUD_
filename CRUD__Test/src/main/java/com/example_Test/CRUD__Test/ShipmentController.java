package com.example_Test.CRUD__Test;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Shipment")
public class ShipmentController {

	
	@Autowired
	private ShipmentRepository   shipmentRepository ;
	
	
	
	@PostMapping
	public String createShipment(@RequestBody Shipment shipment ) {
		shipmentRepository.save(shipment);
		return "Record is Inserted in the Table ";		
	}
	
	
	@GetMapping
	public ResponseEntity<ResponseStructure<List<Shipment>>> getAllShipment(){
		
		List<Shipment> ship = shipmentRepository.findAll();
		
		ResponseStructure<List<Shipment>> rs= new ResponseStructure<List<Shipment>>();


		rs.setSatutscode(HttpStatus.OK.value());
		rs.setMessage("Success");
		rs.setData(ship);
		
		return new ResponseEntity<ResponseStructure<List<Shipment>>>(rs,HttpStatus.OK);	
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<ResponseStructure<Shipment>>  getByShipment(@PathVariable int id){
		
		Optional<Shipment> opt= shipmentRepository.findById(id);
		
		ResponseStructure<Shipment> stu= new ResponseStructure<Shipment>();
		
		if(opt.isPresent()) {
			stu.setSatutscode(HttpStatus.OK.value());
			stu.setMessage("Success");
			stu.setData(opt.get());
			return new ResponseEntity<ResponseStructure<Shipment>>(stu,HttpStatus.OK);
		}
		else {
			return null;
			
		}
		
	}
	
	
	@PutMapping
	public  ResponseEntity<ResponseStructure<Shipment>> updateEmployee(@RequestBody Shipment student){
	
		shipmentRepository.save(student);
		ResponseStructure<Shipment> stu=new ResponseStructure<Shipment>();
		stu.setSatutscode(HttpStatus.OK.value());
		stu.setMessage("Success");
		stu.setData(student);
		
		return new  ResponseEntity<ResponseStructure<Shipment>>(stu,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public  ResponseEntity<ResponseStructure<String>> updateStudent(@PathVariable int id){
		Optional<Shipment> opt = shipmentRepository.findById(id);
		
		ResponseStructure<String> stu=new ResponseStructure<String>();

		if(opt.isPresent()) {
			stu.setSatutscode(HttpStatus.OK.value());
			stu.setMessage("Success");
			stu.setData("Employee Deleted");
			return new ResponseEntity<ResponseStructure<String>>(stu,HttpStatus.OK);
			
		}
		else {
			stu.setSatutscode(HttpStatus.NOT_FOUND.value());
			stu.setMessage("Id is not found");
			return new ResponseEntity<ResponseStructure<String>>(stu,HttpStatus.NOT_FOUND);
			
        
		}
	}
	
}