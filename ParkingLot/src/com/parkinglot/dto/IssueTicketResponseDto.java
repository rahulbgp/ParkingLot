package com.parkinglot.dto;

import com.parkinglot.models.ResponseStatus;
import com.parkinglot.models.Ticket;

public class IssueTicketResponseDto {
	private Ticket ticket;
	private ResponseStatus reponseStatus;

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public ResponseStatus getReponseStatus() {
		return reponseStatus;
	}

	public void setReponseStatus(ResponseStatus reponseStatus) {
		this.reponseStatus = reponseStatus;
	}

}
