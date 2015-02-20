package es.ats.codington.festival.daos;

import es.ats.codington.festival.domain.Visitor;
import es.ats.codington.festival.interfaces.daos.IVisitorDAO;

public class VisitorDAO implements IVisitorDAO {

	/**
	 * Insert visitor into database.
	 * 
	 * @param visitor
	 * @return true if visitor created
	 */
	public boolean createVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Search visitor
	 * @param userName
	 * @param password
	 * @return visitor found if not found
	 */
	public Visitor searchVisitor(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param visitorId
	 * @return updated visitor
	 */
	public Visitor UpdateVisitor(int visitorId) {
		// TODO Auto-generated method stub
		return null;
	}

}
