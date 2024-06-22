package com.parkinglot.models;

import java.util.List;

public class ParkingLot  extends BaseModel{
	private List<ParkingFloor> parkingFloors;
	private List<Gate> gates;
	private List<VehicleType> vechicleTypes;
	private ParkingLotStatus parkingLotStatus;
	public List<ParkingFloor> getParkingFloors() {
		return parkingFloors;
	}
	public void setParkingFloors(List<ParkingFloor> parkingFloors) {
		this.parkingFloors = parkingFloors;
	}
	public List<Gate> getGates() {
		return gates;
	}
	public void setGates(List<Gate> gates) {
		this.gates = gates;
	}
	public List<VehicleType> getVechicleTypes() {
		return vechicleTypes;
	}
	public void setVechicleTypes(List<VehicleType> vechicleTypes) {
		this.vechicleTypes = vechicleTypes;
	}
	public ParkingLotStatus getParkingLotStatus() {
		return parkingLotStatus;
	}
	public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
		this.parkingLotStatus = parkingLotStatus;
	}
	

}
