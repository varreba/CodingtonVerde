package es.ats.codington.festival.domain;

/**
 * People POJO class for domain model 
 */

public abstract class People {
	

	// Attributes
	
		// Encapsulated data fields of PLACE object
		private String firstName;
		private String lastName;
		private String dni;
		private String email;
		private String phonenumber;
		private String address;
	

	/** Methods 
	 *  GETTER and SETTER methods for PLACES class
	 */
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//Constructor
	
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}
	public People(String firstName, String lastName, String dni, String email,
			String phonenumber, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dni = dni;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
	}
	
	
	

}
