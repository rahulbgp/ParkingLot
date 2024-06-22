package com.parkinglot.models;

import java.util.List;

public class ParkingSpot {
	private int spotNumber;
	private int parkingFloor;
	private ParkingSpotStatus parkingSpotStatus;
	private List<VehicleType> vehicleTypes;

	public int getSpotNumber() {
		return spotNumber;
	}

	public void setSpotNumber(int spotNumber) {
		this.spotNumber = spotNumber;
	}

	public int getParkingFloor() {
		return parkingFloor;
	}

	public void setParkingFloor(int parkingFloor) {
		this.parkingFloor = parkingFloor;
	}

	public ParkingSpotStatus getParkingSpotStatus() {
		return parkingSpotStatus;
	}

	public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
		this.parkingSpotStatus = parkingSpotStatus;
	}

	public List<VehicleType> getVehicleTypes() {
		return vehicleTypes;
	}

	public void setVehicleTypes(List<VehicleType> vehicleTypes) {
		this.vehicleTypes = vehicleTypes;
	}

}
