package com.parkinglot.main;

import com.parkinglot.controllers.TicketController;
import com.parkinglot.dto.IssueTicketRequestDto;
import com.parkinglot.dto.IssueTicketResponseDto;
import com.parkinglot.factories.ParkingSpotAssignmentStrategyFactory;
import com.parkinglot.models.ParkingSpotStrategyType;
import com.parkinglot.models.Ticket;
import com.parkinglot.repositories.GateRepository;
import com.parkinglot.repositories.VehicleRepository;
import com.parkinglot.service.TicketService;
import com.parkinglot.strategies.ParkingSpotAssignmentStrategy;

public class Main {
	public static void main(String[] args) {
		VehicleRepository vehicleRepository = new VehicleRepository();
		GateRepository gateRepository = new GateRepository();
		ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy = ParkingSpotAssignmentStrategyFactory.getParkingLotStrategy(ParkingSpotStrategyType.NEAREST);
		TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingSpotAssignmentStrategy);
		
		TicketController ticketController = new TicketController(ticketService);
		
		
		IssueTicketRequestDto issueTicketRequestDto = new IssueTicketRequestDto();
		issueTicketRequestDto.setGateId(123L);
		issueTicketRequestDto.setOperatorId(345L);
		issueTicketRequestDto.setOwnerName("Rahul");
		issueTicketRequestDto.setVehicleNumber("BR10AF2345");
		
		IssueTicketResponseDto responseDto = ticketController.issueTicket(issueTicketRequestDto);
		Ticket ticket =  responseDto.getTicket();
		System.out.println(ticket);
		
	}

}
