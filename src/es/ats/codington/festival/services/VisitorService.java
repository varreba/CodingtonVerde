package es.ats.codington.festival.services;

import es.ats.codington.festival.interfaces.services.IVisitorSevice;

public class VisitorService implements IVisitorSevice {

	/**
	 * 
	 * @param eventId
	 * @param visitorId
	 * @return true if visitor could register successfully
	 */
	public boolean registerVisitorToEvent(int eventId, int visitorId) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 * @param eventId
	 * @param visitorId
	 * @return true if visitor could unregister successfully
	 */
	public boolean unregisterVisitor(int eventId, int visitorId) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 * @param visitor
	 * @return true if user could register successfully
	 */
	public boolean newVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 * @param userName
	 * @param password
	 * @return true if login was successful
	 */
	public Visitor searchVisitor(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param visitorId
	 * @param visitor
	 * @return true if visitor could update successfully
	 */
	public boolean updateVisitor(int visitorId, Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}

}
