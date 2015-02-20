package es.ats.codington.festival.services;

import java.util.ArrayList;
import java.util.List;

import es.ats.codington.festival.domain.Event;
import es.ats.codington.festival.interfaces.services.IEventSevice;

public class EventService implements IEventSevice {

	/**
	 * 
	 * @return List all events
	 */
	public List<Event> getAllEvents() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param id_event
	 * @return Search event
	 */
	public Event getEventById(int id_event) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param eventName
	 * @return list of events sought
	 */
	public ArrayList<Event> getEventsByName(String eventName) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param eventName
	 * @return list of events sought
	 */
	public ArrayList<Event> showEventsAsc(String eventName) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param event
	 * @return inserted event
	 */
	public Event insertEvent(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param event
	 * @return updated event
	 */
	public Event updateEvent(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param eventId
	 * @param sessionId
	 * @return deleted event
	 */
	public Event deleteEvent(int eventId, int sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
