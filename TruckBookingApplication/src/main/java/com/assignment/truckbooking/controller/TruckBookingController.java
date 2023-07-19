package com.assignment.truckbooking.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.truckbooking.model.TruckBooking;
import com.assignment.truckbooking.service.TruckBookingService;

//{
//    "loadingPoint": "delhi",
//    "unloadingPoint": "jaipur",
//    "product_Type": "chemicals",
//    "truckType": "canter",
//    "noOfTruck": 2,
//    "weight": 100,
//    "comment": "this is my first delivery",
//    "shipper_id": 123,
//    "date": "01-03-2023"
//}
@RestController
@RequestMapping(value="/load")
public class TruckBookingController 
{
	@Autowired
	private TruckBookingService truckbookingService;
	//http://localhost:8080/load/payload
	@PostMapping(value="/payload")
	
	public TruckBooking createTicket(@RequestBody TruckBooking inputObj)
	{
		return truckbookingService.createTicket(inputObj);
	}
	//http://localhost:8080/load/all
	@GetMapping(value="/all")
	public Iterable<TruckBooking>getAllTickets()
	{
		return truckbookingService.getAllTickets();
	}
	//http://localhost:8080/load/1
	@GetMapping(value="/{truckId}")
	public TruckBooking retrieveTicket(@PathVariable ("truckId")Integer truckId)
	{
		return truckbookingService.getTicket(truckId);
	}
	//http://localhost:8080/load/1/"Delhi"
	@PutMapping(value="/{truckId}/{newLoadingPoint}")
	public TruckBooking updateTicket(@PathVariable ("truckId") Integer truckId,@PathVariable("newLoadingPoint")String newLoadingPoint)
	{
		return truckbookingService.updateTicket(truckId, newLoadingPoint);
	}
	//http://localhost:8080/load/1
	@DeleteMapping(value="/{truckId}")
	public void deleteTicket(@PathVariable("truckId")Integer truckId)
	{
		truckbookingService.deleteTicket(truckId);
	}
	
	
	

}
