package railway.com.example.RailwayAndMeal.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import railway.com.example.RailwayAndMeal.Entity.Ticket;
import railway.com.example.RailwayAndMeal.exceptions.TicketAlreadyExistsException;
import railway.com.example.RailwayAndMeal.exceptions.TicketNotFoundException;

class RailwayServiceTest {

	@Test
	void managesTicketLifecycleInMemory() {
		RailwayService service = new RailwayService();
		Ticket original = new Ticket(1234567890L, "Aarav", 28, "LOWER");
		Ticket updated = new Ticket(1234567890L, "Aarav Sharma", 29, "UPPER");

		service.addTicket(original);

		assertEquals(1, service.getAllTickets().size());
		assertEquals("Aarav", service.getTicketByPnr(1234567890L).getName());

		service.updateTicket(updated);

		assertEquals(1, service.getAllTickets().size());
		assertEquals("Aarav Sharma", service.getTicketByPnr(1234567890L).getName());
		assertEquals("UPPER", service.getTicketByPnr(1234567890L).getBirth());

		service.deleteTicketByPnr(1234567890L);

		assertEquals(0, service.getAllTickets().size());
		assertThrows(TicketNotFoundException.class, () -> service.getTicketByPnr(1234567890L));
	}

	@Test
	void throwsWhenTicketAlreadyExists() {
		RailwayService service = new RailwayService();
		Ticket original = new Ticket(1234567890L, "Aarav", 28, "LOWER");

		service.addTicket(original);

		assertThrows(TicketAlreadyExistsException.class, () -> service.addTicket(original));
	}

	@Test
	void throwsWhenTicketIsMissing() {
		RailwayService service = new RailwayService();

		assertThrows(TicketNotFoundException.class, () -> service.getTicketByPnr(9999999999L));
		assertThrows(TicketNotFoundException.class, () -> service.deleteTicketByPnr(9999999999L));
	}
}
