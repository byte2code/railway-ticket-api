package railway.com.example.RailwayAndMeal.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import railway.com.example.RailwayAndMeal.Entity.Ticket;
import railway.com.example.RailwayAndMeal.exceptions.TicketAlreadyExistsException;
import railway.com.example.RailwayAndMeal.exceptions.TicketNotFoundException;

@Service
public class RailwayService {

	public List<Ticket> list = new ArrayList<>();
	public Map<Long,Ticket> ticketMap = new HashMap<>();
	
	public void addTicket(Ticket ticket) {
	    if (ticketMap.containsKey(ticket.getPnr())) {
		throw new TicketAlreadyExistsException("Ticket already exists with pnr: " + ticket.getPnr());
	    }
	    list.add(ticket);
	    ticketMap.put(ticket.getPnr(), ticket);
	}
	
	/** This function returns a list of all tickets stored in the class. **/
	public List<Ticket> getAllTickets() {		
		return list;
	}
	
	public Ticket getTicketByPnr(long pnr) {
		if (ObjectUtils.isEmpty(ticketMap.get(pnr))) {
			throw new TicketNotFoundException("Not Found with pnr: " + pnr);
		}
		return ticketMap.get(pnr);
	}

	public void deleteTicketByPnr(long pnr) {
		Ticket ticket = getTicketByPnr(pnr);
		list.remove(ticket);
		ticketMap.remove(ticket.getPnr());
	}

	public void updateTicket(Ticket ticket) {
		Ticket existingTicket = getTicketByPnr(ticket.getPnr());
		list.remove(existingTicket);
		ticketMap.remove(existingTicket.getPnr());
		list.add(ticket);
		ticketMap.put(ticket.getPnr(), ticket);
	}
		
}
