package es.ats.codington.festival.domain;

/**
 * This class is a POJO class for domain model. It contains people's personal information. 
 * @author: EquipoVerde
 * @version: 1.0   Feb 18, 2015
 * @see es.ats.codington.festival.domain.People
 * 
 */

public abstract class People {
	
	 /** Description of myIntFields
	  * Attributes of class People
	  */ 
		private String firstName;
		private String lastName;
		private String dni;
		private String email;
		private String phonenumber;
		private String address;
		
	/**
	 * Default constructor	
	 */
		
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}
		/**Constructed using fields
		 * @param firstName
		 * @param lastName
		 * @param dni
		 * @param email
		 * @param phonenumber
		 * @param address
		 */
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
		
	
	/**
	 * Get the visitor/admin's last name.
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * Set the visitor/admin's first name.
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * Get the visitor/admin's last name.
	 * @return lastname
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * Set the visitor/admin's last name.
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
/**
 * Get the visitor/admin's D.N.I.
 * @return dni
 */
	public String getDni() {
		return dni;
	}
	/**
	 * Set the visitor/admin's D.N.I.
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * Get the visitor/admin's email.
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Set the visitor/admin's email.
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Get the visitor/admin's phonenumber
	 * @return phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}
	/**
	 * Set the visitor/admin's phonenumber.
	 * @param phonenumber
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	/**
	 * Get the visitor/admin's address.
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * Set the visitor/admin's address.
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}

