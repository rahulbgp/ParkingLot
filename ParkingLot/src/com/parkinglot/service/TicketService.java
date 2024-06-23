package com.parkinglot.service;

import java.util.Date;
import java.util.Optional;

import com.parkinglot.exception.GateNotFoundException;
import com.parkinglot.models.Gate;
import com.parkinglot.models.ParkingLot;
import com.parkinglot.models.Ticket;
import com.parkinglot.models.Vehicle;
import com.parkinglot.repositories.GateRepository;
import com.parkinglot.repositories.VehicleRepository;
import com.parkinglot.strategies.ParkingSpotAssignmentStrategy;

public class TicketService {

	private GateRepository gateRepository;
	private VehicleRepository vehicleRepository;
	private ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy;

	public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy) {
		this.gateRepository = gateRepository;
		this.vehicleRepository = vehicleRepository;
		this.parkingSpotAssignmentStrategy = parkingSpotAssignmentStrategy;
	}

	public Ticket issueTicket(String vehicleNumber, Long gateId, String ownerName, Long operatorId)
			throws GateNotFoundException {
		Ticket ticket = new Ticket();
		ticket.setEntryTime(new Date());

		Optional<Vehicle> optionalVehicle = vehicleRepository.findVehicleByNumber(vehicleNumber);
		Vehicle vehicle = null;
		if (optionalVehicle.isEmpty()) {
			vehicle = new Vehicle();
			vehicle.setVehicleNumber(vehicleNumber);
			vehicle.setOwnerName(ownerName);
			vehicle = vehicleRepository.save(vehicle);
		} else {
			vehicle = optionalVehicle.get();
		}
		ticket.setVehicle(vehicle);

		Optional<Gate> optionalGate = gateRepository.findGateById(gateId);
		if (optionalGate.isEmpty()) {
			throw new GateNotFoundException("Pls enter valid gate Id");
		}
		Gate gate = optionalGate.get();
		ticket.setGate(gate);

		ParkingLot parkingLot = new ParkingLot();
		ticket.setParkingSpot(parkingSpotAssignmentStrategy.assignParkingSpot(parkingLot, vehicle));
		ticket.setOperator(gate.getOperator());

		return ticket;
	}
}
