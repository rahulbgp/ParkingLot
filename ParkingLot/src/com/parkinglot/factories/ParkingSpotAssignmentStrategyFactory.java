package com.parkinglot.factories;

import com.parkinglot.models.ParkingSpotStrategyType;
import com.parkinglot.strategies.NearestSpotAssignmentStrategy;
import com.parkinglot.strategies.ParkingSpotAssignmentStrategy;

public class ParkingSpotAssignmentStrategyFactory {
	public static ParkingSpotAssignmentStrategy getParkingLotStrategy(ParkingSpotStrategyType parkingSpotStrategyType) {
		if (parkingSpotStrategyType.equals(ParkingSpotStrategyType.NEAREST)) {
			return new NearestSpotAssignmentStrategy();
		}
		return null;
	}
}
