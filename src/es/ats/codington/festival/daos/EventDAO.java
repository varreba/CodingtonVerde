package es.ats.codington.festival.daos;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;


import es.ats.codington.festival.domain.Event;
import es.ats.codington.festival.interfaces.daos.IEventDAO;




public class EventDAO implements IEventDAO {

	
	

	
	
	@Override
	public int deleteEvent(int eventId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSeatsEventDec(int eventId) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSeatsEventInc(int eventId) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Event> showAllEvents() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Event> showMuseumEvents() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Event> showZooEvents() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Event> showParkEvents() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Event> showTheaterEvents() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Event> showStadiumEvents() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Event> showLargeBusinessEvents()
			throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Event> showTouristAttractionEvents()
			throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Event> showTraditionalMarketEvents()
			throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Event showEventById(int id) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertEvent(Event insertEvent) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEvent(Event updateEvent) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return 0;
	}

}
