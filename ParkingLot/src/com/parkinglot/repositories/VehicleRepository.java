package com.parkinglot.repositories;

import java.util.Optional;

import com.parkinglot.models.Vehicle;

public class VehicleRepository {

	public Vehicle save(Vehicle vehicle) {
		return null;
	}

	public Optional<Vehicle> findByVehicleId(Long id) {
		return Optional.empty();
	}

	public Optional<Vehicle> findVehicleByNumber(String vehicleNumber) {
		return Optional.empty();
	}

}
