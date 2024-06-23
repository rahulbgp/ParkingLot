package com.parkinglot.strategies;

import com.parkinglot.models.ParkingLot;
import com.parkinglot.models.ParkingSpot;
import com.parkinglot.models.Vehicle;

public interface ParkingSpotAssignmentStrategy {
	ParkingSpot assignParkingSpot(ParkingLot parkingLot, Vehicle vehicle);

}
