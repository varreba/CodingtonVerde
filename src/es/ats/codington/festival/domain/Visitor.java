package es.ats.codington.festival.domain;

/**
 * VISITOR  class inherits common behavior from PEOPLE class
 */

public class Visitor extends People {


	/** Attributes
	 *  Encapsulated data fields for PEOPLE class 
	*/
	
	private int visitorID;
	private String userName;
	private String password;
	private boolean admin;
	
	/** Methods 
	 *  GETTER and SETTER methods for PLACES class
	 */
		
	public int getVisitorID() {
		return visitorID;
	}
	public void setVisitorID(int visitorID) {
		this.visitorID = visitorID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	//Constructor
	
	public Visitor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Visitor(String firstName, String lastName, String dni, String email,
			String phonenumber, String address) {
		super(firstName, lastName, dni, email, phonenumber, address);
		// TODO Auto-generated constructor stub
	}
	
	public Visitor(int visitorID, String userName, String password,
			boolean admin) {
		super();
		this.visitorID = visitorID;
		this.userName = userName;
		this.password = password;
		this.admin = admin;
	}
	
	
	
	
}
