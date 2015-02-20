package es.ats.codington.festival.interfaces.daos;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import es.ats.codington.festival.domain.Event;

public interface IEventDAO {
	
	/**
	 * Show all events.
	 * 
	 * @return ArrayList<Event> List of all events.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	public ArrayList<Event> showAllEvents() throws ClassNotFoundException, SQLException, IOException;
	
	/**
	 * Show museum events.
	 * 
	 * @return ArrayList<Event> List of museum events.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	public ArrayList<Event> showMuseumEvents() throws ClassNotFoundException, SQLException, IOException;
	
	/**
	 * Show zoo events.
	 * 
	 * @return ArrayList<Event> List of zoo events.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	public ArrayList<Event> showZooEvents() throws ClassNotFoundException, SQLException, IOException;
	
	 /**
	  * 
	  * Show park events.
	  * 
	  * @return ArrayList<Event> List of park events.
	  * @throws ClassNotFoundException
	  * @throws SQLException
	  * @throws IOException
	  */
	public ArrayList<Event> showParkEvents() throws ClassNotFoundException, SQLException, IOException;
	
	/**
	 * Show theater events.
	 * 
	 * @return ArrayList<Event> List of theater events.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	public ArrayList<Event> showTheaterEvents() throws ClassNotFoundException, SQLException, IOException;
	
	/**
	 * Show stadium events.
	 * 
	 * @return ArrayList<Event> Stadium events.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	
	public ArrayList<Event> showStadiumEvents() throws ClassNotFoundException, SQLException, IOException;

	/**
	 * Show large Business Events.
	 * 
	 * @return ArrayList<Event> Large business events.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	
	
	public ArrayList<Event> showLargeBusinessEvents() throws ClassNotFoundException, SQLException, IOException;
	
	/**
	 * Show Tourist atracction events.
	 * 
	 * @return  ArrayList<Event> Tourist attraction events.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	
	public ArrayList<Event> showTouristAttractionEvents() throws ClassNotFoundException, SQLException, IOException;
	
	/**
	 * Show Traditional market events.
	 * 
	 * @return ArrayList<Event> Traditional market events.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	public ArrayList<Event> showTraditionalMarketEvents() throws ClassNotFoundException, SQLException, IOException;
	
	/**
	 * 
	 * Show the events by id.
	 * 
	 * @param  id
	 * @return Event
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	public Event showEventById (int id) throws ClassNotFoundException, SQLException, IOException;

	/**
	 * Insert event into database.
	 * 
	 * @param insertEvent
	 * @return Event
	 */
	public int insertEvent(Event insertEvent);
	
	/**
	 * Delete event from database.
	 * 
	 * @param eventId
	 * @return int
	 */
	public int deleteEvent(int eventId);
   
	/**
	 * Update event in the database.
	 * 
	 * @param updateEvent
	 * @return int
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	public int updateEvent(Event updateEvent) throws ClassNotFoundException, SQLException, IOException;
	
	/**
	 * Decrease the seats of the event.
	 * 
	 * @param eventId
	 * @return int
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	
	public int updateSeatsEventDec(int eventId)  throws ClassNotFoundException, SQLException, IOException;

	/**
	 * Increase the seats of the event. 
	 * 
	 * @param eventId
	 * @return int
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	public int updateSeatsEventInc(int eventId)  throws ClassNotFoundException, SQLException, IOException;
}
