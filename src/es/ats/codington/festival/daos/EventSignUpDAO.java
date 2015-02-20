package es.ats.codington.festival.daos;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.ats.codington.festival.interfaces.daos.Event;
import es.ats.codington.festival.interfaces.daos.EventSignUp;
import es.ats.codington.festival.interfaces.daos.IEventSignUpDAO;

public class EventSignUpDAO implements IEventSignUpDAO {

	@Override
	public int registerVisitorForNewEventDAO(EventSignUp e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkEventsofVisitorDAO(EventSignUp e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int unregisterVisitorForEventDAO(EventSignUp e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEventFromEventSignUpDAO(EventSignUp e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Event> viewEventsOfUserDAO(EventSignUp e) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<EventSignUp> requestEventList(String sqlQuery)
			throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<EventSignUp> showAllEventsUsersDAO()
			throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Event> showAllEventsForOneUsersDAO(EventSignUp eventSignUp)
			throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateRestSeatsAvailableEvent(EventSignUp e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSumSeatsAvailableEvent(EventSignUp e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkSeatsForRestAvailableDAO(EventSignUp e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkSeatsForSumAvailableDAO(EventSignUp e) {
		// TODO Auto-generated method stub
		return false;
	}

}
