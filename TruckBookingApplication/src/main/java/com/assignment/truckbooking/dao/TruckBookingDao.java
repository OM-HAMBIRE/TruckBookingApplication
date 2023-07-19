package com.assignment.truckbooking.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.truckbooking.model.TruckBooking;

@Repository
public interface TruckBookingDao extends CrudRepository<TruckBooking, Integer> 
{

	

}