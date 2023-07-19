package com.assignment.truckbooking.model;


import java.sql.Timestamp;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="truck_booking")
public class TruckBooking 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="truck_id")
	private Integer truckId;
	
	@Column(name="loading_Point")
	private String loadingPoint;
	
	@Column(name="unloading_Point")
	private String unloadingPoint;
	
	@Column(name="product_Type")
	private String product_Type;
	
	@Column(name="truck_Type")
	private String truckType;
	
	@Column(name="no_of_truck")
	private Integer noOfTruck;
	
	@Column(name="weight")
	private Integer weight;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="shipper_id")
	private Integer shipper_id;
	
	@JsonFormat(pattern="dd/mm/yyyy",shape=Shape.STRING)
	@Column(name="date")
	private String date;
	
	public Integer gettruckId()
	{
		return truckId;
	}
	
	public void settruckId(Integer truckId)
	{
		this.truckId=truckId;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getproduct_Type() {
		return product_Type;
	}

	public void setproduct_Type(String product_Type) {
		this.product_Type = product_Type;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public Integer getNoOfTruck() {
		return noOfTruck;
	}

	public void setNoOfTruck(Integer noOfTruck) {
		this.noOfTruck = noOfTruck;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getShipper_id() {
		return shipper_id;
	}

	public void setShipper_id(Integer shipper_id) {
		this.shipper_id = shipper_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	

	public TruckBooking(String loadingPoint, String unloadingPoint, String product_Type, String truckType,
			Integer noOfTruck, Integer weight, String comment, Integer shipper_id, String date) {
		super();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.product_Type = product_Type;
		this.truckType = truckType;
		this.noOfTruck = noOfTruck;
		this.weight = weight;
		this.comment = comment;
		this.shipper_id = shipper_id;
		this.date = date;
	}
	public TruckBooking() {
		
	}

	@Override
	public String toString() {
		return "TruckBooking [truckId=" + truckId + ", loadingPoint=" + loadingPoint + ", unloadingPoint="
				+ unloadingPoint + ", product_Type=" + product_Type + ", truckType=" + truckType + ", noOfTruck=" + noOfTruck
				+ ", weight=" + weight + ", comment=" + comment + ", shipper_id=" + shipper_id + ", date=" + date + "]";
	}

}
