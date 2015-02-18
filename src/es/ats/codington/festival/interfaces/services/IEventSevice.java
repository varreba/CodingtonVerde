package es.ats.codington.festival.interfaces.services;

import java.util.List;

public interface IEventSevice {
	
	/**
	 * 
	 * @return List all events
	 */
	public List<Event> getAllEvents();
	
	/**
	 * 
	 * @param id_event
	 * @return Search event
	 */
	public Event getEventById(int id_event);
	
	/**
	 * 
	 * @param eventName
	 * @return list of events sought
	 */
	public ArrayList<Event> getEventsByName(String eventName);
	
	/**
	 * 
	 * @param eventName
	 * @return list of events sought
	 */
	public ArrayList<Event> showEventsAsc(String eventName);
	
	/**
	 * 
	 * @param event
	 * @return inserted event
	 */
	public Event insertEvent(Event event);
	
	/**
	 * 
	 * @param event
	 * @return updated event
	 */
	public Event updateEvent(Event event);
	
	/**
	 * 
	 * @param eventId
	 * @param sessionId
	 * @return deleted event
	 */
	public Event deleteEvent(int eventId, int sessionId);
	//public boolean checkRegisteredEvents(int eventId, int visitorId);
}
