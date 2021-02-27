package com.service;

import org.springframework.context.annotation.Configuration;

import com.model.Ticket;;
@Configuration
public class TicketService {
	
	
	public double calculateTotalCost(Ticket ticket)
	{
		int priceQueen = 250;
		int priceKing = 150;
		int noOfTickets = ticket.getNoOfTickets();
		String circletype = ticket.getCircleType();
		double totalCost = 0;
		if(circletype.equals("King")) {
			totalCost = totalCost + (noOfTickets * 150);
		}else {
			totalCost = totalCost + (noOfTickets * 250);
		}
		return totalCost;
		
	}

}
	 	  	    	    	     	      	 	

