package es.ats.codington.festival.interfaces.services;

/**
 * 
 * @author JAVA101_01
 *
 */
public interface IVisitorSevice {
	
	/**
	 * 
	 * @param visitor
	 * @return true if user could register successfully
	 */
	public boolean newVisitor(Visitor visitor);
	
	/**
	 * 
	 * @param userName
	 * @param password
	 * @return true if login was successful
	 */
	public Visitor searchVisitor(String userName,String password);
	
	/**
	 * 
	 * @param visitorId
	 * @param visitor
	 * @return true if visitor could update successfully
	 */
	public boolean updateVisitor(int visitorId, Visitor visitor);
	
	/**
	 * 
	 * @param eventId
	 * @param visitorId
	 * @return true if visitor could register successfully
	 */
	public boolean registerVisitorToEvent(int eventId,int visitorId);
	
	/**
	 * 
	 * @param eventId
	 * @param visitorId
	 * @return true if visitor could unregister successfully
	 */
	public boolean unregisterVisitor(int eventId,int visitorId);
}
