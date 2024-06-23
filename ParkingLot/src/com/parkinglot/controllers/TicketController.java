package com.parkinglot.controllers;

import com.parkinglot.dto.IssueTicketRequestDto;
import com.parkinglot.dto.IssueTicketResponseDto;
import com.parkinglot.exception.GateNotFoundException;
import com.parkinglot.models.ResponseStatus;
import com.parkinglot.models.Ticket;
import com.parkinglot.service.TicketService;

public class TicketController {
	private TicketService ticketService;
	public TicketController(TicketService ticketService) {
		this.ticketService = ticketService;
	}
	public IssueTicketResponseDto issueTicket(IssueTicketRequestDto issueTicketRequestDto) {
		IssueTicketResponseDto responseDto = new IssueTicketResponseDto();
		try {
			 Ticket ticket =  ticketService.issueTicket(
					issueTicketRequestDto.getVehicleNumber(),
					issueTicketRequestDto.getGateId(), 
					issueTicketRequestDto.getOwnerName(),
					issueTicketRequestDto.getOperatorId());
			
			responseDto.setTicket(ticket);
			responseDto.setReponseStatus(ResponseStatus.SUCCESS);
		}
		
		catch (GateNotFoundException e) {
			responseDto.setReponseStatus(ResponseStatus.FAILURE);
		}
		return responseDto;
	}
}
