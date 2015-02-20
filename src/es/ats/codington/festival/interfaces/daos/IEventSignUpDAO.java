package es.ats.codington.festival.interfaces.daos;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.ats.codington.festival.domain.Event;
import es.ats.codington.festival.domain.EventSignUp;



public interface IEventSignUpDAO {
	/**
	 * 
	 * @param eventSignUp
	 * @return number of rows affected if register was successful 
	 */
	public int registerVisitorForNewEventDAO(EventSignUp eventSignUp);
	
	/**
	 * 
	 * @param e
	 * @return number of rows affected if register was successful 
	 */
	public boolean checkEventsofVisitorDAO(EventSignUp e);
	
	/**
	 * 
	 * @param eventSignUp
	 * @return number of rows affected if unregister was successful
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public int unregisterVisitorForEventDAO(EventSignUp eventSignUp);
	
	
	/**
	 * 
	 * @param e
	 * @return number of rows affected if user could delete an event successful
	 */
	public int deleteEventFromEventSignUpDAO(EventSignUp e);
	
	/**
	 * 
	 * @param e
	 * @return list of event of a eventvisitor 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Event> viewEventsOfUserDAO(EventSignUp e) throws SQLException;
	
	
	/**
	 * 
	 * @param resultSet
	 * @return list of all events
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */

	public ArrayList<EventSignUp> requestEventList(String sqlQuery) throws ClassNotFoundException,
	SQLException, IOException;
	
	public ArrayList<EventSignUp> showAllEventsUsersDAO() throws ClassNotFoundException,
	SQLException, IOException;

	public ArrayList<Event> showAllEventsForOneUsersDAO(EventSignUp eventSignUp) throws ClassNotFoundException,
	SQLException, IOException;
	
	public int updateRestSeatsAvailableEvent(EventSignUp e);



	public int updateSumSeatsAvailableEvent(EventSignUp e);



	public boolean checkSeatsForRestAvailableDAO(EventSignUp e);



	public boolean checkSeatsForSumAvailableDAO(EventSignUp e);
}
