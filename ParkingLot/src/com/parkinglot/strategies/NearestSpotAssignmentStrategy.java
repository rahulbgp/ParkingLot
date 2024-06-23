package com.parkinglot.strategies;

import com.parkinglot.models.ParkingLot;
import com.parkinglot.models.ParkingSpot;
import com.parkinglot.models.Vehicle;

public class NearestSpotAssignmentStrategy implements ParkingSpotAssignmentStrategy {

	@Override
	public ParkingSpot assignParkingSpot(ParkingLot parkingLot, Vehicle vehicle) {
		return new ParkingSpot();
	}

}
