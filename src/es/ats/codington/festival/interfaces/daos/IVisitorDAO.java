package es.ats.codington.festival.interfaces.daos;

import es.ats.codington.festival.domain.Visitor;

public interface IVisitorDAO {
	
	/**
	 * Insert visitor into database.
	 * 
	 * @param visitor
	 * @return true if visitor created
	 */
	public boolean createVisitor(Visitor visitor);
	
	/**
	 * Search visitor
	 * @param userName
	 * @param password
	 * @return visitor found if not found
	 */
	public Visitor searchVisitor(String userName, String password);
	
	/**
	 * 
	 * @param visitorId
	 * @return updated visitor
	 */
	public Visitor UpdateVisitor(int visitorId);

}
