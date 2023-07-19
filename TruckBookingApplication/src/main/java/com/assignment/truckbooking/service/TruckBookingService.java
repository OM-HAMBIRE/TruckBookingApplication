package com.assignment.truckbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.truckbooking.dao.TruckBookingDao;
import com.assignment.truckbooking.model.TruckBooking;

@Service
public class TruckBookingService {
	
	@Autowired
	private TruckBookingDao truckbookingDao;
	
	public Iterable <TruckBooking>getAllTickets()
	{
		return truckbookingDao.findAll();
	}
	
	public TruckBooking getTicket(Integer truckId)
	{
		return truckbookingDao.findById(truckId)
				.orElse(new TruckBooking());
	}
	
	public TruckBooking createTicket(TruckBooking truckObj)
	{
		return truckbookingDao.save(truckObj);
	}
	
	public TruckBooking updateTicket(Integer truckId,String newLoadingPoint)
	{
		TruckBooking dbTruckObj=getTicket(truckId);
		dbTruckObj.setLoadingPoint(newLoadingPoint);
		return truckbookingDao.save(dbTruckObj);
	}
	
	public void deleteTicket(Integer truckId)
	{
		truckbookingDao.deleteById(truckId);
	}
	

}
